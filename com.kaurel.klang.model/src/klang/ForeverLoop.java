/**
 */
package klang;

import org.eclipse.emf.common.util.EList;

import klangexpr.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forever Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.ForeverLoop#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getForeverLoop()
 * @model
 * @generated
 */
public interface ForeverLoop extends Statement {
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
	 * @see klang.KlangPackage#getForeverLoop_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // ForeverLoop
