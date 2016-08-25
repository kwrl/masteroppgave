/**
 */
package klang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	String eNS_URI = "http://www.example.org/klang";

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
	 * The meta object id for the '{@link klang.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.ScopeImpl
	 * @see klang.impl.KlangPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 39;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__LOCAL_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is In Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE___IS_IN_SCOPE__STRING = 0;

	/**
	 * The operation id for the '<em>Get Variable Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE___GET_VARIABLE_DECLARATION__STRING = 1;

	/**
	 * The operation id for the '<em>Is In Local Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE___IS_IN_LOCAL_SCOPE__STRING = 2;

	/**
	 * The operation id for the '<em>Is In Parent Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE___IS_IN_PARENT_SCOPE__STRING = 3;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link klang.impl.AbstractActorImpl <em>Abstract Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.AbstractActorImpl
	 * @see klang.impl.KlangPackageImpl#getAbstractActor()
	 * @generated
	 */
	int ABSTRACT_ACTOR = 38;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__LOCAL_VARIABLES = SCOPE__LOCAL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__CHILDREN = SCOPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__PARENT = SCOPE__PARENT;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__EVENT_HANDLERS = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__NAME = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__SUBJECT = SCOPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is In Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___IS_IN_SCOPE__STRING = SCOPE___IS_IN_SCOPE__STRING;

	/**
	 * The operation id for the '<em>Get Variable Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___GET_VARIABLE_DECLARATION__STRING = SCOPE___GET_VARIABLE_DECLARATION__STRING;

	/**
	 * The operation id for the '<em>Is In Local Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___IS_IN_LOCAL_SCOPE__STRING = SCOPE___IS_IN_LOCAL_SCOPE__STRING;

	/**
	 * The operation id for the '<em>Is In Parent Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___IS_IN_PARENT_SCOPE__STRING = SCOPE___IS_IN_PARENT_SCOPE__STRING;

	/**
	 * The operation id for the '<em>Get Subtree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___GET_SUBTREE = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR__LOCAL_VARIABLES = ABSTRACT_ACTOR__LOCAL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR__CHILDREN = ABSTRACT_ACTOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
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
	 * The number of structural features of the '<em>Scene Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR_FEATURE_COUNT = ABSTRACT_ACTOR_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Get Subtree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_ACTOR___GET_SUBTREE = ABSTRACT_ACTOR___GET_SUBTREE;

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
	 * The meta object id for the '{@link klang.impl.SpriteActorImpl <em>Sprite Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.SpriteActorImpl
	 * @see klang.impl.KlangPackageImpl#getSpriteActor()
	 * @generated
	 */
	int SPRITE_ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR__LOCAL_VARIABLES = ABSTRACT_ACTOR__LOCAL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR__CHILDREN = ABSTRACT_ACTOR__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
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
	 * The number of structural features of the '<em>Sprite Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR_FEATURE_COUNT = ABSTRACT_ACTOR_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Get Subtree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___GET_SUBTREE = ABSTRACT_ACTOR___GET_SUBTREE;

	/**
	 * The operation id for the '<em>Print</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___PRINT__STRING = ABSTRACT_ACTOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___GET_X = ABSTRACT_ACTOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___GET_Y = ABSTRACT_ACTOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___SET_Y__DOUBLE = ABSTRACT_ACTOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___SET_X__DOUBLE = ABSTRACT_ACTOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Print</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___PRINT__DOUBLE = ABSTRACT_ACTOR_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Sleep</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR___SLEEP__DOUBLE = ABSTRACT_ACTOR_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Sprite Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRITE_ACTOR_OPERATION_COUNT = ABSTRACT_ACTOR_OPERATION_COUNT + 7;

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
	 * The meta object id for the '{@link klang.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.AbstractElementImpl
	 * @see klang.impl.KlangPackageImpl#getAbstractElement()
	 * @generated
	 */
	int ABSTRACT_ELEMENT = 28;

	/**
	 * The number of structural features of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT___GET_ACTOR = 0;

	/**
	 * The number of operations of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link klang.Statement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.Statement
	 * @see klang.impl.KlangPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 27;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT___GET_ACTOR = ABSTRACT_ELEMENT___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.WhileLoopImpl <em>While Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.WhileLoopImpl
	 * @see klang.impl.KlangPackageImpl#getWhileLoop()
	 * @generated
	 */
	int WHILE_LOOP = 3;

	/**
	 * The meta object id for the '{@link klang.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.IfImpl
	 * @see klang.impl.KlangPackageImpl#getIf()
	 * @generated
	 */
	int IF = 4;

	/**
	 * The meta object id for the '{@link klang.impl.ForeverLoopImpl <em>Forever Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.ForeverLoopImpl
	 * @see klang.impl.KlangPackageImpl#getForeverLoop()
	 * @generated
	 */
	int FOREVER_LOOP = 5;

	/**
	 * The meta object id for the '{@link klang.impl.YieldImpl <em>Yield</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.YieldImpl
	 * @see klang.impl.KlangPackageImpl#getYield()
	 * @generated
	 */
	int YIELD = 6;

	/**
	 * The meta object id for the '{@link klang.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.VariableAssignmentImpl
	 * @see klang.impl.KlangPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 8;

	/**
	 * The meta object id for the '{@link klang.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.ExpressionImpl
	 * @see klang.impl.KlangPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 9;

	/**
	 * The meta object id for the '{@link klang.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.BinaryOperatorImpl
	 * @see klang.impl.KlangPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 25;

	/**
	 * The meta object id for the '{@link klang.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.OrImpl
	 * @see klang.impl.KlangPackageImpl#getOr()
	 * @generated
	 */
	int OR = 10;

	/**
	 * The meta object id for the '{@link klang.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.AndImpl
	 * @see klang.impl.KlangPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 11;

	/**
	 * The meta object id for the '{@link klang.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.PlusImpl
	 * @see klang.impl.KlangPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 12;

	/**
	 * The meta object id for the '{@link klang.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.MinusImpl
	 * @see klang.impl.KlangPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 13;

	/**
	 * The meta object id for the '{@link klang.impl.MultiplyImpl <em>Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.MultiplyImpl
	 * @see klang.impl.KlangPackageImpl#getMultiply()
	 * @generated
	 */
	int MULTIPLY = 14;

	/**
	 * The meta object id for the '{@link klang.impl.DivideImpl <em>Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.DivideImpl
	 * @see klang.impl.KlangPackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 15;

	/**
	 * The meta object id for the '{@link klang.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.LessThanImpl
	 * @see klang.impl.KlangPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 16;

	/**
	 * The meta object id for the '{@link klang.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.EqualImpl
	 * @see klang.impl.KlangPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 17;

	/**
	 * The meta object id for the '{@link klang.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.GreaterThanImpl
	 * @see klang.impl.KlangPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 18;

	/**
	 * The meta object id for the '{@link klang.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.UnaryOperatorImpl
	 * @see klang.impl.KlangPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 24;

	/**
	 * The meta object id for the '{@link klang.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.NotImpl
	 * @see klang.impl.KlangPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 19;

	/**
	 * The meta object id for the '{@link klang.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.BooleanLiteralImpl
	 * @see klang.impl.KlangPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 20;

	/**
	 * The meta object id for the '{@link klang.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.StringLiteralImpl
	 * @see klang.impl.KlangPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 22;

	/**
	 * The meta object id for the '{@link klang.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.FunctionCallImpl
	 * @see klang.impl.KlangPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 26;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__PREDICATE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__LOOP_BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP___GET_ACTOR = STATEMENT___GET_ACTOR;

	/**
	 * The number of operations of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__PREDICATE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IF_BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_BLOCK = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF___GET_ACTOR = STATEMENT___GET_ACTOR;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREVER_LOOP__LOOP_STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forever Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREVER_LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREVER_LOOP___GET_ACTOR = STATEMENT___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Forever Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREVER_LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Yield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___GET_ACTOR = STATEMENT___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Yield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.VariableDeclarationImpl
	 * @see klang.impl.KlangPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__EXPRESSION = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VALUE = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION___GET_ACTOR = ABSTRACT_ELEMENT___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__VARIABLE_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___GET_ACTOR = STATEMENT___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_ACTOR = ABSTRACT_ELEMENT___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR___GET_ACTOR = EXPRESSION___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = BINARY_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = BINARY_OPERATOR__RIGHT;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR___GET_ACTOR = BINARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = BINARY_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = BINARY_OPERATOR__RIGHT;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND___GET_ACTOR = BINARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT = BINARY_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT = BINARY_OPERATOR__RIGHT;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS___GET_ACTOR = BINARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT = BINARY_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT = BINARY_OPERATOR__RIGHT;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS___GET_ACTOR = BINARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__LEFT = BINARY_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__RIGHT = BINARY_OPERATOR__RIGHT;

	/**
	 * The number of structural features of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY___GET_ACTOR = BINARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__LEFT = BINARY_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__RIGHT = BINARY_OPERATOR__RIGHT;

	/**
	 * The number of structural features of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE___GET_ACTOR = BINARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__LEFT = BINARY_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__RIGHT = BINARY_OPERATOR__RIGHT;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_ACTOR = BINARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LEFT = BINARY_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__RIGHT = BINARY_OPERATOR__RIGHT;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_ACTOR = BINARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_ACTOR = EXPRESSION___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_ACTOR = EXPRESSION___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPRESSION = UNARY_OPERATOR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___GET_ACTOR = UNARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL___GET_ACTOR = EXPRESSION___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.DoubleLiteralImpl
	 * @see klang.impl.KlangPackageImpl#getDoubleLiteral()
	 * @generated
	 */
	int DOUBLE_LITERAL = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL___GET_ACTOR = EXPRESSION___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL___GET_ACTOR = EXPRESSION___GET_ACTOR;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.VariableReferenceImpl
	 * @see klang.impl.KlangPackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 23;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__VARIABLE_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE___GET_ACTOR = EXPRESSION___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL___GET_ACTOR = EXPRESSION___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.GameStartImpl <em>Game Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.GameStartImpl
	 * @see klang.impl.KlangPackageImpl#getGameStart()
	 * @generated
	 */
	int GAME_START = 29;

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
	 * The meta object id for the '{@link klang.impl.SpriteClickedImpl <em>Sprite Clicked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.SpriteClickedImpl
	 * @see klang.impl.KlangPackageImpl#getSpriteClicked()
	 * @generated
	 */
	int SPRITE_CLICKED = 30;

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
	 * The meta object id for the '{@link klang.impl.KeyPressedImpl <em>Key Pressed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.KeyPressedImpl
	 * @see klang.impl.KlangPackageImpl#getKeyPressed()
	 * @generated
	 */
	int KEY_PRESSED = 31;

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
	 * The meta object id for the '{@link klang.impl.CollidesWithImpl <em>Collides With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.CollidesWithImpl
	 * @see klang.impl.KlangPackageImpl#getCollidesWith()
	 * @generated
	 */
	int COLLIDES_WITH = 32;

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
	 * The meta object id for the '{@link klang.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.IntegerLiteralImpl
	 * @see klang.impl.KlangPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL___GET_ACTOR = EXPRESSION___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link klang.impl.SleepImpl <em>Sleep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.SleepImpl
	 * @see klang.impl.KlangPackageImpl#getSleep()
	 * @generated
	 */
	int SLEEP = 34;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__DURATION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sleep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___GET_ACTOR = STATEMENT___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Sleep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link klang.impl.UnaryMinusImpl <em>Unary Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.UnaryMinusImpl
	 * @see klang.impl.KlangPackageImpl#getUnaryMinus()
	 * @generated
	 */
	int UNARY_MINUS = 35;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS__EXPRESSION = UNARY_OPERATOR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Unary Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS___GET_ACTOR = UNARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>Unary Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link klang.impl.ToDoubleImpl <em>To Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.ToDoubleImpl
	 * @see klang.impl.KlangPackageImpl#getToDouble()
	 * @generated
	 */
	int TO_DOUBLE = 36;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DOUBLE__EXPRESSION = UNARY_OPERATOR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>To Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DOUBLE_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DOUBLE___GET_ACTOR = UNARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>To Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DOUBLE_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link klang.impl.ToIntImpl <em>To Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.impl.ToIntImpl
	 * @see klang.impl.KlangPackageImpl#getToInt()
	 * @generated
	 */
	int TO_INT = 37;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INT__EXPRESSION = UNARY_OPERATOR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>To Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Actor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INT___GET_ACTOR = UNARY_OPERATOR___GET_ACTOR;

	/**
	 * The number of operations of the '<em>To Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the '{@link klang.SpriteActor#print(java.lang.String) <em>Print</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print</em>' operation.
	 * @see klang.SpriteActor#print(java.lang.String)
	 * @generated
	 */
	EOperation getSpriteActor__Print__String();

	/**
	 * Returns the meta object for the '{@link klang.SpriteActor#getX() <em>Get X</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get X</em>' operation.
	 * @see klang.SpriteActor#getX()
	 * @generated
	 */
	EOperation getSpriteActor__GetX();

	/**
	 * Returns the meta object for the '{@link klang.SpriteActor#getY() <em>Get Y</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Y</em>' operation.
	 * @see klang.SpriteActor#getY()
	 * @generated
	 */
	EOperation getSpriteActor__GetY();

	/**
	 * Returns the meta object for the '{@link klang.SpriteActor#setY(java.lang.Double) <em>Set Y</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Y</em>' operation.
	 * @see klang.SpriteActor#setY(java.lang.Double)
	 * @generated
	 */
	EOperation getSpriteActor__SetY__Double();

	/**
	 * Returns the meta object for the '{@link klang.SpriteActor#setX(java.lang.Double) <em>Set X</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set X</em>' operation.
	 * @see klang.SpriteActor#setX(java.lang.Double)
	 * @generated
	 */
	EOperation getSpriteActor__SetX__Double();

	/**
	 * Returns the meta object for the '{@link klang.SpriteActor#print(java.lang.Double) <em>Print</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print</em>' operation.
	 * @see klang.SpriteActor#print(java.lang.Double)
	 * @generated
	 */
	EOperation getSpriteActor__Print__Double();

	/**
	 * Returns the meta object for the '{@link klang.SpriteActor#sleep(java.lang.Double) <em>Sleep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sleep</em>' operation.
	 * @see klang.SpriteActor#sleep(java.lang.Double)
	 * @generated
	 */
	EOperation getSpriteActor__Sleep__Double();

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
	 * Returns the meta object for class '{@link klang.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Loop</em>'.
	 * @see klang.WhileLoop
	 * @generated
	 */
	EClass getWhileLoop();

	/**
	 * Returns the meta object for the containment reference '{@link klang.WhileLoop#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see klang.WhileLoop#getPredicate()
	 * @see #getWhileLoop()
	 * @generated
	 */
	EReference getWhileLoop_Predicate();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.WhileLoop#getLoopBlock <em>Loop Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Block</em>'.
	 * @see klang.WhileLoop#getLoopBlock()
	 * @see #getWhileLoop()
	 * @generated
	 */
	EReference getWhileLoop_LoopBlock();

	/**
	 * Returns the meta object for class '{@link klang.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see klang.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link klang.If#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see klang.If#getPredicate()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Predicate();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.If#getIfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Block</em>'.
	 * @see klang.If#getIfBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_IfBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.If#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Block</em>'.
	 * @see klang.If#getElseBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseBlock();

	/**
	 * Returns the meta object for class '{@link klang.ForeverLoop <em>Forever Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forever Loop</em>'.
	 * @see klang.ForeverLoop
	 * @generated
	 */
	EClass getForeverLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.ForeverLoop#getLoopStatements <em>Loop Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Statements</em>'.
	 * @see klang.ForeverLoop#getLoopStatements()
	 * @see #getForeverLoop()
	 * @generated
	 */
	EReference getForeverLoop_LoopStatements();

	/**
	 * Returns the meta object for class '{@link klang.Yield <em>Yield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yield</em>'.
	 * @see klang.Yield
	 * @generated
	 */
	EClass getYield();

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
	 * Returns the meta object for class '{@link klang.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see klang.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link klang.VariableAssignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see klang.VariableAssignment#getExpression()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Expression();

	/**
	 * Returns the meta object for the attribute '{@link klang.VariableAssignment#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see klang.VariableAssignment#getVariableName()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EAttribute getVariableAssignment_VariableName();

	/**
	 * Returns the meta object for class '{@link klang.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see klang.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link klang.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element</em>'.
	 * @see klang.AbstractElement
	 * @generated
	 */
	EClass getAbstractElement();

	/**
	 * Returns the meta object for the '{@link klang.AbstractElement#getActor() <em>Get Actor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Actor</em>' operation.
	 * @see klang.AbstractElement#getActor()
	 * @generated
	 */
	EOperation getAbstractElement__GetActor();

	/**
	 * Returns the meta object for class '{@link klang.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see klang.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link klang.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see klang.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link klang.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see klang.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link klang.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see klang.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link klang.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see klang.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link klang.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply</em>'.
	 * @see klang.Multiply
	 * @generated
	 */
	EClass getMultiply();

	/**
	 * Returns the meta object for class '{@link klang.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see klang.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for class '{@link klang.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see klang.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link klang.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see klang.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link klang.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see klang.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for the containment reference '{@link klang.GreaterThan#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see klang.GreaterThan#getLeft()
	 * @see #getGreaterThan()
	 * @generated
	 */
	EReference getGreaterThan_Left();

	/**
	 * Returns the meta object for the containment reference '{@link klang.GreaterThan#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see klang.GreaterThan#getRight()
	 * @see #getGreaterThan()
	 * @generated
	 */
	EReference getGreaterThan_Right();

	/**
	 * Returns the meta object for class '{@link klang.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see klang.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link klang.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see klang.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link klang.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see klang.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link klang.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Literal</em>'.
	 * @see klang.DoubleLiteral
	 * @generated
	 */
	EClass getDoubleLiteral();

	/**
	 * Returns the meta object for the attribute '{@link klang.DoubleLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see klang.DoubleLiteral#getValue()
	 * @see #getDoubleLiteral()
	 * @generated
	 */
	EAttribute getDoubleLiteral_Value();

	/**
	 * Returns the meta object for class '{@link klang.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see klang.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link klang.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see klang.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link klang.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see klang.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for the attribute '{@link klang.VariableReference#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see klang.VariableReference#getVariableName()
	 * @see #getVariableReference()
	 * @generated
	 */
	EAttribute getVariableReference_VariableName();

	/**
	 * Returns the meta object for class '{@link klang.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see klang.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link klang.UnaryOperator#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see klang.UnaryOperator#getExpression()
	 * @see #getUnaryOperator()
	 * @generated
	 */
	EReference getUnaryOperator_Expression();

	/**
	 * Returns the meta object for class '{@link klang.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator</em>'.
	 * @see klang.BinaryOperator
	 * @generated
	 */
	EClass getBinaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link klang.BinaryOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see klang.BinaryOperator#getLeft()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EReference getBinaryOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link klang.BinaryOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see klang.BinaryOperator#getRight()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EReference getBinaryOperator_Right();

	/**
	 * Returns the meta object for class '{@link klang.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see klang.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link klang.FunctionCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klang.FunctionCall#getName()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.FunctionCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see klang.FunctionCall#getParameters()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Parameters();

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
	 * Returns the meta object for class '{@link klang.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see klang.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link klang.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see klang.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link klang.Sleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sleep</em>'.
	 * @see klang.Sleep
	 * @generated
	 */
	EClass getSleep();

	/**
	 * Returns the meta object for the attribute '{@link klang.Sleep#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see klang.Sleep#getDuration()
	 * @see #getSleep()
	 * @generated
	 */
	EAttribute getSleep_Duration();

	/**
	 * Returns the meta object for class '{@link klang.UnaryMinus <em>Unary Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Minus</em>'.
	 * @see klang.UnaryMinus
	 * @generated
	 */
	EClass getUnaryMinus();

	/**
	 * Returns the meta object for class '{@link klang.ToDouble <em>To Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Double</em>'.
	 * @see klang.ToDouble
	 * @generated
	 */
	EClass getToDouble();

	/**
	 * Returns the meta object for class '{@link klang.ToInt <em>To Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Int</em>'.
	 * @see klang.ToInt
	 * @generated
	 */
	EClass getToInt();

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
	 * Returns the meta object for the '{@link klang.AbstractActor#getSubtree() <em>Get Subtree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Subtree</em>' operation.
	 * @see klang.AbstractActor#getSubtree()
	 * @generated
	 */
	EOperation getAbstractActor__GetSubtree();

	/**
	 * Returns the meta object for class '{@link klang.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see klang.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.Scope#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see klang.Scope#getLocalVariables()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_LocalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link klang.Scope#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see klang.Scope#getChildren()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Children();

	/**
	 * Returns the meta object for the container reference '{@link klang.Scope#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see klang.Scope#getParent()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Parent();

	/**
	 * Returns the meta object for the '{@link klang.Scope#isInScope(java.lang.String) <em>Is In Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Scope</em>' operation.
	 * @see klang.Scope#isInScope(java.lang.String)
	 * @generated
	 */
	EOperation getScope__IsInScope__String();

	/**
	 * Returns the meta object for the '{@link klang.Scope#getVariableDeclaration(java.lang.String) <em>Get Variable Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Declaration</em>' operation.
	 * @see klang.Scope#getVariableDeclaration(java.lang.String)
	 * @generated
	 */
	EOperation getScope__GetVariableDeclaration__String();

	/**
	 * Returns the meta object for the '{@link klang.Scope#isInLocalScope(java.lang.String) <em>Is In Local Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Local Scope</em>' operation.
	 * @see klang.Scope#isInLocalScope(java.lang.String)
	 * @generated
	 */
	EOperation getScope__IsInLocalScope__String();

	/**
	 * Returns the meta object for the '{@link klang.Scope#isInParentScope(java.lang.String) <em>Is In Parent Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Parent Scope</em>' operation.
	 * @see klang.Scope#isInParentScope(java.lang.String)
	 * @generated
	 */
	EOperation getScope__IsInParentScope__String();

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
		 * The meta object literal for the '<em><b>Print</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPRITE_ACTOR___PRINT__STRING = eINSTANCE.getSpriteActor__Print__String();

		/**
		 * The meta object literal for the '<em><b>Get X</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPRITE_ACTOR___GET_X = eINSTANCE.getSpriteActor__GetX();

		/**
		 * The meta object literal for the '<em><b>Get Y</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPRITE_ACTOR___GET_Y = eINSTANCE.getSpriteActor__GetY();

		/**
		 * The meta object literal for the '<em><b>Set Y</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPRITE_ACTOR___SET_Y__DOUBLE = eINSTANCE.getSpriteActor__SetY__Double();

		/**
		 * The meta object literal for the '<em><b>Set X</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPRITE_ACTOR___SET_X__DOUBLE = eINSTANCE.getSpriteActor__SetX__Double();

		/**
		 * The meta object literal for the '<em><b>Print</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPRITE_ACTOR___PRINT__DOUBLE = eINSTANCE.getSpriteActor__Print__Double();

		/**
		 * The meta object literal for the '<em><b>Sleep</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPRITE_ACTOR___SLEEP__DOUBLE = eINSTANCE.getSpriteActor__Sleep__Double();

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
		 * The meta object literal for the '{@link klang.impl.WhileLoopImpl <em>While Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.WhileLoopImpl
		 * @see klang.impl.KlangPackageImpl#getWhileLoop()
		 * @generated
		 */
		EClass WHILE_LOOP = eINSTANCE.getWhileLoop();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_LOOP__PREDICATE = eINSTANCE.getWhileLoop_Predicate();

		/**
		 * The meta object literal for the '<em><b>Loop Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_LOOP__LOOP_BLOCK = eINSTANCE.getWhileLoop_LoopBlock();

		/**
		 * The meta object literal for the '{@link klang.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.IfImpl
		 * @see klang.impl.KlangPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__PREDICATE = eINSTANCE.getIf_Predicate();

		/**
		 * The meta object literal for the '<em><b>If Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__IF_BLOCK = eINSTANCE.getIf_IfBlock();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_BLOCK = eINSTANCE.getIf_ElseBlock();

		/**
		 * The meta object literal for the '{@link klang.impl.ForeverLoopImpl <em>Forever Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.ForeverLoopImpl
		 * @see klang.impl.KlangPackageImpl#getForeverLoop()
		 * @generated
		 */
		EClass FOREVER_LOOP = eINSTANCE.getForeverLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREVER_LOOP__LOOP_STATEMENTS = eINSTANCE.getForeverLoop_LoopStatements();

		/**
		 * The meta object literal for the '{@link klang.impl.YieldImpl <em>Yield</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.YieldImpl
		 * @see klang.impl.KlangPackageImpl#getYield()
		 * @generated
		 */
		EClass YIELD = eINSTANCE.getYield();

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
		 * The meta object literal for the '{@link klang.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.VariableAssignmentImpl
		 * @see klang.impl.KlangPackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__EXPRESSION = eINSTANCE.getVariableAssignment_Expression();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ASSIGNMENT__VARIABLE_NAME = eINSTANCE.getVariableAssignment_VariableName();

		/**
		 * The meta object literal for the '{@link klang.Statement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.Statement
		 * @see klang.impl.KlangPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link klang.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.AbstractElementImpl
		 * @see klang.impl.KlangPackageImpl#getAbstractElement()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

		/**
		 * The meta object literal for the '<em><b>Get Actor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ELEMENT___GET_ACTOR = eINSTANCE.getAbstractElement__GetActor();

		/**
		 * The meta object literal for the '{@link klang.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.ExpressionImpl
		 * @see klang.impl.KlangPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link klang.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.OrImpl
		 * @see klang.impl.KlangPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link klang.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.AndImpl
		 * @see klang.impl.KlangPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link klang.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.PlusImpl
		 * @see klang.impl.KlangPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link klang.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.MinusImpl
		 * @see klang.impl.KlangPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link klang.impl.MultiplyImpl <em>Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.MultiplyImpl
		 * @see klang.impl.KlangPackageImpl#getMultiply()
		 * @generated
		 */
		EClass MULTIPLY = eINSTANCE.getMultiply();

		/**
		 * The meta object literal for the '{@link klang.impl.DivideImpl <em>Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.DivideImpl
		 * @see klang.impl.KlangPackageImpl#getDivide()
		 * @generated
		 */
		EClass DIVIDE = eINSTANCE.getDivide();

		/**
		 * The meta object literal for the '{@link klang.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.LessThanImpl
		 * @see klang.impl.KlangPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link klang.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.EqualImpl
		 * @see klang.impl.KlangPackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link klang.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.GreaterThanImpl
		 * @see klang.impl.KlangPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_THAN__LEFT = eINSTANCE.getGreaterThan_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_THAN__RIGHT = eINSTANCE.getGreaterThan_Right();

		/**
		 * The meta object literal for the '{@link klang.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.NotImpl
		 * @see klang.impl.KlangPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link klang.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.BooleanLiteralImpl
		 * @see klang.impl.KlangPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link klang.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.DoubleLiteralImpl
		 * @see klang.impl.KlangPackageImpl#getDoubleLiteral()
		 * @generated
		 */
		EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_LITERAL__VALUE = eINSTANCE.getDoubleLiteral_Value();

		/**
		 * The meta object literal for the '{@link klang.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.StringLiteralImpl
		 * @see klang.impl.KlangPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link klang.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.VariableReferenceImpl
		 * @see klang.impl.KlangPackageImpl#getVariableReference()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_REFERENCE__VARIABLE_NAME = eINSTANCE.getVariableReference_VariableName();

		/**
		 * The meta object literal for the '{@link klang.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.UnaryOperatorImpl
		 * @see klang.impl.KlangPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATOR__EXPRESSION = eINSTANCE.getUnaryOperator_Expression();

		/**
		 * The meta object literal for the '{@link klang.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.BinaryOperatorImpl
		 * @see klang.impl.KlangPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EClass BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR__LEFT = eINSTANCE.getBinaryOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR__RIGHT = eINSTANCE.getBinaryOperator_Right();

		/**
		 * The meta object literal for the '{@link klang.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.FunctionCallImpl
		 * @see klang.impl.KlangPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__NAME = eINSTANCE.getFunctionCall_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__PARAMETERS = eINSTANCE.getFunctionCall_Parameters();

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
		 * The meta object literal for the '{@link klang.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.IntegerLiteralImpl
		 * @see klang.impl.KlangPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link klang.impl.SleepImpl <em>Sleep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.SleepImpl
		 * @see klang.impl.KlangPackageImpl#getSleep()
		 * @generated
		 */
		EClass SLEEP = eINSTANCE.getSleep();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLEEP__DURATION = eINSTANCE.getSleep_Duration();

		/**
		 * The meta object literal for the '{@link klang.impl.UnaryMinusImpl <em>Unary Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.UnaryMinusImpl
		 * @see klang.impl.KlangPackageImpl#getUnaryMinus()
		 * @generated
		 */
		EClass UNARY_MINUS = eINSTANCE.getUnaryMinus();

		/**
		 * The meta object literal for the '{@link klang.impl.ToDoubleImpl <em>To Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.ToDoubleImpl
		 * @see klang.impl.KlangPackageImpl#getToDouble()
		 * @generated
		 */
		EClass TO_DOUBLE = eINSTANCE.getToDouble();

		/**
		 * The meta object literal for the '{@link klang.impl.ToIntImpl <em>To Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.ToIntImpl
		 * @see klang.impl.KlangPackageImpl#getToInt()
		 * @generated
		 */
		EClass TO_INT = eINSTANCE.getToInt();

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
		 * The meta object literal for the '<em><b>Get Subtree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ACTOR___GET_SUBTREE = eINSTANCE.getAbstractActor__GetSubtree();

		/**
		 * The meta object literal for the '{@link klang.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klang.impl.ScopeImpl
		 * @see klang.impl.KlangPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__LOCAL_VARIABLES = eINSTANCE.getScope_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__CHILDREN = eINSTANCE.getScope_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__PARENT = eINSTANCE.getScope_Parent();

		/**
		 * The meta object literal for the '<em><b>Is In Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCOPE___IS_IN_SCOPE__STRING = eINSTANCE.getScope__IsInScope__String();

		/**
		 * The meta object literal for the '<em><b>Get Variable Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCOPE___GET_VARIABLE_DECLARATION__STRING = eINSTANCE.getScope__GetVariableDeclaration__String();

		/**
		 * The meta object literal for the '<em><b>Is In Local Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCOPE___IS_IN_LOCAL_SCOPE__STRING = eINSTANCE.getScope__IsInLocalScope__String();

		/**
		 * The meta object literal for the '<em><b>Is In Parent Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCOPE___IS_IN_PARENT_SCOPE__STRING = eINSTANCE.getScope__IsInParentScope__String();

	}

} //KlangPackage
