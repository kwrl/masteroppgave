/**
 */
package klang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.VariableRef#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link klang.VariableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getVariableRef()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='scope\n'"
 * @generated
 */
public interface VariableRef extends Expression {
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
	 * @see klang.KlangPackage#getVariableRef_VariableName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link klang.VariableRef#getVariableName <em>Variable Name</em>}' attribute.
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
	 * @see klang.KlangPackage#getVariableRef_Variable()
	 * @model resolveProxies="false" changeable="false" derived="true"
	 * @generated
	 */
	Variable getVariable();

} // VariableRef
