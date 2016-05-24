/**
 */
package klang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.WhileLoop#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link klang.WhileLoop#getLoopBlock <em>Loop Block</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getWhileLoop()
 * @model
 * @generated
 */
public interface WhileLoop extends ControlStatement {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(Expression)
	 * @see klang.KlangPackage#getWhileLoop_Predicate()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPredicate();

	/**
	 * Sets the value of the '{@link klang.WhileLoop#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Expression value);

	/**
	 * Returns the value of the '<em><b>Loop Block</b></em>' containment reference list.
	 * The list contents are of type {@link klang.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Block</em>' containment reference list.
	 * @see klang.KlangPackage#getWhileLoop_LoopBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getLoopBlock();

} // WhileLoop
