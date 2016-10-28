/**
 */
package klang.impl;

import java.util.Optional;
import java.util.stream.Stream;
import klang.AbstractActor;
import klang.ActorEvent;
import klang.ClickEvent;
import klang.CollisionEvent;
import klang.Event;
import klang.EventHandler;
import klang.GameStartEvent;
import klang.GlobalEvent;
import klang.KeyPressEvent;
import klang.Keys;
import klang.KlangFactory;
import klang.KlangPackage;
import klang.MessageReceivedEvent;
import klang.Program;
import klang.SceneActor;
import klang.SpriteActor;
import klang.TreeNode;
import klang.VariableDeclaration;

import klang.entities.Entity;
import klang.entities.SceneEntity;
import klang.entities.SpriteEntity;
import klang.util.KlangValidator;

import klangexpr.KlangexprPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
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
	private EClass sceneActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spriteActorEClass = null;

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
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameStartEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clickEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyPressEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collisionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageReceivedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keysEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType entityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType spriteEntityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sceneEntityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType optionalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType streamEDataType = null;

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

		// Initialize simple dependencies
		KlangexprPackage.eINSTANCE.eClass();

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
	public EClass getSceneActor() {
		return sceneActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSceneActor_Program() {
		return (EReference)sceneActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpriteActor() {
		return spriteActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpriteActor_Program() {
		return (EReference)spriteActorEClass.getEStructuralFeatures().get(0);
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
	public EReference getEventHandler_Statements() {
		return (EReference)eventHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventHandler_Actor() {
		return (EReference)eventHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventHandler_ReferenceEvent() {
		return (EReference)eventHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Expression() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_Name() {
		return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Actor() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractActor() {
		return abstractActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractActor_EventHandlers() {
		return (EReference)abstractActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractActor_Name() {
		return (EAttribute)abstractActorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractActor_Subject() {
		return (EAttribute)abstractActorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractActor_LocalVariables() {
		return (EReference)abstractActorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractActor_SubjectType() {
		return (EAttribute)abstractActorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractActor__IsInScope__String() {
		return abstractActorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractActor__GetVariableDeclaration__String() {
		return abstractActorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractActor__IsInLocalScope__String() {
		return abstractActorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractActor__IsInParentScope__String() {
		return abstractActorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractActor__GetVariableDeclarations__String() {
		return abstractActorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameStartEvent() {
		return gameStartEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClickEvent() {
		return clickEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyPressEvent() {
		return keyPressEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyPressEvent_Key() {
		return (EAttribute)keyPressEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollisionEvent() {
		return collisionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollisionEvent_Target() {
		return (EReference)collisionEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_SceneActor() {
		return (EReference)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_SpriteActors() {
		return (EReference)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeNode() {
		return treeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeNode_Children() {
		return (EReference)treeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeNode_Parent() {
		return (EReference)treeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageReceivedEvent() {
		return messageReceivedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageReceivedEvent_Name() {
		return (EAttribute)messageReceivedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEvent__MatchingEvent__Event() {
		return eventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalEvent() {
		return globalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorEvent() {
		return actorEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKeys() {
		return keysEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEntity() {
		return entityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpriteEntity() {
		return spriteEntityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSceneEntity() {
		return sceneEntityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOptional() {
		return optionalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStream() {
		return streamEDataType;
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
		sceneActorEClass = createEClass(SCENE_ACTOR);
		createEReference(sceneActorEClass, SCENE_ACTOR__PROGRAM);

		spriteActorEClass = createEClass(SPRITE_ACTOR);
		createEReference(spriteActorEClass, SPRITE_ACTOR__PROGRAM);

		eventHandlerEClass = createEClass(EVENT_HANDLER);
		createEReference(eventHandlerEClass, EVENT_HANDLER__STATEMENTS);
		createEReference(eventHandlerEClass, EVENT_HANDLER__ACTOR);
		createEReference(eventHandlerEClass, EVENT_HANDLER__REFERENCE_EVENT);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__EXPRESSION);
		createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__ACTOR);

		abstractActorEClass = createEClass(ABSTRACT_ACTOR);
		createEReference(abstractActorEClass, ABSTRACT_ACTOR__EVENT_HANDLERS);
		createEAttribute(abstractActorEClass, ABSTRACT_ACTOR__NAME);
		createEAttribute(abstractActorEClass, ABSTRACT_ACTOR__SUBJECT);
		createEReference(abstractActorEClass, ABSTRACT_ACTOR__LOCAL_VARIABLES);
		createEAttribute(abstractActorEClass, ABSTRACT_ACTOR__SUBJECT_TYPE);
		createEOperation(abstractActorEClass, ABSTRACT_ACTOR___IS_IN_SCOPE__STRING);
		createEOperation(abstractActorEClass, ABSTRACT_ACTOR___GET_VARIABLE_DECLARATION__STRING);
		createEOperation(abstractActorEClass, ABSTRACT_ACTOR___IS_IN_LOCAL_SCOPE__STRING);
		createEOperation(abstractActorEClass, ABSTRACT_ACTOR___IS_IN_PARENT_SCOPE__STRING);
		createEOperation(abstractActorEClass, ABSTRACT_ACTOR___GET_VARIABLE_DECLARATIONS__STRING);

		gameStartEventEClass = createEClass(GAME_START_EVENT);

		clickEventEClass = createEClass(CLICK_EVENT);

		keyPressEventEClass = createEClass(KEY_PRESS_EVENT);
		createEAttribute(keyPressEventEClass, KEY_PRESS_EVENT__KEY);

		collisionEventEClass = createEClass(COLLISION_EVENT);
		createEReference(collisionEventEClass, COLLISION_EVENT__TARGET);

		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__SCENE_ACTOR);
		createEReference(programEClass, PROGRAM__SPRITE_ACTORS);

		treeNodeEClass = createEClass(TREE_NODE);
		createEReference(treeNodeEClass, TREE_NODE__CHILDREN);
		createEReference(treeNodeEClass, TREE_NODE__PARENT);

		messageReceivedEventEClass = createEClass(MESSAGE_RECEIVED_EVENT);
		createEAttribute(messageReceivedEventEClass, MESSAGE_RECEIVED_EVENT__NAME);

		eventEClass = createEClass(EVENT);
		createEOperation(eventEClass, EVENT___MATCHING_EVENT__EVENT);

		globalEventEClass = createEClass(GLOBAL_EVENT);

		actorEventEClass = createEClass(ACTOR_EVENT);

		// Create enums
		keysEEnum = createEEnum(KEYS);

		// Create data types
		entityEDataType = createEDataType(ENTITY);
		spriteEntityEDataType = createEDataType(SPRITE_ENTITY);
		sceneEntityEDataType = createEDataType(SCENE_ENTITY);
		optionalEDataType = createEDataType(OPTIONAL);
		streamEDataType = createEDataType(STREAM);
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

		// Obtain other dependent packages
		KlangexprPackage theKlangexprPackage = (KlangexprPackage)EPackage.Registry.INSTANCE.getEPackage(KlangexprPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractActorEClass_T = addETypeParameter(abstractActorEClass, "T");
		ETypeParameter treeNodeEClass_T = addETypeParameter(treeNodeEClass, "T");
		addETypeParameter(optionalEDataType, "T");
		addETypeParameter(streamEDataType, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getEntity());
		abstractActorEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getTreeNode());
		EGenericType g2 = createEGenericType(treeNodeEClass_T);
		g1.getETypeArguments().add(g2);
		treeNodeEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getAbstractActor());
		g2 = createEGenericType(this.getSceneEntity());
		g1.getETypeArguments().add(g2);
		sceneActorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractActor());
		g2 = createEGenericType(this.getSpriteEntity());
		g1.getETypeArguments().add(g2);
		spriteActorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTreeNode());
		g2 = createEGenericType(this.getAbstractActor());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		abstractActorEClass.getEGenericSuperTypes().add(g1);
		gameStartEventEClass.getESuperTypes().add(this.getGlobalEvent());
		clickEventEClass.getESuperTypes().add(this.getActorEvent());
		keyPressEventEClass.getESuperTypes().add(this.getGlobalEvent());
		collisionEventEClass.getESuperTypes().add(this.getActorEvent());
		messageReceivedEventEClass.getESuperTypes().add(this.getGlobalEvent());
		globalEventEClass.getESuperTypes().add(this.getEvent());
		actorEventEClass.getESuperTypes().add(this.getEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(sceneActorEClass, SceneActor.class, "SceneActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSceneActor_Program(), this.getProgram(), this.getProgram_SceneActor(), "program", null, 0, 1, SceneActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spriteActorEClass, SpriteActor.class, "SpriteActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpriteActor_Program(), this.getProgram(), this.getProgram_SpriteActors(), "program", null, 0, 1, SpriteActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventHandlerEClass, EventHandler.class, "EventHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventHandler_Statements(), theKlangexprPackage.getStatement(), null, "statements", null, 0, -1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getAbstractActor());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getEventHandler_Actor(), g1, this.getAbstractActor_EventHandlers(), "actor", null, 1, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventHandler_ReferenceEvent(), this.getEvent(), null, "referenceEvent", null, 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDeclaration_Expression(), theKlangexprPackage.getExpression(), null, "expression", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getAbstractActor());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getVariableDeclaration_Actor(), g1, this.getAbstractActor_LocalVariables(), "actor", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractActorEClass, AbstractActor.class, "AbstractActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractActor_EventHandlers(), this.getEventHandler(), this.getEventHandler_Actor(), "eventHandlers", null, 0, -1, AbstractActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractActor_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(abstractActorEClass_T);
		initEAttribute(getAbstractActor_Subject(), g1, "subject", null, 0, 1, AbstractActor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractActor_LocalVariables(), this.getVariableDeclaration(), this.getVariableDeclaration_Actor(), "localVariables", null, 0, -1, AbstractActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(abstractActorEClass_T);
		g1.getETypeArguments().add(g2);
		initEAttribute(getAbstractActor_SubjectType(), g1, "subjectType", null, 0, 1, AbstractActor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAbstractActor__IsInScope__String(), ecorePackage.getEBoolean(), "isInScope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractActor__GetVariableDeclaration__String(), this.getVariableDeclaration(), "getVariableDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractActor__IsInLocalScope__String(), ecorePackage.getEBoolean(), "isInLocalScope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractActor__IsInParentScope__String(), ecorePackage.getEBoolean(), "isInParentScope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractActor__GetVariableDeclarations__String(), null, "getVariableDeclarations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "variableName", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStream());
		g2 = createEGenericType(this.getVariableDeclaration());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(gameStartEventEClass, GameStartEvent.class, "GameStartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clickEventEClass, ClickEvent.class, "ClickEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyPressEventEClass, KeyPressEvent.class, "KeyPressEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyPressEvent_Key(), this.getKeys(), "key", null, 0, 1, KeyPressEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collisionEventEClass, CollisionEvent.class, "CollisionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollisionEvent_Target(), this.getSpriteActor(), null, "target", null, 0, 1, CollisionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_SceneActor(), this.getSceneActor(), this.getSceneActor_Program(), "sceneActor", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_SpriteActors(), this.getSpriteActor(), this.getSpriteActor_Program(), "spriteActors", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeNodeEClass, TreeNode.class, "TreeNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(treeNodeEClass_T);
		initEReference(getTreeNode_Children(), g1, null, "children", null, 0, -1, TreeNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(treeNodeEClass_T);
		initEReference(getTreeNode_Parent(), g1, null, "parent", null, 0, 1, TreeNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(messageReceivedEventEClass, MessageReceivedEvent.class, "MessageReceivedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageReceivedEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageReceivedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEvent__MatchingEvent__Event(), ecorePackage.getEBoolean(), "matchingEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getEvent());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(globalEventEClass, GlobalEvent.class, "GlobalEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorEventEClass, ActorEvent.class, "ActorEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(keysEEnum, Keys.class, "Keys");
		addEEnumLiteral(keysEEnum, Keys.A);
		addEEnumLiteral(keysEEnum, Keys.B);
		addEEnumLiteral(keysEEnum, Keys.C);
		addEEnumLiteral(keysEEnum, Keys.D);
		addEEnumLiteral(keysEEnum, Keys.E);
		addEEnumLiteral(keysEEnum, Keys.F);
		addEEnumLiteral(keysEEnum, Keys.G);
		addEEnumLiteral(keysEEnum, Keys.H);
		addEEnumLiteral(keysEEnum, Keys.I);
		addEEnumLiteral(keysEEnum, Keys.J);
		addEEnumLiteral(keysEEnum, Keys.K);
		addEEnumLiteral(keysEEnum, Keys.L);
		addEEnumLiteral(keysEEnum, Keys.M);
		addEEnumLiteral(keysEEnum, Keys.N);
		addEEnumLiteral(keysEEnum, Keys.O);
		addEEnumLiteral(keysEEnum, Keys.P);
		addEEnumLiteral(keysEEnum, Keys.Q);
		addEEnumLiteral(keysEEnum, Keys.R);
		addEEnumLiteral(keysEEnum, Keys.S);
		addEEnumLiteral(keysEEnum, Keys.T);
		addEEnumLiteral(keysEEnum, Keys.U);
		addEEnumLiteral(keysEEnum, Keys.V);
		addEEnumLiteral(keysEEnum, Keys.W);
		addEEnumLiteral(keysEEnum, Keys.X);
		addEEnumLiteral(keysEEnum, Keys.Y);
		addEEnumLiteral(keysEEnum, Keys.Z);
		addEEnumLiteral(keysEEnum, Keys.SPACE);
		addEEnumLiteral(keysEEnum, Keys.ENTER);
		addEEnumLiteral(keysEEnum, Keys.UP);
		addEEnumLiteral(keysEEnum, Keys.DOWN);
		addEEnumLiteral(keysEEnum, Keys.LEFT);
		addEEnumLiteral(keysEEnum, Keys.RIGHT);

		// Initialize data types
		initEDataType(entityEDataType, Entity.class, "Entity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(spriteEntityEDataType, SpriteEntity.class, "SpriteEntity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sceneEntityEDataType, SceneEntity.class, "SceneEntity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(optionalEDataType, Optional.class, "Optional", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(streamEDataType, Stream.class, "Stream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (variableDeclarationEClass, 
		   source, 
		   new String[] {
			 "constraints", "scope\n"
		   });
	}

} //KlangPackageImpl
