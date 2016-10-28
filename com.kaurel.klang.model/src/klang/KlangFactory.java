/**
 */
package klang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see klang.KlangPackage
 * @generated
 */
public interface KlangFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KlangFactory eINSTANCE = klang.impl.KlangFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scene Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene Actor</em>'.
	 * @generated
	 */
	SceneActor createSceneActor();

	/**
	 * Returns a new object of class '<em>Sprite Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sprite Actor</em>'.
	 * @generated
	 */
	SpriteActor createSpriteActor();

	/**
	 * Returns a new object of class '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Handler</em>'.
	 * @generated
	 */
	EventHandler createEventHandler();

	/**
	 * Returns a new object of class '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration</em>'.
	 * @generated
	 */
	VariableDeclaration createVariableDeclaration();

	/**
	 * Returns a new object of class '<em>Game Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Start Event</em>'.
	 * @generated
	 */
	GameStartEvent createGameStartEvent();

	/**
	 * Returns a new object of class '<em>Click Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Click Event</em>'.
	 * @generated
	 */
	ClickEvent createClickEvent();

	/**
	 * Returns a new object of class '<em>Key Press Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Press Event</em>'.
	 * @generated
	 */
	KeyPressEvent createKeyPressEvent();

	/**
	 * Returns a new object of class '<em>Collision Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collision Event</em>'.
	 * @generated
	 */
	CollisionEvent createCollisionEvent();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Message Received Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Received Event</em>'.
	 * @generated
	 */
	MessageReceivedEvent createMessageReceivedEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KlangPackage getKlangPackage();

} //KlangFactory
