/**
 */
package klang.util;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import klang.*;
import klang.entities.Entity;
import klang.entities.SceneEntity;
import klang.entities.SpriteEntity;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import com.kaurel.klang.model.KlangPlugin;
import klangexpr.BinaryOperator;
import klangexpr.UnaryOperator;
import klangexpr.VariableAssignment;
import klangexpr.VariableReference;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see klang.KlangPackage
 * @generated
 */
public class KlangValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final KlangValidator INSTANCE = new KlangValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "klang";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public KlangValidator() {
		super();
	}

	private TypeComputer typeComputer = new MemoizingTypeComputer();

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return KlangPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
			case KlangPackage.SCENE_ACTOR:
				return validateSceneActor((SceneActor)value, diagnostics, context);
			case KlangPackage.SPRITE_ACTOR:
				return validateSpriteActor((SpriteActor)value, diagnostics, context);
			case KlangPackage.EVENT_HANDLER:
				return validateEventHandler((EventHandler)value, diagnostics, context);
			case KlangPackage.VARIABLE_DECLARATION:
				return validateVariableDeclaration((VariableDeclaration)value, diagnostics, context);
			case KlangPackage.ABSTRACT_ACTOR:
				return validateAbstractActor((AbstractActor<?>)value, diagnostics, context);
			case KlangPackage.GAME_START_EVENT:
				return validateGameStartEvent((GameStartEvent)value, diagnostics, context);
			case KlangPackage.CLICK_EVENT:
				return validateClickEvent((ClickEvent)value, diagnostics, context);
			case KlangPackage.KEY_PRESS_EVENT:
				return validateKeyPressEvent((KeyPressEvent)value, diagnostics, context);
			case KlangPackage.COLLISION_EVENT:
				return validateCollisionEvent((CollisionEvent)value, diagnostics, context);
			case KlangPackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case KlangPackage.TREE_NODE:
				return validateTreeNode((TreeNode<?>)value, diagnostics, context);
			case KlangPackage.MESSAGE_RECEIVED_EVENT:
				return validateMessageReceivedEvent((MessageReceivedEvent)value, diagnostics, context);
			case KlangPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case KlangPackage.GLOBAL_EVENT:
				return validateGlobalEvent((GlobalEvent)value, diagnostics, context);
			case KlangPackage.ACTOR_EVENT:
				return validateActorEvent((ActorEvent)value, diagnostics, context);
			case KlangPackage.KEYS:
				return validateKeys((Keys)value, diagnostics, context);
			case KlangPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case KlangPackage.SPRITE_ENTITY:
				return validateSpriteEntity((SpriteEntity)value, diagnostics, context);
			case KlangPackage.SCENE_ENTITY:
				return validateSceneEntity((SceneEntity)value, diagnostics, context);
			case KlangPackage.OPTIONAL:
				return validateOptional((Optional<?>)value, diagnostics, context);
			case KlangPackage.STREAM:
				return validateStream((Stream<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSceneActor(SceneActor sceneActor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sceneActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpriteActor(SpriteActor spriteActor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spriteActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventHandler(EventHandler eventHandler, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventHandler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclaration(VariableDeclaration variableDeclaration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableDeclaration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableDeclaration_scope(variableDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the scope constraint of '<em>Variable Declaration</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVariableDeclaration_scope(VariableDeclaration variableDeclaration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		AbstractActor<?> actor = variableDeclaration.getActor();

		boolean declaredInLocalAndParentScope = actor.isInLocalScope(variableDeclaration.getName())
				&& actor.isInParentScope(variableDeclaration.getName());

		if (declaredInLocalAndParentScope) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_ERROR_VariableDeclaration_AlreadyDeclaredInParentScope",
						new Object[] { variableDeclaration.getName(), getObjectLabel(variableDeclaration, context) },
						new Object[] { variableDeclaration },
						context));
			}
			return false;
		}

		boolean declaredMultipleTimesInLocalScope = actor.getLocalVariables().stream()
				.filter(v -> v.getName().equals(variableDeclaration.getName()))
				.count() > 1;

		if (declaredMultipleTimesInLocalScope) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_ERROR_VariableDeclaration_DuplicateInLocalScope",
						new Object[] { variableDeclaration.getName(), getObjectLabel(variableDeclaration, context) },
						new Object[] { variableDeclaration },
						context));
			}
			return false;
		}

		return true;
	}

	/**
	 * Validates the scope constraint of '<em>Variable Declaration</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	/**
	 * Validates the scope constraint of '<em>Variable Assignment</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * 
	 * @generated NOT
	 */
	public boolean validateVariableAssignment_scope(VariableAssignment variableAssignment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		AbstractActor<?> actor = KlangUtil.getActor(variableAssignment);

		if (!actor.isInScope(variableAssignment.getVariableName())) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_VariableAssignment_undefined",
						new Object[] { variableAssignment.getVariableName(),
								getObjectLabel(variableAssignment, context) },
						new Object[] { variableAssignment },
						context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the type constraint of '<em>Variable Assignment</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVariableAssignment_type(VariableAssignment variableAssignment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		AbstractActor<?> actor = KlangUtil.getActor(variableAssignment);
		Class<?> declared_type = typeComputer.computeType(actor.getVariableDeclaration(variableAssignment.getVariableName()).getExpression());
		Class<?> expression_type = typeComputer.computeType(variableAssignment.getExpression());
		if (declared_type!=expression_type) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_VariableAssignment_type",
						new Object[] { expression_type.getSimpleName(), variableAssignment.getVariableName(), declared_type.getSimpleName(), getObjectLabel(variableAssignment, context) },
						new Object[] { variableAssignment },
						context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the scope constraint of '<em>Variable Reference</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVariableReference_scope(VariableReference variableReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		AbstractActor<?> actor = KlangUtil.getActor(variableReference);
		if (!actor.isInScope(variableReference.getVariableName())) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_VariableReference_undefined",
						new Object[] { variableReference.getVariableName(), getObjectLabel(variableReference, context) },
						new Object[] { variableReference },
						context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the type constraint of '<em>Unary Operator</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateUnaryOperator_type(UnaryOperator unaryOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Class<?> return_type = typeComputer.computeType(unaryOperator);
		if (return_type == null) {
			Class<?> parameter_type = typeComputer.computeType(unaryOperator.getExpression());
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UnaryOperator_type",
						new Object[] { unaryOperator.getClass().getSimpleName(), parameter_type.getSimpleName(),
								getObjectLabel(unaryOperator, context) },
						new Object[] { unaryOperator },
						context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the type constraint of '<em>Binary Operator</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateBinaryOperator_type(BinaryOperator binaryOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Class<?> return_type = typeComputer.computeType(binaryOperator);
		if (return_type == null) {
			Class<?> left_type = typeComputer.computeType(binaryOperator.getLeft());
			Class<?> right_type = typeComputer.computeType(binaryOperator.getRight());
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_BinaryOperator_type",
						new Object[] { binaryOperator.getClass().getSimpleName(), left_type.getSimpleName(),
								right_type.getSimpleName(), getObjectLabel(binaryOperator, context) },
						new Object[] { binaryOperator },
						context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractActor(AbstractActor<?> abstractActor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameStartEvent(GameStartEvent gameStartEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gameStartEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClickEvent(ClickEvent clickEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clickEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyPressEvent(KeyPressEvent keyPressEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyPressEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollisionEvent(CollisionEvent collisionEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collisionEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreeNode(TreeNode<?> treeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(treeNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageReceivedEvent(MessageReceivedEvent messageReceivedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageReceivedEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalEvent(GlobalEvent globalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActorEvent(ActorEvent actorEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actorEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeys(Keys keys, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpriteEntity(SpriteEntity spriteEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSceneEntity(SceneEntity sceneEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptional(Optional<?> optional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStream(Stream<?> stream, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return KlangPlugin.INSTANCE;
	}

} // KlangValidator
