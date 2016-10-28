/**
 */
package klang;

import klangexpr.Expression;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.VariableDeclaration#getExpression <em>Expression</em>}</li>
 *   <li>{@link klang.VariableDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link klang.VariableDeclaration#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getVariableDeclaration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='scope\n'"
 * @generated
 */
public interface VariableDeclaration extends EObject {
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
	 * @see klang.KlangPackage#getVariableDeclaration_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link klang.VariableDeclaration#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

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
	 * @see klang.KlangPackage#getVariableDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link klang.VariableDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link klang.AbstractActor#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' container reference.
	 * @see #setActor(AbstractActor)
	 * @see klang.KlangPackage#getVariableDeclaration_Actor()
	 * @see klang.AbstractActor#getLocalVariables
	 * @model opposite="localVariables" transient="false"
	 * @generated
	 */
	AbstractActor<?> getActor();

	/**
	 * Sets the value of the '{@link klang.VariableDeclaration#getActor <em>Actor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' container reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(AbstractActor<?> value);

} // VariableDeclaration
