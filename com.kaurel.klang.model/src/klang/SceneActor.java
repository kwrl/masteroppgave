/**
 */
package klang;

import klang.entities.SceneEntity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.SceneActor#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getSceneActor()
 * @model superTypes="klang.AbstractActor<klang.SceneEntity>"
 * @generated
 */
public interface SceneActor extends AbstractActor<SceneEntity> {

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link klang.Program#getSceneActor <em>Scene Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see klang.KlangPackage#getSceneActor_Program()
	 * @see klang.Program#getSceneActor
	 * @model opposite="sceneActor" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link klang.SceneActor#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);
} // SceneActor
