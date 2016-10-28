/**
 */
package klang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Press Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.KeyPressEvent#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getKeyPressEvent()
 * @model
 * @generated
 */
public interface KeyPressEvent extends GlobalEvent {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The literals are from the enumeration {@link klang.Keys}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see klang.Keys
	 * @see #setKey(Keys)
	 * @see klang.KlangPackage#getKeyPressEvent_Key()
	 * @model
	 * @generated
	 */
	Keys getKey();

	/**
	 * Sets the value of the '{@link klang.KeyPressEvent#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see klang.Keys
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Keys value);

} // KeyPressEvent
