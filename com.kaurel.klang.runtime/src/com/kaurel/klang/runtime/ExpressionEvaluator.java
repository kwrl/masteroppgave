package com.kaurel.klang.runtime;

import java.util.List;

import klang.Expression;

public interface ExpressionEvaluator {
	public Object evaluate(Expression expression);
	public Object[] evaluate(Expression[] expressions);
	public Object[] evaluate(List<Expression> expressions);
	public Integer evaluateInteger(Expression expression);
	public Double evaluateDouble(Expression expression);
	public String evaluateString(Expression expression);
	public Boolean evaluateBoolean(Expression expression);
}
