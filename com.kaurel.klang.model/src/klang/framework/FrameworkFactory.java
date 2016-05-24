/**
 */
package klang.framework;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see klang.framework.FrameworkPackage
 * @generated
 */
public interface FrameworkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FrameworkFactory eINSTANCE = klang.framework.impl.FrameworkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Sprite Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sprite Entity</em>'.
	 * @generated
	 */
	SpriteEntity createSpriteEntity();

	/**
	 * Returns a new object of class '<em>Scene Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene Entity</em>'.
	 * @generated
	 */
	SceneEntity createSceneEntity();

	/**
	 * Returns a new object of class '<em>Operator Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator Set</em>'.
	 * @generated
	 */
	OperatorSet createOperatorSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FrameworkPackage getFrameworkPackage();

} //FrameworkFactory
