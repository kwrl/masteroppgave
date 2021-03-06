/**
 */
package klangexpr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klangexpr.If#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link klangexpr.If#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link klangexpr.If#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see klangexpr.KlangexprPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Statement {
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
	 * @see klangexpr.KlangexprPackage#getIf_Predicate()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPredicate();

	/**
	 * Sets the value of the '{@link klangexpr.If#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Expression value);

	/**
	 * Returns the value of the '<em><b>If Block</b></em>' containment reference list.
	 * The list contents are of type {@link klangexpr.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Block</em>' containment reference list.
	 * @see klangexpr.KlangexprPackage#getIf_IfBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getIfBlock();

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference list.
	 * The list contents are of type {@link klangexpr.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference list.
	 * @see klangexpr.KlangexprPackage#getIf_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getElseBlock();

} // If
