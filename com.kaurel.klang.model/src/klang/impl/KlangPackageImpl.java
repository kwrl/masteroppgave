/**
 */
package klang.impl;

import klang.Actor;
import klang.And;
import klang.BinaryOperator;
import klang.BooleanLiteral;
import klang.ControlStatement;
import klang.Divide;
import klang.Entity;
import klang.Equal;
import klang.EventHandler;
import klang.EventType;
import klang.Expression;
import klang.ForeverLoop;
import klang.FunctionCall;
import klang.Game;
import klang.GreaterThan;
import klang.If;
import klang.KlangFactory;
import klang.KlangPackage;
import klang.LessThan;
import klang.Minus;
import klang.Multiply;
import klang.Not;
import klang.NumericLiteral;
import klang.Or;
import klang.Plus;
import klang.SceneEntity;
import klang.SpriteEntity;
import klang.Statement;
import klang.StringLiteral;
import klang.UnaryOperator;
import klang.Variable;
import klang.VariableAssignment;
import klang.VariableRef;
import klang.WhileLoop;
import klang.Yield;
import klang.util.KlangValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KlangPackageImpl extends EPackageImpl implements KlangPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreverLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spriteEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see klang.KlangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KlangPackageImpl() {
		super(eNS_URI, KlangFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KlangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KlangPackage init() {
		if (isInited) return (KlangPackage)EPackage.Registry.INSTANCE.getEPackage(KlangPackage.eNS_URI);

		// Obtain or create and register package
		KlangPackageImpl theKlangPackage = (KlangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KlangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KlangPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theKlangPackage.createPackageContents();

		// Initialize created meta-data
		theKlangPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theKlangPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return KlangValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theKlangPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KlangPackage.eNS_URI, theKlangPackage);
		return theKlangPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_VariableDeclarations() {
		return (EReference)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_ActorDefs() {
		return (EReference)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_VariableDeclarations() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_EventHandlers() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Entity() {
		return (EReference)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventHandler() {
		return eventHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventHandler_EventType() {
		return (EAttribute)eventHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventHandler_Statements() {
		return (EReference)eventHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileLoop() {
		return whileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileLoop_Predicate() {
		return (EReference)whileLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileLoop_LoopBlock() {
		return (EReference)whileLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Predicate() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_IfBlock() {
		return (EReference)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeverLoop() {
		return foreverLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeverLoop_LoopStatements() {
		return (EReference)foreverLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlStatement() {
		return controlStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYield() {
		return yieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignment() {
		return variableAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignment_Expression() {
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAssignment_VariableName() {
		return (EAttribute)variableAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignment_Variable() {
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Expression() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Target() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpriteEntity() {
		return spriteEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpriteEntity_Name() {
		return (EAttribute)spriteEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpriteEntity__Hello() {
		return spriteEntityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSceneEntity() {
		return sceneEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlus() {
		return plusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinus() {
		return minusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiply() {
		return multiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivide() {
		return divideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqual() {
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGreaterThan_Left() {
		return (EReference)greaterThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGreaterThan_Right() {
		return (EReference)greaterThanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteral_Value() {
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericLiteral() {
		return numericLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericLiteral_Value() {
		return (EAttribute)numericLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_Value() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRef() {
		return variableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableRef_VariableName() {
		return (EAttribute)variableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableRef_Variable() {
		return (EReference)variableRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOperator() {
		return unaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryOperator_Expression() {
		return (EReference)unaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperator() {
		return binaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperator_Left() {
		return (EReference)binaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperator_Right() {
		return (EReference)binaryOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionCall() {
		return functionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionCall_Name() {
		return (EAttribute)functionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCall_Parameters() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventType() {
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlangFactory getKlangFactory() {
		return (KlangFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gameEClass = createEClass(GAME);
		createEReference(gameEClass, GAME__VARIABLE_DECLARATIONS);
		createEReference(gameEClass, GAME__ACTOR_DEFS);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__VARIABLE_DECLARATIONS);
		createEReference(actorEClass, ACTOR__EVENT_HANDLERS);
		createEReference(actorEClass, ACTOR__ENTITY);

		eventHandlerEClass = createEClass(EVENT_HANDLER);
		createEAttribute(eventHandlerEClass, EVENT_HANDLER__EVENT_TYPE);
		createEReference(eventHandlerEClass, EVENT_HANDLER__STATEMENTS);

		whileLoopEClass = createEClass(WHILE_LOOP);
		createEReference(whileLoopEClass, WHILE_LOOP__PREDICATE);
		createEReference(whileLoopEClass, WHILE_LOOP__LOOP_BLOCK);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__PREDICATE);
		createEReference(ifEClass, IF__IF_BLOCK);

		foreverLoopEClass = createEClass(FOREVER_LOOP);
		createEReference(foreverLoopEClass, FOREVER_LOOP__LOOP_STATEMENTS);

		statementEClass = createEClass(STATEMENT);

		controlStatementEClass = createEClass(CONTROL_STATEMENT);

		yieldEClass = createEClass(YIELD);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__EXPRESSION);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VALUE);

		variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__EXPRESSION);
		createEAttribute(variableAssignmentEClass, VARIABLE_ASSIGNMENT__VARIABLE_NAME);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__VARIABLE);

		expressionEClass = createEClass(EXPRESSION);

		orEClass = createEClass(OR);

		andEClass = createEClass(AND);

		plusEClass = createEClass(PLUS);

		minusEClass = createEClass(MINUS);

		multiplyEClass = createEClass(MULTIPLY);

		divideEClass = createEClass(DIVIDE);

		lessThanEClass = createEClass(LESS_THAN);

		equalEClass = createEClass(EQUAL);

		greaterThanEClass = createEClass(GREATER_THAN);
		createEReference(greaterThanEClass, GREATER_THAN__LEFT);
		createEReference(greaterThanEClass, GREATER_THAN__RIGHT);

		notEClass = createEClass(NOT);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		numericLiteralEClass = createEClass(NUMERIC_LITERAL);
		createEAttribute(numericLiteralEClass, NUMERIC_LITERAL__VALUE);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		variableRefEClass = createEClass(VARIABLE_REF);
		createEAttribute(variableRefEClass, VARIABLE_REF__VARIABLE_NAME);
		createEReference(variableRefEClass, VARIABLE_REF__VARIABLE);

		unaryOperatorEClass = createEClass(UNARY_OPERATOR);
		createEReference(unaryOperatorEClass, UNARY_OPERATOR__EXPRESSION);

		binaryOperatorEClass = createEClass(BINARY_OPERATOR);
		createEReference(binaryOperatorEClass, BINARY_OPERATOR__LEFT);
		createEReference(binaryOperatorEClass, BINARY_OPERATOR__RIGHT);

		functionCallEClass = createEClass(FUNCTION_CALL);
		createEAttribute(functionCallEClass, FUNCTION_CALL__NAME);
		createEReference(functionCallEClass, FUNCTION_CALL__PARAMETERS);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__TARGET);

		spriteEntityEClass = createEClass(SPRITE_ENTITY);
		createEAttribute(spriteEntityEClass, SPRITE_ENTITY__NAME);
		createEOperation(spriteEntityEClass, SPRITE_ENTITY___HELLO);

		sceneEntityEClass = createEClass(SCENE_ENTITY);

		// Create enums
		eventTypeEEnum = createEEnum(EVENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		whileLoopEClass.getESuperTypes().add(this.getControlStatement());
		ifEClass.getESuperTypes().add(this.getControlStatement());
		foreverLoopEClass.getESuperTypes().add(this.getControlStatement());
		controlStatementEClass.getESuperTypes().add(this.getStatement());
		yieldEClass.getESuperTypes().add(this.getControlStatement());
		variableEClass.getESuperTypes().add(this.getStatement());
		variableAssignmentEClass.getESuperTypes().add(this.getStatement());
		orEClass.getESuperTypes().add(this.getBinaryOperator());
		andEClass.getESuperTypes().add(this.getBinaryOperator());
		plusEClass.getESuperTypes().add(this.getBinaryOperator());
		minusEClass.getESuperTypes().add(this.getBinaryOperator());
		multiplyEClass.getESuperTypes().add(this.getBinaryOperator());
		divideEClass.getESuperTypes().add(this.getBinaryOperator());
		lessThanEClass.getESuperTypes().add(this.getBinaryOperator());
		equalEClass.getESuperTypes().add(this.getBinaryOperator());
		greaterThanEClass.getESuperTypes().add(this.getExpression());
		notEClass.getESuperTypes().add(this.getUnaryOperator());
		booleanLiteralEClass.getESuperTypes().add(this.getExpression());
		numericLiteralEClass.getESuperTypes().add(this.getExpression());
		stringLiteralEClass.getESuperTypes().add(this.getExpression());
		variableRefEClass.getESuperTypes().add(this.getExpression());
		unaryOperatorEClass.getESuperTypes().add(this.getExpression());
		binaryOperatorEClass.getESuperTypes().add(this.getExpression());
		functionCallEClass.getESuperTypes().add(this.getExpression());
		spriteEntityEClass.getESuperTypes().add(this.getEntity());
		sceneEntityEClass.getESuperTypes().add(this.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGame_VariableDeclarations(), this.getVariable(), null, "variableDeclarations", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_ActorDefs(), this.getActor(), null, "actorDefs", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_VariableDeclarations(), this.getVariable(), null, "variableDeclarations", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_EventHandlers(), this.getEventHandler(), null, "eventHandlers", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Entity(), this.getEntity(), null, "entity", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventHandlerEClass, EventHandler.class, "EventHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventHandler_EventType(), this.getEventType(), "eventType", null, 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventHandler_Statements(), this.getStatement(), null, "statements", null, 0, -1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileLoopEClass, WhileLoop.class, "WhileLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileLoop_Predicate(), this.getExpression(), null, "predicate", null, 0, 1, WhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileLoop_LoopBlock(), this.getStatement(), null, "loopBlock", null, 0, -1, WhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Predicate(), this.getExpression(), null, "predicate", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_IfBlock(), this.getStatement(), null, "ifBlock", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreverLoopEClass, ForeverLoop.class, "ForeverLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeverLoop_LoopStatements(), this.getStatement(), null, "loopStatements", null, 0, -1, ForeverLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlStatementEClass, ControlStatement.class, "ControlStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yieldEClass, Yield.class, "Yield", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Expression(), this.getExpression(), null, "expression", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignment_Expression(), this.getExpression(), null, "expression", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableAssignment_VariableName(), ecorePackage.getEString(), "variableName", null, 1, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAssignment_Variable(), this.getVariable(), null, "variable", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplyEClass, Multiply.class, "Multiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divideEClass, Divide.class, "Divide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalEClass, Equal.class, "Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGreaterThan_Left(), this.getExpression(), null, "left", null, 0, 1, GreaterThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGreaterThan_Right(), this.getExpression(), null, "right", null, 0, 1, GreaterThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericLiteralEClass, NumericLiteral.class, "NumericLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, NumericLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableRef_VariableName(), ecorePackage.getEString(), "variableName", "", 1, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableRef_Variable(), this.getVariable(), null, "variable", null, 0, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(unaryOperatorEClass, UnaryOperator.class, "UnaryOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryOperator_Expression(), this.getExpression(), null, "expression", null, 0, 1, UnaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryOperatorEClass, BinaryOperator.class, "BinaryOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperator_Left(), this.getExpression(), null, "left", null, 0, 1, BinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperator_Right(), this.getExpression(), null, "right", null, 0, 1, BinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionCall_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionCall_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Target(), ecorePackage.getEJavaObject(), "target", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spriteEntityEClass, SpriteEntity.class, "SpriteEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpriteEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, SpriteEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSpriteEntity__Hello(), null, "hello", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sceneEntityEClass, SceneEntity.class, "SceneEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(eventTypeEEnum, EventType.class, "EventType");
		addEEnumLiteral(eventTypeEEnum, EventType.GAME_STARTED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "constraints", "scope\n"
		   });	
		addAnnotation
		  (variableAssignmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "scope type\n"
		   });	
		addAnnotation
		  (variableRefEClass, 
		   source, 
		   new String[] {
			 "constraints", "scope\n"
		   });	
		addAnnotation
		  (unaryOperatorEClass, 
		   source, 
		   new String[] {
			 "constraints", "type\n"
		   });	
		addAnnotation
		  (binaryOperatorEClass, 
		   source, 
		   new String[] {
			 "constraints", "type\n"
		   });	
		addAnnotation
		  (functionCallEClass, 
		   source, 
		   new String[] {
			 "constraints", "methodDeclaration\n"
		   });
	}

} //KlangPackageImpl
