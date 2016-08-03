/**
 */
package klang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.Entity#getTarget <em>Target</em>}</li>
 *   <li>{@link klang.Entity#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(Object)
	 * @see klang.KlangPackage#getEntity_Target()
	 * @model unique="false"
	 * @generated
	 */
	Object getTarget();

	/**
	 * Sets the value of the '{@link klang.Entity#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Object value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link klang.Actor#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' container reference.
	 * @see #setActor(Actor)
	 * @see klang.KlangPackage#getEntity_Actor()
	 * @see klang.Actor#getEntity
	 * @model opposite="entity" required="true" transient="false"
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link klang.Entity#getActor <em>Actor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' container reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);
} // Entity
