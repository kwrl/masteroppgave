/**
 */
package klang.framework;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see klang.framework.FrameworkFactory
 * @model kind="package"
 * @generated
 */
public interface FrameworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "framework";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/klang/framework";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "framework";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FrameworkPackage eINSTANCE = klang.framework.impl.FrameworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link klang.framework.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.framework.impl.EntityImpl
	 * @see klang.framework.impl.FrameworkPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link klang.framework.impl.SpriteEntityImpl <em>Sprite Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.framework.impl.SpriteEntityImpl
	 * @see klang.framework.impl.FrameworkPackageImpl#getSpriteEntity()
	 * @generated
	 */
	int SPRITE_ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Sprite Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sprite Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.framework.impl.SceneEntityImpl <em>Scene Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.framework.impl.SceneEntityImpl
	 * @see klang.framework.impl.FrameworkPackageImpl#getSceneEntity()
	 * @generated
	 */
	int SCENE_ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Scene Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scene Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.framework.impl.OperatorSetImpl <em>Operator Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.framework.impl.OperatorSetImpl
	 * @see klang.framework.impl.FrameworkPackageImpl#getOperatorSet()
	 * @generated
	 */
	int OPERATOR_SET = 3;

	/**
	 * The number of structural features of the '<em>Operator Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_SET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operator Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_SET_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link klang.framework.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see klang.framework.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link klang.framework.SpriteEntity <em>Sprite Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sprite Entity</em>'.
	 * @see klang.framework.SpriteEntity
	 * @generated
	 */
	EClass getSpriteEntity();

	/**
	 * Returns the meta object for class '{@link klang.framework.SceneEntity <em>Scene Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene Entity</em>'.
	 * @see klang.framework.SceneEntity
	 * @generated
	 */
	EClass getSceneEntity();

	/**
	 * Returns the meta object for class '{@link klang.framework.OperatorSet <em>Operator Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Set</em>'.
	 * @see klang.framework.OperatorSet
	 * @generated
	 */
	EClass getOperatorSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FrameworkFactory getFrameworkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link klang.framework.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.framework.impl.EntityImpl
		 * @see klang.framework.impl.FrameworkPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link klang.framework.impl.SpriteEntityImpl <em>Sprite Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.framework.impl.SpriteEntityImpl
		 * @see klang.framework.impl.FrameworkPackageImpl#getSpriteEntity()
		 * @generated
		 */
		EClass SPRITE_ENTITY = eINSTANCE.getSpriteEntity();

		/**
		 * The meta object literal for the '{@link klang.framework.impl.SceneEntityImpl <em>Scene Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.framework.impl.SceneEntityImpl
		 * @see klang.framework.impl.FrameworkPackageImpl#getSceneEntity()
		 * @generated
		 */
		EClass SCENE_ENTITY = eINSTANCE.getSceneEntity();

		/**
		 * The meta object literal for the '{@link klang.framework.impl.OperatorSetImpl <em>Operator Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.framework.impl.OperatorSetImpl
		 * @see klang.framework.impl.FrameworkPackageImpl#getOperatorSet()
		 * @generated
		 */
		EClass OPERATOR_SET = eINSTANCE.getOperatorSet();

	}

} //FrameworkPackage
