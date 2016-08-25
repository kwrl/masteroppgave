package com.kaurel.klang.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import klang.AbstractActor;
import klang.BinaryOperator;
import klang.BooleanLiteral;
import klang.DoubleLiteral;
import klang.Entity;
import klang.Expression;
import klang.FunctionCall;
import klang.StringLiteral;
import klang.UnaryOperator;
import klang.VariableReference;
import klang.util.KlangSwitch;
import klang.util.MemoizingTypeComputer;
import klang.util.Operators;
import klang.util.TypeComputer;

public class ExpressionEvaluatorImpl extends KlangSwitch<Object> implements ExpressionEvaluator {
	private static final Class operatorClass = Operators.class;
	private final TypeComputer typeComputer = new MemoizingTypeComputer();
	private final AbstractActor<?>  actor;
	
	public ExpressionEvaluatorImpl(AbstractActor<?> actor) {
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
		try {
			method = object.getActor().getSubject().getClass().getMethod(object.getName(),
					typeComputer.computeTypes(object.getParameters()));
			return method.invoke(object.getActor().getSubject(), evaluate(object.getParameters()));
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

	@SuppressWarnings("unchecked")
	@Override
	public Object caseUnaryOperator(UnaryOperator object) {
		try {
			Method method = operatorClass.getMethod(object.getClass().getSimpleName(),
					typeComputer.computeType(object.getExpression()));
			return method.invoke(null, evaluate(object.getExpression()));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return super.caseUnaryOperator(object);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object caseBinaryOperator(BinaryOperator object) {
		Expression left, right;
		left = object.getLeft();
		right = object.getRight();

		Class leftType, rightType;
		leftType = typeComputer.computeType(left);
		rightType = typeComputer.computeType(right);
		
		try {
			Method method = operatorClass.getMethod(object.getClass().getSimpleName(), leftType, rightType);
			return method.invoke(null, evaluate(left), evaluate(right));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
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