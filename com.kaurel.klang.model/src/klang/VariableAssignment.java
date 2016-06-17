/**
 */
package klang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.VariableAssignment#getExpression <em>Expression</em>}</li>
 *   <li>{@link klang.VariableAssignment#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link klang.VariableAssignment#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getVariableAssignment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='scope type\n'"
 * @generated
 */
public interface VariableAssignment extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see klang.KlangPackage#getVariableAssignment_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link klang.VariableAssignment#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see klang.KlangPackage#getVariableAssignment_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link klang.VariableAssignment#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see klang.KlangPackage#getVariableAssignment_Variable()
	 * @model resolveProxies="false" changeable="false" derived="true"
	 * @generated
	 */
	Variable getVariable();

} // VariableAssignment
