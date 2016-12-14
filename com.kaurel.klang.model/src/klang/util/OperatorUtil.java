package klang.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import klangexpr.Operator;

public class OperatorUtil {
	private static Class<?> implementationClass = OperatorImpl.class;
	
	public static <T extends Operator> Object invokeOperator(T operator, Object ... operands) {
		Method method = getMethod(operator.getClass(), getSignature(operands));
		
		if(method == null) {
			return null;
		}
		
		try {
			return method.invoke(null, operands);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static <T extends Operator> Class<?> getOperatorReturnType(T operator, Class<?> ... operands) {
		Method method = getMethod(operator.getClass(), operands);
		if(method == null) {
			return null;
		}
		return method.getReturnType();
	}

	private static Map<Integer, Method> methodCache = new HashMap<>();
	//TODO: add caching, because premature optimization is the root of all fun
	private static Method getMethod(Class<? extends Operator> operator, Class<?> ... operands) {
		int hashCode = operator.hashCode();
		for(Class<?> operand : operands) {
			hashCode = hashCode * 37 + operand.hashCode();
		}
		if(methodCache.containsKey(hashCode)) {
			return methodCache.get(hashCode);
		}
		try {
			Method method = implementationClass.getMethod(methodName(operator), operands);
			methodCache.put(hashCode, method);
			return method;
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static <T extends Operator> String methodName(Class<? extends Operator> operator) {
		return operator.getSimpleName();
	}
	
	private static Class<?>[] getSignature(Object ... objects) {
		Class<?>[] signature = new Class<?>[objects.length];
		for(int i = 0; i < objects.length; i++) {
			signature[i] = objects[i].getClass();
		}
		return signature;
	}
}
