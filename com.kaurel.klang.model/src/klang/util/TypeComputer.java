package klang.util;

import java.lang.reflect.Method;
import java.util.List;

import klang.AbstractActor;
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

public class TypeComputer extends KlangexprSwitch<Class<?>> {
	public Class<?> computeType(Expression expression) {
		Class<?> type = doSwitch(expression);
		if (type == null) {
			System.err.println("Invalid type " + expression);
		}
		return type;
	}

	public Class<?>[] computeTypes(List<Expression> expressions) {
		return computeTypes((Expression[]) expressions.toArray());
	}

	public Class<?>[] computeTypes(Expression ... expressions) {
		Class<?>[] types = new Class[expressions.length];
		for (int i = 0; i < expressions.length; i++) {
			types[i] = computeType(expressions[i]);
		}
		return types;
	}

	@Override
	public Class<?> caseBooleanLiteral(BooleanLiteral object) {
		return Boolean.class;
	}

	@Override
	public Class<?> caseStringLiteral(StringLiteral object) {
		return String.class;
	}

	@Override
	public Class<?> caseIntegerLiteral(IntegerLiteral object) {
		return Integer.class;
	}

	@Override
	public Class<?> caseDoubleLiteral(DoubleLiteral object) {
		return Double.class;
	}

	@Override
	public Class<?> caseUnaryOperator(UnaryOperator object) {
		return OperatorUtil.getOperatorReturnType(object, computeType(object.getExpression()));
	}

	@Override
	public Class<?> caseBinaryOperator(BinaryOperator object) {
		return OperatorUtil.getOperatorReturnType(object, computeTypes(object.getLeft(), object.getRight()));
	}

	@Override
	public Class<?> caseVariableReference(VariableReference object) {
		AbstractActor<?> actor = KlangUtil.getActor(object);
		if (actor.isInScope(object.getVariableName())) {
			return computeType(actor.getVariableDeclaration(object.getVariableName()).getExpression());
		}
		return null;
	}

	@Override
	public Class<?> caseFunctionCall(FunctionCall object) {
		Method method = null;
		AbstractActor<?> actor = KlangUtil.getActor(object);
		try {
			method = actor.getSubjectType().getMethod(object.getName(), computeTypes(object.getParameters()));
			return method.getReturnType();
		} catch (NoSuchMethodException | SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
		}
		return null;
	}

}
