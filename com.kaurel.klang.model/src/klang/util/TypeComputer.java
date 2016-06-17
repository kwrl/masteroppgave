package klang.util;

import java.lang.reflect.Method;

import klang.BinaryOperator;
import klang.BooleanLiteral;
import klang.Expression;
import klang.NumericLiteral;
import klang.StringLiteral;
import klang.UnaryOperator;
import klang.VariableRef;

@SuppressWarnings("rawtypes")
public class TypeComputer extends KlangSwitch<Class> {
	private static final Class operatorClass = Operators.class;

	public Class computeType(Expression expression) {
		return doSwitch(expression);
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
	public Class caseNumericLiteral(NumericLiteral object) {
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
		return super.caseBinaryOperator(object);
	}
	
	@Override
	public Class caseVariableRef(VariableRef object) {
		return doSwitch(object.getVariable().getExpression());
	}
	
}
