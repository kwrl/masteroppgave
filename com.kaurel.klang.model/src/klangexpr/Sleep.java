/**
 */
package klangexpr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sleep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klangexpr.Sleep#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see klangexpr.KlangexprPackage#getSleep()
 * @model
 * @generated
 */
public interface Sleep extends Statement {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Expression)
	 * @see klangexpr.KlangexprPackage#getSleep_Duration()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDuration();

	/**
	 * Sets the value of the '{@link klangexpr.Sleep#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Expression value);

} // Sleep
