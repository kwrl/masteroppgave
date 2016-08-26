/**
 */
package klang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.Scope#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link klang.Scope#getChildren <em>Children</em>}</li>
 *   <li>{@link klang.Scope#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getScope()
 * @model abstract="true"
 * @generated
 */
public interface Scope<S extends Scope<?>> extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link klang.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see klang.KlangPackage#getScope_LocalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getLocalVariables();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see klang.KlangPackage#getScope_Children()
	 * @model
	 * @generated
	 */
	EList<S> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see klang.KlangPackage#getScope_Parent()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	Scope<?> getParent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableNameRequired="true"
	 * @generated
	 */
	boolean isInScope(String variableName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableNameRequired="true"
	 * @generated
	 */
	VariableDeclaration getVariableDeclaration(String variableName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableNameRequired="true"
	 * @generated
	 */
	boolean isInLocalScope(String variableName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableNameRequired="true"
	 * @generated
	 */
	boolean isInParentScope(String variableName);

} // Scope
