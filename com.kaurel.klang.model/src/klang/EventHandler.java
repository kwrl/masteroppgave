/**
 */
package klang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import klangexpr.Statement;

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
 * </ul>
 *
 * @see klang.KlangPackage#getEventHandler()
 * @model abstract="true"
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
	AbstractActor getActor();

} // EventHandler
