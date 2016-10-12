package com.kaurel.klang.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import klang.AbstractActor;
import klang.util.KlangUtil;
import klang.util.MemoizingTypeComputer;
import klang.util.OperatorUtil;
import klang.util.TypeComputer;
import klangexpr.BinaryOperator;
import klangexpr.BooleanLiteral;
import klangexpr.DoubleLiteral;
import klangexpr.Expression;
import klangexpr.FunctionCall;
import klangexpr.IntegerLiteral;
import klangexpr.StringLiteral;
import klangexpr.UnaryOperator;
import klangexpr.VariableReference;
import klangexpr.util.KlangexprSwitch;

public class ExpressionEvaluatorImpl extends KlangexprSwitch<Object> implements ExpressionEvaluator {
	private final TypeComputer typeComputer = new MemoizingTypeComputer();
	private final AbstractActor  actor;
	
	public ExpressionEvaluatorImpl(AbstractActor actor) {
		this.actor = actor;
	}

	@Override
	public Object evaluate(Expression expression) {
		return doSwitch(expression);
	}

	@Override
	public String evaluateString(Expression expression) {
		return (String) evaluate(expression);
	}

	@Override
	public Boolean evaluateBoolean(Expression expression) {
		return (Boolean) evaluate(expression);
	}

	@Override
	public Object[] evaluate(Expression[] expressions) {
		Object[] values = new Object[expressions.length];
		for (int i = 0; i < expressions.length; i++) {
			values[i] = evaluate(expressions[i]);
		}
		return values;
	}

	@Override
	public Object[] evaluate(List<Expression> expressions) {
		return evaluate((Expression[]) expressions.toArray());
	}

	@Override
	public Object caseFunctionCall(FunctionCall object) {
		Method method = null;
		KlangUtil.getActor(object);
		try {
			method = actor.getSubject().getClass().getMethod(object.getName(),
					typeComputer.computeTypes(object.getParameters()));
			return method.invoke(actor.getSubject(), evaluate(object.getParameters()));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
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
		if(actor.isInScope(object.getVariableName())) {
			return actor
					.getVariableDeclaration(object.getVariableName())
					.getValue();
		}
		return null;
	}

	@Override
	public Integer evaluateInteger(Expression expression) {
		return (Integer) evaluate(expression);
	}

	@Override
	public Double evaluateDouble(Expression expression) {
		return (Double) evaluate(expression);
	}
}
