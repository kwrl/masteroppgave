/**
 */
package klang.framework.impl;

import klang.framework.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameworkFactoryImpl extends EFactoryImpl implements FrameworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FrameworkFactory init() {
		try {
			FrameworkFactory theFrameworkFactory = (FrameworkFactory)EPackage.Registry.INSTANCE.getEFactory(FrameworkPackage.eNS_URI);
			if (theFrameworkFactory != null) {
				return theFrameworkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FrameworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FrameworkPackage.ENTITY: return createEntity();
			case FrameworkPackage.SPRITE_ENTITY: return createSpriteEntity();
			case FrameworkPackage.SCENE_ENTITY: return createSceneEntity();
			case FrameworkPackage.OPERATOR_SET: return createOperatorSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpriteEntity createSpriteEntity() {
		SpriteEntityImpl spriteEntity = new SpriteEntityImpl();
		return spriteEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneEntity createSceneEntity() {
		SceneEntityImpl sceneEntity = new SceneEntityImpl();
		return sceneEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorSet createOperatorSet() {
		OperatorSetImpl operatorSet = new OperatorSetImpl();
		return operatorSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkPackage getFrameworkPackage() {
		return (FrameworkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FrameworkPackage getPackage() {
		return FrameworkPackage.eINSTANCE;
	}

} //FrameworkFactoryImpl
