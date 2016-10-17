/**
 */
package klang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see klang.KlangFactory
 * @model kind="package"
 * @generated
 */
public interface KlangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "klang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/com.kaurel.klang.model/model/klang.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "klang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KlangPackage eINSTANCE = klang.impl.KlangPackageImpl.init();

	/**
	 * The meta object id for the '{@link klang.impl.AbstractActorImpl <em>Abstract Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.AbstractActorImpl
	 * @see klang.impl.KlangPackageImpl#getAbstractActor()
	 * @generated
	 */
	int ABSTRACT_ACTOR = 4;

	/**
	 * The meta object id for the '{@link klang.impl.SceneActorImpl <em>Scene Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.SceneActorImpl
	 * @see klang.impl.KlangPackageImpl#getSceneActor()
	 * @generated
	 */
	int SCENE_ACTOR = 0;

	/**
	 * The meta object id for the '{@link klang.impl.SpriteActorImpl <em>Sprite Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.SpriteActorImpl
	 * @see klang.impl.KlangPackageImpl#getSpriteActor()
	 * @generated
	 */
	int SPRITE_ACTOR = 1;

	/**
	 * The meta object id for the '{@link klang.impl.EventHandlerImpl <em>Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.EventHandlerImpl
	 * @see klang.impl.KlangPackageImpl#getEventHandler()
	 * @generated
	 */
	int EVENT_HANDLER = 2;

	/**
	 * The meta object id for the '{@link klang.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.VariableDeclarationImpl
	 * @see klang.impl.KlangPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 3;

	/**
	 * The meta object id for the '{@link klang.impl.GameStartImpl <em>Game Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.GameStartImpl
	 * @see klang.impl.KlangPackageImpl#getGameStart()
	 * @generated
	 */
	int GAME_START = 5;

	/**
	 * The meta object id for the '{@link klang.impl.SpriteClickedImpl <em>Sprite Clicked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.SpriteClickedImpl
	 * @see klang.impl.KlangPackageImpl#getSpriteClicked()
	 * @generated
	 */
	int SPRITE_CLICKED = 6;

	/**
	 * The meta object id for the '{@link klang.impl.KeyPressedImpl <em>Key Pressed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.KeyPressedImpl
	 * @see klang.impl.KlangPackageImpl#getKeyPressed()
	 * @generated
	 */
	int KEY_PRESSED = 7;

	/**
	 * The meta object id for the '{@link klang.impl.CollidesWithImpl <em>Collides With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.CollidesWithImpl
	 * @see klang.impl.KlangPackageImpl#getCollidesWith()
	 * @generated
	 */
	int COLLIDES_WITH = 8;

	/**
	 * The meta object id for the '{@link klang.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.ProgramImpl
	 * @see klang.impl.KlangPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 9;

	/**
	 * The meta object id for the '{@link klang.TreeNode <em>Tree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.TreeNode
	 * @see klang.impl.KlangPackageImpl#getTreeNode()
	 * @generated
	 */
	int TREE_NODE = 10;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__PARENT = 1;

	/**
	 * The number of structural features of the '<em>Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__CHILDREN = TREE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__PARENT = TREE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__EVENT_HANDLERS = TREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__NAME = TREE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__SUBJECT = TREE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__LOCAL_VARIABLES = TREE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_FEATURE_COUNT = TREE_NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is In Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___IS_IN_SCOPE__STRING = TREE_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Variable Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___GET_VARIABLE_DECLARATION__STRING = TREE_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is In Local Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___IS_IN_LOCAL_SCOPE__STRING = TREE_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is In Parent Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___IS_IN_PARENT_SCOPE__STRING = TREE_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Random</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___RANDOM = TREE_NODE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_OPERATION_COUNT = TREE_NODE_OPERATION_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR__CHILDREN = ABSTRACT_ACTOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR__PARENT = ABSTRACT_ACTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR__EVENT_HANDLERS = ABSTRACT_ACTOR__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR__NAME = ABSTRACT_ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR__SUBJECT = ABSTRACT_ACTOR__SUBJECT;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR__LOCAL_VARIABLES = ABSTRACT_ACTOR__LOCAL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR__PROGRAM = ABSTRACT_ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scene Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR_FEATURE_COUNT = ABSTRACT_ACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is In Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR___IS_IN_SCOPE__STRING = ABSTRACT_ACTOR___IS_IN_SCOPE__STRING;

	/**
	 * The operation id for the '<em>Get Variable Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR___GET_VARIABLE_DECLARATION__STRING = ABSTRACT_ACTOR___GET_VARIABLE_DECLARATION__STRING;

	/**
	 * The operation id for the '<em>Is In Local Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR___IS_IN_LOCAL_SCOPE__STRING = ABSTRACT_ACTOR___IS_IN_LOCAL_SCOPE__STRING;

	/**
	 * The operation id for the '<em>Is In Parent Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR___IS_IN_PARENT_SCOPE__STRING = ABSTRACT_ACTOR___IS_IN_PARENT_SCOPE__STRING;

	/**
	 * The operation id for the '<em>Random</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR___RANDOM = ABSTRACT_ACTOR___RANDOM;

	/**
	 * The operation id for the '<em>Print</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR___PRINT__STRING = ABSTRACT_ACTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scene Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR_OPERATION_COUNT = ABSTRACT_ACTOR_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR__CHILDREN = ABSTRACT_ACTOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR__PARENT = ABSTRACT_ACTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR__EVENT_HANDLERS = ABSTRACT_ACTOR__EVENT_HANDLERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR__NAME = ABSTRACT_ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR__SUBJECT = ABSTRACT_ACTOR__SUBJECT;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR__LOCAL_VARIABLES = ABSTRACT_ACTOR__LOCAL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR__PROGRAM = ABSTRACT_ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sprite Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR_FEATURE_COUNT = ABSTRACT_ACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is In Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___IS_IN_SCOPE__STRING = ABSTRACT_ACTOR___IS_IN_SCOPE__STRING;

	/**
	 * The operation id for the '<em>Get Variable Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___GET_VARIABLE_DECLARATION__STRING = ABSTRACT_ACTOR___GET_VARIABLE_DECLARATION__STRING;

	/**
	 * The operation id for the '<em>Is In Local Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___IS_IN_LOCAL_SCOPE__STRING = ABSTRACT_ACTOR___IS_IN_LOCAL_SCOPE__STRING;

	/**
	 * The operation id for the '<em>Is In Parent Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___IS_IN_PARENT_SCOPE__STRING = ABSTRACT_ACTOR___IS_IN_PARENT_SCOPE__STRING;

	/**
	 * The operation id for the '<em>Random</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___RANDOM = ABSTRACT_ACTOR___RANDOM;

	/**
	 * The operation id for the '<em>Print</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___PRINT__STRING = ABSTRACT_ACTOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___SET_COLOR__DOUBLE_DOUBLE_DOUBLE = ABSTRACT_ACTOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sprite Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR_OPERATION_COUNT = ABSTRACT_ACTOR_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__STATEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__ACTOR = 1;

	/**
	 * The number of structural features of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ACTOR = 3;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_START__STATEMENTS = EVENT_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_START__ACTOR = EVENT_HANDLER__ACTOR;

	/**
	 * The number of structural features of the '<em>Game Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_START_FEATURE_COUNT = EVENT_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_START_OPERATION_COUNT = EVENT_HANDLER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_CLICKED__STATEMENTS = EVENT_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_CLICKED__ACTOR = EVENT_HANDLER__ACTOR;

	/**
	 * The number of structural features of the '<em>Sprite Clicked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_CLICKED_FEATURE_COUNT = EVENT_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sprite Clicked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_CLICKED_OPERATION_COUNT = EVENT_HANDLER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSED__STATEMENTS = EVENT_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSED__ACTOR = EVENT_HANDLER__ACTOR;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSED__KEY = EVENT_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key Pressed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSED_FEATURE_COUNT = EVENT_HANDLER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Key Pressed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSED_OPERATION_COUNT = EVENT_HANDLER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLIDES_WITH__STATEMENTS = EVENT_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLIDES_WITH__ACTOR = EVENT_HANDLER__ACTOR;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLIDES_WITH__TARGET = EVENT_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collides With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLIDES_WITH_FEATURE_COUNT = EVENT_HANDLER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collides With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLIDES_WITH_OPERATION_COUNT = EVENT_HANDLER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scene Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SCENE_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Sprite Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SPRITE_ACTORS = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link klang.impl.TreeTraversalImpl <em>Tree Traversal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.TreeTraversalImpl
	 * @see klang.impl.KlangPackageImpl#getTreeTraversal()
	 * @generated
	 */
	int TREE_TRAVERSAL = 11;

	/**
	 * The number of structural features of the '<em>Tree Traversal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TRAVERSAL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Breadth First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TRAVERSAL___BREADTH_FIRST__TREENODE = 0;

	/**
	 * The operation id for the '<em>Depth First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TRAVERSAL___DEPTH_FIRST__TREENODE = 1;

	/**
	 * The number of operations of the '<em>Tree Traversal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_TRAVERSAL_OPERATION_COUNT = 2;


	/**
	 * The meta object id for the '{@link klang.impl.MessageReceivedImpl <em>Message Received</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.MessageReceivedImpl
	 * @see klang.impl.KlangPackageImpl#getMessageReceived()
	 * @generated
	 */
	int MESSAGE_RECEIVED = 12;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED__STATEMENTS = EVENT_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED__ACTOR = EVENT_HANDLER__ACTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED__NAME = EVENT_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Received</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED_FEATURE_COUNT = EVENT_HANDLER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Received</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED_OPERATION_COUNT = EVENT_HANDLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.Keys <em>Keys</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.Keys
	 * @see klang.impl.KlangPackageImpl#getKeys()
	 * @generated
	 */
	int KEYS = 13;


	/**
	 * Returns the meta object for class '{@link klang.SceneActor <em>Scene Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene Actor</em>'.
	 * @see klang.SceneActor
	 * @generated
	 */
	EClass getSceneActor();

	/**
	 * Returns the meta object for the container reference '{@link klang.SceneActor#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see klang.SceneActor#getProgram()
	 * @see #getSceneActor()
	 * @generated
	 */
	EReference getSceneActor_Program();

	/**
	 * Returns the meta object for the '{@link klang.SceneActor#print(java.lang.String) <em>Print</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print</em>' operation.
	 * @see klang.SceneActor#print(java.lang.String)
	 * @generated
	 */
	EOperation getSceneActor__Print__String();

	/**
	 * Returns the meta object for class '{@link klang.SpriteActor <em>Sprite Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sprite Actor</em>'.
	 * @see klang.SpriteActor
	 * @generated
	 */
	EClass getSpriteActor();

	/**
	 * Returns the meta object for the container reference '{@link klang.SpriteActor#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see klang.SpriteActor#getProgram()
	 * @see #getSpriteActor()
	 * @generated
	 */
	EReference getSpriteActor_Program();

	/**
	 * Returns the meta object for the '{@link klang.SpriteActor#print(java.lang.String) <em>Print</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print</em>' operation.
	 * @see klang.SpriteActor#print(java.lang.String)
	 * @generated
	 */
	EOperation getSpriteActor__Print__String();

	/**
	 * Returns the meta object for the '{@link klang.SpriteActor#setColor(java.lang.Double, java.lang.Double, java.lang.Double) <em>Set Color</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Color</em>' operation.
	 * @see klang.SpriteActor#setColor(java.lang.Double, java.lang.Double, java.lang.Double)
	 * @generated
	 */
	EOperation getSpriteActor__SetColor__Double_Double_Double();

	/**
	 * Returns the meta object for class '{@link klang.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handler</em>'.
	 * @see klang.EventHandler
	 * @generated
	 */
	EClass getEventHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.EventHandler#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see klang.EventHandler#getStatements()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_Statements();

	/**
	 * Returns the meta object for the container reference '{@link klang.EventHandler#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Actor</em>'.
	 * @see klang.EventHandler#getActor()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_Actor();

	/**
	 * Returns the meta object for class '{@link klang.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see klang.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link klang.VariableDeclaration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see klang.VariableDeclaration#getExpression()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Expression();

	/**
	 * Returns the meta object for the attribute '{@link klang.VariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klang.VariableDeclaration#getName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link klang.VariableDeclaration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see klang.VariableDeclaration#getValue()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Value();

	/**
	 * Returns the meta object for the container reference '{@link klang.VariableDeclaration#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Actor</em>'.
	 * @see klang.VariableDeclaration#getActor()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Actor();

	/**
	 * Returns the meta object for class '{@link klang.GameStart <em>Game Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Start</em>'.
	 * @see klang.GameStart
	 * @generated
	 */
	EClass getGameStart();

	/**
	 * Returns the meta object for class '{@link klang.SpriteClicked <em>Sprite Clicked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sprite Clicked</em>'.
	 * @see klang.SpriteClicked
	 * @generated
	 */
	EClass getSpriteClicked();

	/**
	 * Returns the meta object for class '{@link klang.KeyPressed <em>Key Pressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Pressed</em>'.
	 * @see klang.KeyPressed
	 * @generated
	 */
	EClass getKeyPressed();

	/**
	 * Returns the meta object for the attribute '{@link klang.KeyPressed#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see klang.KeyPressed#getKey()
	 * @see #getKeyPressed()
	 * @generated
	 */
	EAttribute getKeyPressed_Key();

	/**
	 * Returns the meta object for class '{@link klang.CollidesWith <em>Collides With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collides With</em>'.
	 * @see klang.CollidesWith
	 * @generated
	 */
	EClass getCollidesWith();

	/**
	 * Returns the meta object for the reference '{@link klang.CollidesWith#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see klang.CollidesWith#getTarget()
	 * @see #getCollidesWith()
	 * @generated
	 */
	EReference getCollidesWith_Target();

	/**
	 * Returns the meta object for class '{@link klang.AbstractActor <em>Abstract Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Actor</em>'.
	 * @see klang.AbstractActor
	 * @generated
	 */
	EClass getAbstractActor();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.AbstractActor#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Handlers</em>'.
	 * @see klang.AbstractActor#getEventHandlers()
	 * @see #getAbstractActor()
	 * @generated
	 */
	EReference getAbstractActor_EventHandlers();

	/**
	 * Returns the meta object for the attribute '{@link klang.AbstractActor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klang.AbstractActor#getName()
	 * @see #getAbstractActor()
	 * @generated
	 */
	EAttribute getAbstractActor_Name();

	/**
	 * Returns the meta object for the attribute '{@link klang.AbstractActor#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see klang.AbstractActor#getSubject()
	 * @see #getAbstractActor()
	 * @generated
	 */
	EAttribute getAbstractActor_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.AbstractActor#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see klang.AbstractActor#getLocalVariables()
	 * @see #getAbstractActor()
	 * @generated
	 */
	EReference getAbstractActor_LocalVariables();

	/**
	 * Returns the meta object for the '{@link klang.AbstractActor#isInScope(java.lang.String) <em>Is In Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Scope</em>' operation.
	 * @see klang.AbstractActor#isInScope(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractActor__IsInScope__String();

	/**
	 * Returns the meta object for the '{@link klang.AbstractActor#getVariableDeclaration(java.lang.String) <em>Get Variable Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Declaration</em>' operation.
	 * @see klang.AbstractActor#getVariableDeclaration(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractActor__GetVariableDeclaration__String();

	/**
	 * Returns the meta object for the '{@link klang.AbstractActor#isInLocalScope(java.lang.String) <em>Is In Local Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Local Scope</em>' operation.
	 * @see klang.AbstractActor#isInLocalScope(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractActor__IsInLocalScope__String();

	/**
	 * Returns the meta object for the '{@link klang.AbstractActor#isInParentScope(java.lang.String) <em>Is In Parent Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Parent Scope</em>' operation.
	 * @see klang.AbstractActor#isInParentScope(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractActor__IsInParentScope__String();

	/**
	 * Returns the meta object for the '{@link klang.AbstractActor#random() <em>Random</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Random</em>' operation.
	 * @see klang.AbstractActor#random()
	 * @generated
	 */
	EOperation getAbstractActor__Random();

	/**
	 * Returns the meta object for class '{@link klang.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see klang.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference '{@link klang.Program#getSceneActor <em>Scene Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scene Actor</em>'.
	 * @see klang.Program#getSceneActor()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_SceneActor();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.Program#getSpriteActors <em>Sprite Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sprite Actors</em>'.
	 * @see klang.Program#getSpriteActors()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_SpriteActors();

	/**
	 * Returns the meta object for class '{@link klang.TreeNode <em>Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Node</em>'.
	 * @see klang.TreeNode
	 * @generated
	 */
	EClass getTreeNode();

	/**
	 * Returns the meta object for the reference list '{@link klang.TreeNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see klang.TreeNode#getChildren()
	 * @see #getTreeNode()
	 * @generated
	 */
	EReference getTreeNode_Children();

	/**
	 * Returns the meta object for the reference '{@link klang.TreeNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see klang.TreeNode#getParent()
	 * @see #getTreeNode()
	 * @generated
	 */
	EReference getTreeNode_Parent();

	/**
	 * Returns the meta object for class '{@link klang.TreeTraversal <em>Tree Traversal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Traversal</em>'.
	 * @see klang.TreeTraversal
	 * @generated
	 */
	EClass getTreeTraversal();

	/**
	 * Returns the meta object for the '{@link klang.TreeTraversal#BreadthFirst(klang.TreeNode) <em>Breadth First</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Breadth First</em>' operation.
	 * @see klang.TreeTraversal#BreadthFirst(klang.TreeNode)
	 * @generated
	 */
	EOperation getTreeTraversal__BreadthFirst__TreeNode();

	/**
	 * Returns the meta object for the '{@link klang.TreeTraversal#DepthFirst(klang.TreeNode) <em>Depth First</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Depth First</em>' operation.
	 * @see klang.TreeTraversal#DepthFirst(klang.TreeNode)
	 * @generated
	 */
	EOperation getTreeTraversal__DepthFirst__TreeNode();

	/**
	 * Returns the meta object for class '{@link klang.MessageReceived <em>Message Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Received</em>'.
	 * @see klang.MessageReceived
	 * @generated
	 */
	EClass getMessageReceived();

	/**
	 * Returns the meta object for the attribute '{@link klang.MessageReceived#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klang.MessageReceived#getName()
	 * @see #getMessageReceived()
	 * @generated
	 */
	EAttribute getMessageReceived_Name();

	/**
	 * Returns the meta object for enum '{@link klang.Keys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Keys</em>'.
	 * @see klang.Keys
	 * @generated
	 */
	EEnum getKeys();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KlangFactory getKlangFactory();

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
		 * The meta object literal for the '{@link klang.impl.SceneActorImpl <em>Scene Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.SceneActorImpl
		 * @see klang.impl.KlangPackageImpl#getSceneActor()
		 * @generated
		 */
		EClass SCENE_ACTOR = eINSTANCE.getSceneActor();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE_ACTOR__PROGRAM = eINSTANCE.getSceneActor_Program();

		/**
		 * The meta object literal for the '<em><b>Print</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENE_ACTOR___PRINT__STRING = eINSTANCE.getSceneActor__Print__String();

		/**
		 * The meta object literal for the '{@link klang.impl.SpriteActorImpl <em>Sprite Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.SpriteActorImpl
		 * @see klang.impl.KlangPackageImpl#getSpriteActor()
		 * @generated
		 */
		EClass SPRITE_ACTOR = eINSTANCE.getSpriteActor();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRITE_ACTOR__PROGRAM = eINSTANCE.getSpriteActor_Program();

		/**
		 * The meta object literal for the '<em><b>Print</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPRITE_ACTOR___PRINT__STRING = eINSTANCE.getSpriteActor__Print__String();

		/**
		 * The meta object literal for the '<em><b>Set Color</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPRITE_ACTOR___SET_COLOR__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getSpriteActor__SetColor__Double_Double_Double();

		/**
		 * The meta object literal for the '{@link klang.impl.EventHandlerImpl <em>Event Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.EventHandlerImpl
		 * @see klang.impl.KlangPackageImpl#getEventHandler()
		 * @generated
		 */
		EClass EVENT_HANDLER = eINSTANCE.getEventHandler();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER__STATEMENTS = eINSTANCE.getEventHandler_Statements();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER__ACTOR = eINSTANCE.getEventHandler_Actor();

		/**
		 * The meta object literal for the '{@link klang.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.VariableDeclarationImpl
		 * @see klang.impl.KlangPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__EXPRESSION = eINSTANCE.getVariableDeclaration_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__VALUE = eINSTANCE.getVariableDeclaration_Value();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__ACTOR = eINSTANCE.getVariableDeclaration_Actor();

		/**
		 * The meta object literal for the '{@link klang.impl.GameStartImpl <em>Game Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.GameStartImpl
		 * @see klang.impl.KlangPackageImpl#getGameStart()
		 * @generated
		 */
		EClass GAME_START = eINSTANCE.getGameStart();

		/**
		 * The meta object literal for the '{@link klang.impl.SpriteClickedImpl <em>Sprite Clicked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.SpriteClickedImpl
		 * @see klang.impl.KlangPackageImpl#getSpriteClicked()
		 * @generated
		 */
		EClass SPRITE_CLICKED = eINSTANCE.getSpriteClicked();

		/**
		 * The meta object literal for the '{@link klang.impl.KeyPressedImpl <em>Key Pressed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.KeyPressedImpl
		 * @see klang.impl.KlangPackageImpl#getKeyPressed()
		 * @generated
		 */
		EClass KEY_PRESSED = eINSTANCE.getKeyPressed();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PRESSED__KEY = eINSTANCE.getKeyPressed_Key();

		/**
		 * The meta object literal for the '{@link klang.impl.CollidesWithImpl <em>Collides With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.CollidesWithImpl
		 * @see klang.impl.KlangPackageImpl#getCollidesWith()
		 * @generated
		 */
		EClass COLLIDES_WITH = eINSTANCE.getCollidesWith();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLIDES_WITH__TARGET = eINSTANCE.getCollidesWith_Target();

		/**
		 * The meta object literal for the '{@link klang.impl.AbstractActorImpl <em>Abstract Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.AbstractActorImpl
		 * @see klang.impl.KlangPackageImpl#getAbstractActor()
		 * @generated
		 */
		EClass ABSTRACT_ACTOR = eINSTANCE.getAbstractActor();

		/**
		 * The meta object literal for the '<em><b>Event Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTOR__EVENT_HANDLERS = eINSTANCE.getAbstractActor_EventHandlers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTOR__NAME = eINSTANCE.getAbstractActor_Name();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTOR__SUBJECT = eINSTANCE.getAbstractActor_Subject();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTOR__LOCAL_VARIABLES = eINSTANCE.getAbstractActor_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Is In Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ACTOR___IS_IN_SCOPE__STRING = eINSTANCE.getAbstractActor__IsInScope__String();

		/**
		 * The meta object literal for the '<em><b>Get Variable Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ACTOR___GET_VARIABLE_DECLARATION__STRING = eINSTANCE.getAbstractActor__GetVariableDeclaration__String();

		/**
		 * The meta object literal for the '<em><b>Is In Local Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ACTOR___IS_IN_LOCAL_SCOPE__STRING = eINSTANCE.getAbstractActor__IsInLocalScope__String();

		/**
		 * The meta object literal for the '<em><b>Is In Parent Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ACTOR___IS_IN_PARENT_SCOPE__STRING = eINSTANCE.getAbstractActor__IsInParentScope__String();

		/**
		 * The meta object literal for the '<em><b>Random</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ACTOR___RANDOM = eINSTANCE.getAbstractActor__Random();

		/**
		 * The meta object literal for the '{@link klang.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.ProgramImpl
		 * @see klang.impl.KlangPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Scene Actor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SCENE_ACTOR = eINSTANCE.getProgram_SceneActor();

		/**
		 * The meta object literal for the '<em><b>Sprite Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SPRITE_ACTORS = eINSTANCE.getProgram_SpriteActors();

		/**
		 * The meta object literal for the '{@link klang.TreeNode <em>Tree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.TreeNode
		 * @see klang.impl.KlangPackageImpl#getTreeNode()
		 * @generated
		 */
		EClass TREE_NODE = eINSTANCE.getTreeNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE__CHILDREN = eINSTANCE.getTreeNode_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE__PARENT = eINSTANCE.getTreeNode_Parent();

		/**
		 * The meta object literal for the '{@link klang.impl.TreeTraversalImpl <em>Tree Traversal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.TreeTraversalImpl
		 * @see klang.impl.KlangPackageImpl#getTreeTraversal()
		 * @generated
		 */
		EClass TREE_TRAVERSAL = eINSTANCE.getTreeTraversal();

		/**
		 * The meta object literal for the '<em><b>Breadth First</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TREE_TRAVERSAL___BREADTH_FIRST__TREENODE = eINSTANCE.getTreeTraversal__BreadthFirst__TreeNode();

		/**
		 * The meta object literal for the '<em><b>Depth First</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TREE_TRAVERSAL___DEPTH_FIRST__TREENODE = eINSTANCE.getTreeTraversal__DepthFirst__TreeNode();

		/**
		 * The meta object literal for the '{@link klang.impl.MessageReceivedImpl <em>Message Received</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.MessageReceivedImpl
		 * @see klang.impl.KlangPackageImpl#getMessageReceived()
		 * @generated
		 */
		EClass MESSAGE_RECEIVED = eINSTANCE.getMessageReceived();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_RECEIVED__NAME = eINSTANCE.getMessageReceived_Name();

		/**
		 * The meta object literal for the '{@link klang.Keys <em>Keys</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.Keys
		 * @see klang.impl.KlangPackageImpl#getKeys()
		 * @generated
		 */
		EEnum KEYS = eINSTANCE.getKeys();

	}

} //KlangPackage
