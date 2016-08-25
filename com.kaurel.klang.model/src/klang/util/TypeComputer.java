package klang.util;

import java.lang.reflect.Method;
import java.util.List;

import klang.BinaryOperator;
import klang.BooleanLiteral;
import klang.DoubleLiteral;
import klang.Entity;
import klang.Expression;
import klang.FunctionCall;
import klang.IntegerLiteral;
import klang.StringLiteral;
import klang.UnaryOperator;
import klang.VariableReference;

@SuppressWarnings("rawtypes")
public class TypeComputer extends KlangSwitch<Class> {
	private static final Class operatorClass = Operators.class;

	public Class computeType(Expression expression) {
		Class type = doSwitch(expression);
		if (type == null) {
			System.err.println("Invalid type " + expression);
		}
		return type;
	}

	public Class[] computeTypes(List<Expression> expressions) {
		return computeTypes((Expression[]) expressions.toArray());
	}

	public Class[] computeTypes(Expression[] expressions) {
		Class[] types = new Class[expressions.length];
		for (int i = 0; i < expressions.length; i++) {
			types[i] = computeType(expressions[i]);
		}
		return types;
	}

	@Override
	public Class caseBooleanLiteral(BooleanLiteral object) {
		return Boolean.class;
	}

	@Override
	public Class caseStringLiteral(StringLiteral object) {
		return String.class;
	}

	@Override
	public Class caseIntegerLiteral(IntegerLiteral object) {
		return Integer.class;
	}

	@Override
	public Class caseDoubleLiteral(DoubleLiteral object) {
		return Double.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class caseUnaryOperator(UnaryOperator object) {
		try {
			Method method = operatorClass.getMethod(object.getClass().getSimpleName(),
					computeType(object.getExpression()));
			return method.getReturnType();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return super.caseUnaryOperator(object);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class caseBinaryOperator(BinaryOperator object) {
		try {
			Method method = operatorClass.getMethod(object.getClass().getSimpleName(), computeType(object.getLeft()),
					computeType(object.getRight()));
			return method.getReturnType();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Class caseVariableReference(VariableReference object) {
		if (object.getActor().isInScope(object.getVariableName())) {
			return computeType(object.getActor().getVariableDeclaration(object.getVariableName()).getExpression());
		}
		return null;
	}

	@Override
	public Class caseFunctionCall(FunctionCall object) {
		Method method = null;
		try {
			method = object.getActor().getClass().getMethod(object.getName(), computeTypes(object.getParameters()));
			return method.getReturnType();
		} catch (NoSuchMethodException | SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
		}
		return null;
	}

}
