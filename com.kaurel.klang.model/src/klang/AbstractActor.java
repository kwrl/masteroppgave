/**
 */
package klang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.AbstractActor#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link klang.AbstractActor#getName <em>Name</em>}</li>
 *   <li>{@link klang.AbstractActor#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getAbstractActor()
 * @model abstract="true"
 * @generated
 */
public interface AbstractActor<A extends AbstractActor<?>> extends Scope<A> {
	/**
	 * Returns the value of the '<em><b>Event Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link klang.EventHandler}.
	 * It is bidirectional and its opposite is '{@link klang.EventHandler#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Handlers</em>' containment reference list.
	 * @see klang.KlangPackage#getAbstractActor_EventHandlers()
	 * @see klang.EventHandler#getActor
	 * @model opposite="actor" containment="true"
	 * @generated
	 */
	EList<EventHandler> getEventHandlers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see klang.KlangPackage#getAbstractActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link klang.AbstractActor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(Object)
	 * @see klang.KlangPackage#getAbstractActor_Subject()
	 * @model transient="true"
	 * @generated
	 */
	Object getSubject();

	/**
	 * Sets the value of the '{@link klang.AbstractActor#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<AbstractActor<?>> getSubtree();

} // AbstractActor
