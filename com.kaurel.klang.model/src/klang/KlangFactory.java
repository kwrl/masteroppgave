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
	 * Returns a new object of class '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration</em>'.
	 * @generated
	 */
	VariableDeclaration createVariableDeclaration();

	/**
	 * Returns a new object of class '<em>Game Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Start</em>'.
	 * @generated
	 */
	GameStart createGameStart();

	/**
	 * Returns a new object of class '<em>Sprite Clicked</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sprite Clicked</em>'.
	 * @generated
	 */
	SpriteClicked createSpriteClicked();

	/**
	 * Returns a new object of class '<em>Key Pressed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Pressed</em>'.
	 * @generated
	 */
	KeyPressed createKeyPressed();

	/**
	 * Returns a new object of class '<em>Collides With</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collides With</em>'.
	 * @generated
	 */
	CollidesWith createCollidesWith();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Tree Traversal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Traversal</em>'.
	 * @generated
	 */
	TreeTraversal createTreeTraversal();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KlangPackage getKlangPackage();

} //KlangFactory
