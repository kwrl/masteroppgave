package klang.util;

import org.eclipse.emf.ecore.EObject;

import klang.AbstractActor;

public class KlangUtil {
	public static AbstractActor<?> getActor(EObject element) {
		EObject current = element;
		while(current!=null && !(current instanceof AbstractActor)) {
			current = current.eContainer();
		}
		return (AbstractActor<?>) current;
	}
}
