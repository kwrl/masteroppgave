/**
 */
package klang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Pressed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.KeyPressed#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getKeyPressed()
 * @model
 * @generated
 */
public interface KeyPressed extends EventHandler {
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
	 * @see klang.KlangPackage#getKeyPressed_Key()
	 * @model
	 * @generated
	 */
	Keys getKey();

	/**
	 * Sets the value of the '{@link klang.KeyPressed#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see klang.Keys
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Keys value);

} // KeyPressed
