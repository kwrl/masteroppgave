package klang.util;

import klang.BinaryOperator;
import klang.BooleanLiteral;
import klang.NumericLiteral;
import klang.StringLiteral;
import klang.UnaryOperator;

@SuppressWarnings("rawtypes")
public class TypeComputer extends KlangSwitch<Class>{
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
	
	@Override
	public Class caseUnaryOperator(UnaryOperator object) {
		return super.caseUnaryOperator(object);
	}
	
	@Override
	public Class caseBinaryOperator(BinaryOperator object) {
		return super.caseBinaryOperator(object);
	}
}
