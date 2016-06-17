package klang.util;

public class Operators {
	public static Double PlusImpl(Double left, Double right) {
		return left + right;
	}
	
	public static Double MinusImpl(Double left, Double right) {
		return left - right;
	}
	
	public static Double MultiplyImpl(Double left, Double right) {
		return left * right;
	}
	
	public static Double DivideImpl(Double left, Double right) {
		return left / right;
	}
	
	public static String PlusImpl(String left, String right) {
		return left + right;
	}
	
	public static String PlusImpl(String left, Double right) {
		return left + right;
	}
	
	public static String PlusImpl(Double left, String right) {
		return left + right;
	}
	
	public static String PlusImpl(String left, Boolean right) {
		return left + right;
	}
	
	public static String PlusImpl(Boolean left, String right) {
		return left + right;
	}
	
	public static Boolean NotImpl(Boolean value) {
		return !value;
	}
	
	public static Boolean AndImpl(Boolean left, Boolean right) {
		return left && right;
	}
	
	public static Boolean OrImpl(Boolean left, Boolean right) {
		return left || right;
	}
	
	public static Boolean LessThanImpl(Double left, Double right) {
		return left < right;
	}
	
	public static Boolean GreaterThanImpl(Double left, Double right) {
		return left > right;
	}
	
	public static Boolean EqualsImpl(Double left, Double right) {
		return left == right;
	}
	
	public static Boolean EqualsImpl(Boolean left, Boolean right) {
		return left == right;
	}
}
