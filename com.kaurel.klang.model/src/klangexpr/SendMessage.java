/**
 */
package klangexpr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klangexpr.SendMessage#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see klangexpr.KlangexprPackage#getSendMessage()
 * @model
 * @generated
 */
public interface SendMessage extends Statement {
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
	 * @see klangexpr.KlangexprPackage#getSendMessage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link klangexpr.SendMessage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SendMessage
