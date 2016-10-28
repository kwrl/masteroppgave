/**
 */
package klang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see klang.KlangPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends Event> boolean matchingEvent(T other);
} // Event
