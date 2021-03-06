/**
 */
package klang;

import klang.entities.SpriteEntity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sprite Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.SpriteActor#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getSpriteActor()
 * @model superTypes="klang.AbstractActor<klang.SpriteEntity>"
 * @generated
 */
public interface SpriteActor extends AbstractActor<SpriteEntity> {

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link klang.Program#getSpriteActors <em>Sprite Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see klang.KlangPackage#getSpriteActor_Program()
	 * @see klang.Program#getSpriteActors
	 * @model opposite="spriteActors" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link klang.SpriteActor#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);
} // SpriteActor
