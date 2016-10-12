package klang.util;

import org.eclipse.emf.ecore.EObject;

import klang.AbstractActor;
import klangexpr.AbstractElement;

public class KlangUtil {
	public static AbstractActor getActor(AbstractElement element) {
		EObject current = element;
		while(current!=null && !(current instanceof AbstractActor)) {
			current = current.eContainer();
		}
		return (AbstractActor) current;
	}
}
