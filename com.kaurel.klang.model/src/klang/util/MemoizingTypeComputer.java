package klang.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public class MemoizingTypeComputer extends TypeComputer {
	private Map<EObject, Class<?>> cache = new HashMap<>();
	
	@Override
	public Class<?> doSwitch(EObject eObject) {
		if(cache.containsKey(eObject)) {
			return cache.get(eObject);
		}
		Class<?> type = super.doSwitch(eObject);
		cache.put(eObject, type);
		
		return type;
	}
}
