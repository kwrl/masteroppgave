/**
 */
package klangexpr;

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
 *   <li>{@link klangexpr.WhileLoop#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link klangexpr.WhileLoop#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see klangexpr.KlangexprPackage#getWhileLoop()
 * @model
 * @generated
 */
public interface WhileLoop extends Statement {
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
	 * @see klangexpr.KlangexprPackage#getWhileLoop_Predicate()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPredicate();

	/**
	 * Sets the value of the '{@link klangexpr.WhileLoop#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Expression value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link klangexpr.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see klangexpr.KlangexprPackage#getWhileLoop_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // WhileLoop
