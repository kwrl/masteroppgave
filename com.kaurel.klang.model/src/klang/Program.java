/**
 */
package klang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.Program#getSceneActor <em>Scene Actor</em>}</li>
 *   <li>{@link klang.Program#getSpriteActors <em>Sprite Actors</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Scene Actor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link klang.SceneActor#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene Actor</em>' containment reference.
	 * @see #setSceneActor(SceneActor)
	 * @see klang.KlangPackage#getProgram_SceneActor()
	 * @see klang.SceneActor#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	SceneActor getSceneActor();

	/**
	 * Sets the value of the '{@link klang.Program#getSceneActor <em>Scene Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene Actor</em>' containment reference.
	 * @see #getSceneActor()
	 * @generated
	 */
	void setSceneActor(SceneActor value);

	/**
	 * Returns the value of the '<em><b>Sprite Actors</b></em>' containment reference list.
	 * The list contents are of type {@link klang.SpriteActor}.
	 * It is bidirectional and its opposite is '{@link klang.SpriteActor#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sprite Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sprite Actors</em>' containment reference list.
	 * @see klang.KlangPackage#getProgram_SpriteActors()
	 * @see klang.SpriteActor#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<SpriteActor> getSpriteActors();

} // Program
