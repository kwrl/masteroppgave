package com.kaurel.klang.runtime.threading;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kaurel.klang.runtime.KlangInterpreter;
import com.kaurel.klang.runtime.events.MessageEvent;
import com.kaurel.klang.runtime.threading.Scheduler.SchedulerPass;

import klang.AbstractActor;
import klang.util.OperatorUtil;
import klangexpr.BinaryOperator;
import klangexpr.BooleanLiteral;
import klangexpr.DoubleLiteral;
import klangexpr.Expression;
import klangexpr.ForeverLoop;
import klangexpr.FunctionCall;
import klangexpr.If;
import klangexpr.IntegerLiteral;
import klangexpr.KlangexprFactory;
import klangexpr.SendMessage;
import klangexpr.Sleep;
import klangexpr.Statement;
import klangexpr.StringLiteral;
import klangexpr.UnaryOperator;
import klangexpr.VariableAssignment;
import klangexpr.VariableReference;
import klangexpr.WhileLoop;
import klangexpr.Yield;
import klangexpr.util.KlangexprSwitch;

public class ProcessorImpl extends KlangexprSwitch<Object> implements Processor {
	private KlangInterpreter interpreter;
	private KlangThread thread;

	public ProcessorImpl(KlangInterpreter interpreter) {
		this.interpreter = interpreter;
	}

	@Override
	public void initializeVariables(AbstractActor actor) {
		actor.getLocalVariables()
				.stream()
				.forEach(decl -> decl.setValue(evaluate(decl.getExpression())));
	}

	@Override
	public void initializeAllVariables(AbstractActor rootActor) {
		rootActor.traverseBFS()
				.stream()
				.flatMap(a -> a.getLocalVariables().stream())
				.forEach(decl -> decl.setValue(evaluate(decl.getExpression())));
	}

	@Override
	public void processSingleThread() {
		if (!getSchedulerPass().isDone()) {
			processThread(thread);
		}
	}

	@Override
	public void processSchedulerPass() {
		SchedulerPass pass = getSchedulerPass();

		while (!pass.isDone()) {
			processThread(pass.current());
		}
	}

	private void processThread(KlangThread thread) {
		Statement current;
		Scheduler scheduler = interpreter.getScheduler();

		setThread(thread);

		while ((current = thread.poll()) != null) {
			if (current instanceof Yield) {
				scheduler.yield();
				break;
			}

			if (current instanceof Sleep) {
				long duration = (long) evaluate(((Sleep) current).getDuration()) * 1000;
				scheduler.sleep(duration);
				break;
			}

			doSwitch(current);
		}

		scheduler.terminate();
	}

	@Override
	public Void caseWhileLoop(WhileLoop object) {
		if (evaluateBoolean(object.getPredicate())) {
			thread.addFirst(object);
			thread.addFirst(KlangexprFactory.eINSTANCE.createYield());
			thread.addAllFirst(object.getStatements());
		}
		return null;
	}

	@Override
	public Void caseForeverLoop(ForeverLoop object) {
		thread.addFirst(object);
		thread.addFirst(KlangexprFactory.eINSTANCE.createYield());
		thread.addAllFirst(object.getStatements());
		return null;
	}

	@Override
	public Void caseIf(If object) {
		if (evaluateBoolean(object.getPredicate())) {
			thread.addAllFirst(object.getIfBlock());
		} else {
			thread.addAllFirst(object.getElseBlock());
		}
		return null;
	}

	@Override
	public Void caseVariableAssignment(VariableAssignment object) {
		if (thread.getActor().isInScope(object.getVariableName())) {
			thread.getActor().getVariableDeclaration(object.getVariableName())
					.setValue(evaluate(object.getExpression()));
		}
		return null;
	}

	@Override
	public Void caseSendMessage(SendMessage object) {
		interpreter.onMessageReceived(new MessageEvent(object.getName()));
		return null;
	}

	public Object evaluate(Expression expression) {
		return doSwitch(expression);
	}

	public String evaluateString(Expression expression) {
		return (String) evaluate(expression);
	}

	public Boolean evaluateBoolean(Expression expression) {
		return (Boolean) evaluate(expression);
	}

	public Object[] evaluate(Expression[] expressions) {
		Object[] values = new Object[expressions.length];
		for (int i = 0; i < expressions.length; i++) {
			values[i] = evaluate(expressions[i]);
		}
		return values;
	}

	public Object[] evaluate(List<Expression> expressions) {
		return evaluate((Expression[]) expressions.toArray());
	}

	// Cache methods to avoid overhead of getMethod upon every function call
	private Map<FunctionCall, Method> methodCache = new HashMap<>();

	@Override
	public Object caseFunctionCall(FunctionCall object) {
		Object[] parameters = evaluate(object.getParameters());
		AbstractActor actor = getActor();

		if (!methodCache.containsKey(object)) {
			try {
				methodCache.put(object, getActor().getSubject().getClass().getMethod(object.getName(),
						getTypeSignature(parameters)));
			} catch (NoSuchMethodException | SecurityException | IllegalArgumentException e) {
				e.printStackTrace();
			}
		}

		try {
			return methodCache.get(object).invoke(getActor().getSubject(), parameters);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

		return null;
	}

	private Class<?>[] getTypeSignature(Object... parameters) {
		Class<?>[] types = new Class<?>[parameters.length];

		for (int i = 0; i < parameters.length; i++) {
			types[i] = parameters[i].getClass();
		}

		return types;
	}

	@Override
	public Object caseBooleanLiteral(BooleanLiteral object) {
		return object.isValue();
	}

	@Override
	public Object caseStringLiteral(StringLiteral object) {
		return object.getValue();
	}

	@Override
	public Object caseDoubleLiteral(DoubleLiteral object) {
		return object.getValue();
	}

	@Override
	public Object caseIntegerLiteral(IntegerLiteral object) {
		return object.getValue();
	}

	@Override
	public Object caseUnaryOperator(UnaryOperator object) {
		return OperatorUtil.invokeOperator(object, evaluate(object.getExpression()));
	}

	@Override
	public Object caseBinaryOperator(BinaryOperator object) {
		return OperatorUtil.invokeOperator(object, evaluate(object.getLeft()), evaluate(object.getRight()));
	}

	@Override
	public Object caseVariableReference(VariableReference object) {
		if (getActor().isInScope(object.getVariableName())) {
			return getActor()
					.getVariableDeclaration(object.getVariableName())
					.getValue();
		}
		return null;
	}

	private Integer evaluateInteger(Expression expression) {
		return (Integer) evaluate(expression);
	}

	private Double evaluateDouble(Expression expression) {
		return (Double) evaluate(expression);
	}

	private SchedulerPass getSchedulerPass() {
		return interpreter.getScheduler().getCurrentPass();
	}

	private void setThread(KlangThread thread) {
		this.thread = thread;
	}

	private AbstractActor getActor() {
		return getThread().getActor();
	}

	private KlangThread getThread() {
		return thread;
	}

}