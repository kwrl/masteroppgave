/**
 */
package klang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The feature id for the '<em><b>Subject Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__SUBJECT_TYPE = TREE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_FEATURE_COUNT = TREE_NODE_FEATURE_COUNT + 5;

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
	 * The operation id for the '<em>Get Variable Declarations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___GET_VARIABLE_DECLARATIONS__STRING = TREE_NODE_OPERATION_COUNT + 4;

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
	 * The feature id for the '<em><b>Subject Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR__SUBJECT_TYPE = ABSTRACT_ACTOR__SUBJECT_TYPE;

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
	 * The operation id for the '<em>Get Variable Declarations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR___GET_VARIABLE_DECLARATIONS__STRING = ABSTRACT_ACTOR___GET_VARIABLE_DECLARATIONS__STRING;

	/**
	 * The number of operations of the '<em>Scene Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR_OPERATION_COUNT = ABSTRACT_ACTOR_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Subject Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR__SUBJECT_TYPE = ABSTRACT_ACTOR__SUBJECT_TYPE;

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
	 * The operation id for the '<em>Get Variable Declarations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___GET_VARIABLE_DECLARATIONS__STRING = ABSTRACT_ACTOR___GET_VARIABLE_DECLARATIONS__STRING;

	/**
	 * The number of operations of the '<em>Sprite Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR_OPERATION_COUNT = ABSTRACT_ACTOR_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Reference Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__REFERENCE_EVENT = 2;

	/**
	 * The number of structural features of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ACTOR = 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link klang.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.EventImpl
	 * @see klang.impl.KlangPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 12;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Matching Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___MATCHING_EVENT__EVENT = 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link klang.impl.GlobalEventImpl <em>Global Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.GlobalEventImpl
	 * @see klang.impl.KlangPackageImpl#getGlobalEvent()
	 * @generated
	 */
	int GLOBAL_EVENT = 13;

	/**
	 * The number of structural features of the '<em>Global Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Matching Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_EVENT___MATCHING_EVENT__EVENT = EVENT___MATCHING_EVENT__EVENT;

	/**
	 * The number of operations of the '<em>Global Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.GameStartEventImpl <em>Game Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.GameStartEventImpl
	 * @see klang.impl.KlangPackageImpl#getGameStartEvent()
	 * @generated
	 */
	int GAME_START_EVENT = 5;

	/**
	 * The number of structural features of the '<em>Game Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_START_EVENT_FEATURE_COUNT = GLOBAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Matching Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_START_EVENT___MATCHING_EVENT__EVENT = GLOBAL_EVENT___MATCHING_EVENT__EVENT;

	/**
	 * The number of operations of the '<em>Game Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_START_EVENT_OPERATION_COUNT = GLOBAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.ActorEventImpl <em>Actor Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.ActorEventImpl
	 * @see klang.impl.KlangPackageImpl#getActorEvent()
	 * @generated
	 */
	int ACTOR_EVENT = 14;

	/**
	 * The number of structural features of the '<em>Actor Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Matching Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_EVENT___MATCHING_EVENT__EVENT = EVENT___MATCHING_EVENT__EVENT;

	/**
	 * The number of operations of the '<em>Actor Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.ClickEventImpl <em>Click Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.ClickEventImpl
	 * @see klang.impl.KlangPackageImpl#getClickEvent()
	 * @generated
	 */
	int CLICK_EVENT = 6;

	/**
	 * The number of structural features of the '<em>Click Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT_FEATURE_COUNT = ACTOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Matching Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT___MATCHING_EVENT__EVENT = ACTOR_EVENT___MATCHING_EVENT__EVENT;

	/**
	 * The number of operations of the '<em>Click Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT_OPERATION_COUNT = ACTOR_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.KeyPressEventImpl <em>Key Press Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.KeyPressEventImpl
	 * @see klang.impl.KlangPackageImpl#getKeyPressEvent()
	 * @generated
	 */
	int KEY_PRESS_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESS_EVENT__KEY = GLOBAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key Press Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESS_EVENT_FEATURE_COUNT = GLOBAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Matching Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESS_EVENT___MATCHING_EVENT__EVENT = GLOBAL_EVENT___MATCHING_EVENT__EVENT;

	/**
	 * The number of operations of the '<em>Key Press Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESS_EVENT_OPERATION_COUNT = GLOBAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.CollisionEventImpl <em>Collision Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.CollisionEventImpl
	 * @see klang.impl.KlangPackageImpl#getCollisionEvent()
	 * @generated
	 */
	int COLLISION_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_EVENT__TARGET = ACTOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collision Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_EVENT_FEATURE_COUNT = ACTOR_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Matching Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_EVENT___MATCHING_EVENT__EVENT = ACTOR_EVENT___MATCHING_EVENT__EVENT;

	/**
	 * The number of operations of the '<em>Collision Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_EVENT_OPERATION_COUNT = ACTOR_EVENT_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link klang.impl.MessageReceivedEventImpl <em>Message Received Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.MessageReceivedEventImpl
	 * @see klang.impl.KlangPackageImpl#getMessageReceivedEvent()
	 * @generated
	 */
	int MESSAGE_RECEIVED_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED_EVENT__NAME = GLOBAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Received Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED_EVENT_FEATURE_COUNT = GLOBAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Matching Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED_EVENT___MATCHING_EVENT__EVENT = GLOBAL_EVENT___MATCHING_EVENT__EVENT;

	/**
	 * The number of operations of the '<em>Message Received Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RECEIVED_EVENT_OPERATION_COUNT = GLOBAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.Keys <em>Keys</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.Keys
	 * @see klang.impl.KlangPackageImpl#getKeys()
	 * @generated
	 */
	int KEYS = 15;


	/**
	 * The meta object id for the '<em>Entity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.entities.Entity
	 * @see klang.impl.KlangPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 16;

	/**
	 * The meta object id for the '<em>Sprite Entity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.entities.SpriteEntity
	 * @see klang.impl.KlangPackageImpl#getSpriteEntity()
	 * @generated
	 */
	int SPRITE_ENTITY = 17;

	/**
	 * The meta object id for the '<em>Scene Entity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.entities.SceneEntity
	 * @see klang.impl.KlangPackageImpl#getSceneEntity()
	 * @generated
	 */
	int SCENE_ENTITY = 18;


	/**
	 * The meta object id for the '<em>Optional</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Optional
	 * @see klang.impl.KlangPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 19;


	/**
	 * The meta object id for the '<em>Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.stream.Stream
	 * @see klang.impl.KlangPackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 20;


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
	 * Returns the meta object for the containment reference '{@link klang.EventHandler#getReferenceEvent <em>Reference Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Event</em>'.
	 * @see klang.EventHandler#getReferenceEvent()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_ReferenceEvent();

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
	 * Returns the meta object for the attribute '{@link klang.AbstractActor#getSubjectType <em>Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Type</em>'.
	 * @see klang.AbstractActor#getSubjectType()
	 * @see #getAbstractActor()
	 * @generated
	 */
	EAttribute getAbstractActor_SubjectType();

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
	 * Returns the meta object for the '{@link klang.AbstractActor#getVariableDeclarations(java.lang.String) <em>Get Variable Declarations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Declarations</em>' operation.
	 * @see klang.AbstractActor#getVariableDeclarations(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractActor__GetVariableDeclarations__String();

	/**
	 * Returns the meta object for class '{@link klang.GameStartEvent <em>Game Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Start Event</em>'.
	 * @see klang.GameStartEvent
	 * @generated
	 */
	EClass getGameStartEvent();

	/**
	 * Returns the meta object for class '{@link klang.ClickEvent <em>Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click Event</em>'.
	 * @see klang.ClickEvent
	 * @generated
	 */
	EClass getClickEvent();

	/**
	 * Returns the meta object for class '{@link klang.KeyPressEvent <em>Key Press Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Press Event</em>'.
	 * @see klang.KeyPressEvent
	 * @generated
	 */
	EClass getKeyPressEvent();

	/**
	 * Returns the meta object for the attribute '{@link klang.KeyPressEvent#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see klang.KeyPressEvent#getKey()
	 * @see #getKeyPressEvent()
	 * @generated
	 */
	EAttribute getKeyPressEvent_Key();

	/**
	 * Returns the meta object for class '{@link klang.CollisionEvent <em>Collision Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collision Event</em>'.
	 * @see klang.CollisionEvent
	 * @generated
	 */
	EClass getCollisionEvent();

	/**
	 * Returns the meta object for the reference '{@link klang.CollisionEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see klang.CollisionEvent#getTarget()
	 * @see #getCollisionEvent()
	 * @generated
	 */
	EReference getCollisionEvent_Target();

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
	 * Returns the meta object for class '{@link klang.MessageReceivedEvent <em>Message Received Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Received Event</em>'.
	 * @see klang.MessageReceivedEvent
	 * @generated
	 */
	EClass getMessageReceivedEvent();

	/**
	 * Returns the meta object for the attribute '{@link klang.MessageReceivedEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klang.MessageReceivedEvent#getName()
	 * @see #getMessageReceivedEvent()
	 * @generated
	 */
	EAttribute getMessageReceivedEvent_Name();

	/**
	 * Returns the meta object for class '{@link klang.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see klang.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the '{@link klang.Event#matchingEvent(klang.Event) <em>Matching Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matching Event</em>' operation.
	 * @see klang.Event#matchingEvent(klang.Event)
	 * @generated
	 */
	EOperation getEvent__MatchingEvent__Event();

	/**
	 * Returns the meta object for class '{@link klang.GlobalEvent <em>Global Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Event</em>'.
	 * @see klang.GlobalEvent
	 * @generated
	 */
	EClass getGlobalEvent();

	/**
	 * Returns the meta object for class '{@link klang.ActorEvent <em>Actor Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Event</em>'.
	 * @see klang.ActorEvent
	 * @generated
	 */
	EClass getActorEvent();

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
	 * Returns the meta object for data type '{@link klang.entities.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Entity</em>'.
	 * @see klang.entities.Entity
	 * @model instanceClass="klang.entities.Entity"
	 * @generated
	 */
	EDataType getEntity();

	/**
	 * Returns the meta object for data type '{@link klang.entities.SpriteEntity <em>Sprite Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sprite Entity</em>'.
	 * @see klang.entities.SpriteEntity
	 * @model instanceClass="klang.entities.SpriteEntity"
	 * @generated
	 */
	EDataType getSpriteEntity();

	/**
	 * Returns the meta object for data type '{@link klang.entities.SceneEntity <em>Scene Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scene Entity</em>'.
	 * @see klang.entities.SceneEntity
	 * @model instanceClass="klang.entities.SceneEntity"
	 * @generated
	 */
	EDataType getSceneEntity();

	/**
	 * Returns the meta object for data type '{@link java.util.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Optional</em>'.
	 * @see java.util.Optional
	 * @model instanceClass="java.util.Optional" typeParameters="T"
	 * @generated
	 */
	EDataType getOptional();

	/**
	 * Returns the meta object for data type '{@link java.util.stream.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stream</em>'.
	 * @see java.util.stream.Stream
	 * @model instanceClass="java.util.stream.Stream" typeParameters="T"
	 * @generated
	 */
	EDataType getStream();

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
		 * The meta object literal for the '<em><b>Reference Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER__REFERENCE_EVENT = eINSTANCE.getEventHandler_ReferenceEvent();

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
		 * The meta object literal for the '<em><b>Actor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__ACTOR = eINSTANCE.getVariableDeclaration_Actor();

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
		 * The meta object literal for the '<em><b>Subject Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTOR__SUBJECT_TYPE = eINSTANCE.getAbstractActor_SubjectType();

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
		 * The meta object literal for the '<em><b>Get Variable Declarations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ACTOR___GET_VARIABLE_DECLARATIONS__STRING = eINSTANCE.getAbstractActor__GetVariableDeclarations__String();

		/**
		 * The meta object literal for the '{@link klang.impl.GameStartEventImpl <em>Game Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.GameStartEventImpl
		 * @see klang.impl.KlangPackageImpl#getGameStartEvent()
		 * @generated
		 */
		EClass GAME_START_EVENT = eINSTANCE.getGameStartEvent();

		/**
		 * The meta object literal for the '{@link klang.impl.ClickEventImpl <em>Click Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.ClickEventImpl
		 * @see klang.impl.KlangPackageImpl#getClickEvent()
		 * @generated
		 */
		EClass CLICK_EVENT = eINSTANCE.getClickEvent();

		/**
		 * The meta object literal for the '{@link klang.impl.KeyPressEventImpl <em>Key Press Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.KeyPressEventImpl
		 * @see klang.impl.KlangPackageImpl#getKeyPressEvent()
		 * @generated
		 */
		EClass KEY_PRESS_EVENT = eINSTANCE.getKeyPressEvent();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PRESS_EVENT__KEY = eINSTANCE.getKeyPressEvent_Key();

		/**
		 * The meta object literal for the '{@link klang.impl.CollisionEventImpl <em>Collision Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.CollisionEventImpl
		 * @see klang.impl.KlangPackageImpl#getCollisionEvent()
		 * @generated
		 */
		EClass COLLISION_EVENT = eINSTANCE.getCollisionEvent();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION_EVENT__TARGET = eINSTANCE.getCollisionEvent_Target();

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
		 * The meta object literal for the '{@link klang.impl.MessageReceivedEventImpl <em>Message Received Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.MessageReceivedEventImpl
		 * @see klang.impl.KlangPackageImpl#getMessageReceivedEvent()
		 * @generated
		 */
		EClass MESSAGE_RECEIVED_EVENT = eINSTANCE.getMessageReceivedEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_RECEIVED_EVENT__NAME = eINSTANCE.getMessageReceivedEvent_Name();

		/**
		 * The meta object literal for the '{@link klang.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.EventImpl
		 * @see klang.impl.KlangPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Matching Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT___MATCHING_EVENT__EVENT = eINSTANCE.getEvent__MatchingEvent__Event();

		/**
		 * The meta object literal for the '{@link klang.impl.GlobalEventImpl <em>Global Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.GlobalEventImpl
		 * @see klang.impl.KlangPackageImpl#getGlobalEvent()
		 * @generated
		 */
		EClass GLOBAL_EVENT = eINSTANCE.getGlobalEvent();

		/**
		 * The meta object literal for the '{@link klang.impl.ActorEventImpl <em>Actor Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.ActorEventImpl
		 * @see klang.impl.KlangPackageImpl#getActorEvent()
		 * @generated
		 */
		EClass ACTOR_EVENT = eINSTANCE.getActorEvent();

		/**
		 * The meta object literal for the '{@link klang.Keys <em>Keys</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.Keys
		 * @see klang.impl.KlangPackageImpl#getKeys()
		 * @generated
		 */
		EEnum KEYS = eINSTANCE.getKeys();

		/**
		 * The meta object literal for the '<em>Entity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.entities.Entity
		 * @see klang.impl.KlangPackageImpl#getEntity()
		 * @generated
		 */
		EDataType ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em>Sprite Entity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.entities.SpriteEntity
		 * @see klang.impl.KlangPackageImpl#getSpriteEntity()
		 * @generated
		 */
		EDataType SPRITE_ENTITY = eINSTANCE.getSpriteEntity();

		/**
		 * The meta object literal for the '<em>Scene Entity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.entities.SceneEntity
		 * @see klang.impl.KlangPackageImpl#getSceneEntity()
		 * @generated
		 */
		EDataType SCENE_ENTITY = eINSTANCE.getSceneEntity();

		/**
		 * The meta object literal for the '<em>Optional</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Optional
		 * @see klang.impl.KlangPackageImpl#getOptional()
		 * @generated
		 */
		EDataType OPTIONAL = eINSTANCE.getOptional();

		/**
		 * The meta object literal for the '<em>Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.stream.Stream
		 * @see klang.impl.KlangPackageImpl#getStream()
		 * @generated
		 */
		EDataType STREAM = eINSTANCE.getStream();

	}

} //KlangPackage
