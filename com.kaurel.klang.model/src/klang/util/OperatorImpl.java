package klang.util;

public class OperatorImpl {

	//Convert
	public static Double ToDoubleImpl(Integer value) {
		return value.doubleValue();
	}
	
	public static Double ToDoubleImpl(Double value) {
		return value;
	}
	
	public static Integer ToIntImpl(Double value) {
		return value.intValue();
	}
	
	public static Integer ToIntImpl(Integer value) {
		return value;
	}
	
	// Plus
	public static Double PlusImpl(Double left, Double right) {
		return left + right;
	}
	
	public static Integer PlusImpl(Integer left, Integer right) {
		return left + right;
	}

	public static String PlusImpl(String left, String right) {
		return left + right;
	}
	
	public static String PlusImpl(String left, Double right) {
		return left + right;
	}
	
	public static String PlusImpl(Double left, String right)  {
		return left + right;
	}
	
	public static String PlusImpl(String left, Integer right) {
		return left + right;
	}
	
	public static String PlusImpl(Integer left, String right) {
		return left + right;
	}
	
	public static String PlusImpl(String left, Boolean right) {
		return left + right;
	}
	
	public static String PlusImpl(Boolean left, String right) {
		return left + right;
	}

	//Binary Minus
	public static Double MinusImpl(Double left, Double right) {
		return left - right;
	}
	
	public static Integer MinusImpl(Integer left, Integer right) {
		return left - right;
	}
	
	//Unary Minus
	public static Double UnaryMinusImpl(Double value) {
		return - value;
	}
	
	public static Integer UnaryMinusImpl(Integer value) {
		return - value;
	}

	//Multiply
	public static Double MultiplyImpl(Double left, Double right) {
		return left * right;
	}
	
	public static Integer MultiplyImpl(Integer left, Integer right) {
		return left * right;
	}
	

	//Divide
	public static Double DivideImpl(Double left, Double right) {
		return left / right;
	}
	
	public static Integer DivideImpl(Integer left, Integer right) {
		return left / right;
	}

	//Not
	public static Boolean NotImpl(Boolean value) {
		return !value;
	}

	//And
	public static Boolean AndImpl(Boolean left, Boolean right) {
		return left && right;
	}

	//Or
	public static Boolean OrImpl(Boolean left, Boolean right) {
		return left || right;
	}

	//Less than
	public static Boolean LessThanImpl(Double left, Double right) {
		return left < right;
	}
	
	public static Boolean LessThanImpl(Integer left, Integer right) {
		return left < right;
	}
	
	public static Boolean LessThanImpl(Double left, Integer right) {
		return left < right;
	}
	
	public static Boolean LessThanImpl(Integer left, Double right) {
		return left < right;
	}

	//Greater than
	public static Boolean GreaterThanImpl(Double left, Double right) {
		return left > right;
	}
	
	public static Boolean GreaterThanImpl(Integer left, Integer right) {
		return left > right;
	}
	
	public static Boolean GreaterThanImpl(Integer left, Double right) {
		return left > right;
	}
	
	public static Boolean GreaterThanImpl(Double left, Integer right) {
		return left > right;
	}
	
	//Equality
	public static Boolean EqualImpl(Double left, Double right) {
		return left.equals(right);
	}
	
	public static Boolean EqualImpl(Integer left, Integer right) {
		return left.equals(right);
	}

	public static Boolean EqualImpl(Boolean left, Boolean right) {
		return left.equals(right);
	}
	
	public static Boolean EqualImpl(String left, String right) {
		return left.equals(right);
	}
}
