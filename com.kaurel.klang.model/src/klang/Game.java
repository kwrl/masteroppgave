/**
 */
package klang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.Game#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link klang.Game#getActorDefs <em>Actor Defs</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link klang.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declarations</em>' containment reference list.
	 * @see klang.KlangPackage#getGame_VariableDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariableDeclarations();

	/**
	 * Returns the value of the '<em><b>Actor Defs</b></em>' containment reference list.
	 * The list contents are of type {@link klang.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Defs</em>' containment reference list.
	 * @see klang.KlangPackage#getGame_ActorDefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActorDefs();

} // Game
