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
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see klangexpr.KlangexprPackage#getSleep_Duration()
	 * @model
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link klangexpr.Sleep#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);
} // Sleep
