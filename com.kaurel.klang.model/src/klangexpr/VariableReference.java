/**
 */
package klangexpr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klangexpr.VariableReference#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 *
 * @see klangexpr.KlangexprPackage#getVariableReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='scope\n'"
 * @generated
 */
public interface VariableReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see klangexpr.KlangexprPackage#getVariableReference_VariableName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link klangexpr.VariableReference#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

} // VariableReference
