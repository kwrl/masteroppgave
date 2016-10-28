/**
 */
package klang;

import klangexpr.Statement;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.EventHandler#getStatements <em>Statements</em>}</li>
 *   <li>{@link klang.EventHandler#getActor <em>Actor</em>}</li>
 *   <li>{@link klang.EventHandler#getReferenceEvent <em>Reference Event</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getEventHandler()
 * @model
 * @generated
 */
public interface EventHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link klangexpr.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see klang.KlangPackage#getEventHandler_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link klang.AbstractActor#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' container reference.
	 * @see klang.KlangPackage#getEventHandler_Actor()
	 * @see klang.AbstractActor#getEventHandlers
	 * @model opposite="eventHandlers" required="true" transient="false" changeable="false"
	 * @generated
	 */
	AbstractActor<?> getActor();

	/**
	 * Returns the value of the '<em><b>Reference Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Event</em>' containment reference.
	 * @see #setReferenceEvent(Event)
	 * @see klang.KlangPackage#getEventHandler_ReferenceEvent()
	 * @model containment="true"
	 * @generated
	 */
	Event getReferenceEvent();

	/**
	 * Sets the value of the '{@link klang.EventHandler#getReferenceEvent <em>Reference Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Event</em>' containment reference.
	 * @see #getReferenceEvent()
	 * @generated
	 */
	void setReferenceEvent(Event value);

} // EventHandler
