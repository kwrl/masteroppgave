/**
 */
package klang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collision Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.CollisionEvent#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getCollisionEvent()
 * @model
 * @generated
 */
public interface CollisionEvent extends ActorEvent {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SpriteActor)
	 * @see klang.KlangPackage#getCollisionEvent_Target()
	 * @model
	 * @generated
	 */
	SpriteActor getTarget();

	/**
	 * Sets the value of the '{@link klang.CollisionEvent#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SpriteActor value);

} // CollisionEvent
