/**
 */
package klang.util;

import java.util.Map;
import klang.*;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import com.kaurel.klang.model.KlangPlugin;

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
			case KlangPackage.WHILE_LOOP:
				return validateWhileLoop((WhileLoop)value, diagnostics, context);
			case KlangPackage.IF:
				return validateIf((If)value, diagnostics, context);
			case KlangPackage.FOREVER_LOOP:
				return validateForeverLoop((ForeverLoop)value, diagnostics, context);
			case KlangPackage.YIELD:
				return validateYield((Yield)value, diagnostics, context);
			case KlangPackage.VARIABLE_DECLARATION:
				return validateVariableDeclaration((VariableDeclaration)value, diagnostics, context);
			case KlangPackage.VARIABLE_ASSIGNMENT:
				return validateVariableAssignment((VariableAssignment)value, diagnostics, context);
			case KlangPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case KlangPackage.OR:
				return validateOr((Or)value, diagnostics, context);
			case KlangPackage.AND:
				return validateAnd((And)value, diagnostics, context);
			case KlangPackage.PLUS:
				return validatePlus((Plus)value, diagnostics, context);
			case KlangPackage.MINUS:
				return validateMinus((Minus)value, diagnostics, context);
			case KlangPackage.MULTIPLY:
				return validateMultiply((Multiply)value, diagnostics, context);
			case KlangPackage.DIVIDE:
				return validateDivide((Divide)value, diagnostics, context);
			case KlangPackage.LESS_THAN:
				return validateLessThan((LessThan)value, diagnostics, context);
			case KlangPackage.EQUAL:
				return validateEqual((Equal)value, diagnostics, context);
			case KlangPackage.GREATER_THAN:
				return validateGreaterThan((GreaterThan)value, diagnostics, context);
			case KlangPackage.NOT:
				return validateNot((Not)value, diagnostics, context);
			case KlangPackage.BOOLEAN_LITERAL:
				return validateBooleanLiteral((BooleanLiteral)value, diagnostics, context);
			case KlangPackage.DOUBLE_LITERAL:
				return validateDoubleLiteral((DoubleLiteral)value, diagnostics, context);
			case KlangPackage.STRING_LITERAL:
				return validateStringLiteral((StringLiteral)value, diagnostics, context);
			case KlangPackage.VARIABLE_REFERENCE:
				return validateVariableReference((VariableReference)value, diagnostics, context);
			case KlangPackage.UNARY_OPERATOR:
				return validateUnaryOperator((UnaryOperator)value, diagnostics, context);
			case KlangPackage.BINARY_OPERATOR:
				return validateBinaryOperator((BinaryOperator)value, diagnostics, context);
			case KlangPackage.FUNCTION_CALL:
				return validateFunctionCall((FunctionCall)value, diagnostics, context);
			case KlangPackage.STATEMENT:
				return validateStatement((Statement)value, diagnostics, context);
			case KlangPackage.ABSTRACT_ELEMENT:
				return validateAbstractElement((AbstractElement)value, diagnostics, context);
			case KlangPackage.GAME_START:
				return validateGameStart((GameStart)value, diagnostics, context);
			case KlangPackage.SPRITE_CLICKED:
				return validateSpriteClicked((SpriteClicked)value, diagnostics, context);
			case KlangPackage.KEY_PRESSED:
				return validateKeyPressed((KeyPressed)value, diagnostics, context);
			case KlangPackage.COLLIDES_WITH:
				return validateCollidesWith((CollidesWith)value, diagnostics, context);
			case KlangPackage.INTEGER_LITERAL:
				return validateIntegerLiteral((IntegerLiteral)value, diagnostics, context);
			case KlangPackage.SLEEP:
				return validateSleep((Sleep)value, diagnostics, context);
			case KlangPackage.UNARY_MINUS:
				return validateUnaryMinus((UnaryMinus)value, diagnostics, context);
			case KlangPackage.TO_DOUBLE:
				return validateToDouble((ToDouble)value, diagnostics, context);
			case KlangPackage.TO_INT:
				return validateToInt((ToInt)value, diagnostics, context);
			case KlangPackage.ABSTRACT_ACTOR:
				return validateAbstractActor((AbstractActor<?>)value, diagnostics, context);
			case KlangPackage.SCOPE:
				return validateScope((Scope<?>)value, diagnostics, context);
			case KlangPackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
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
	public boolean validateWhileLoop(WhileLoop whileLoop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whileLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIf(If if_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(if_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeverLoop(ForeverLoop foreverLoop, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foreverLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYield(Yield yield, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yield, diagnostics, context);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAssignment(VariableAssignment variableAssignment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableAssignment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAssignment_scope(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAssignment_type(variableAssignment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the scope constraint of '<em>Variable Assignment</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * 
	 * @generated NOT
	 */
	public boolean validateVariableAssignment_scope(VariableAssignment variableAssignment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		AbstractActor<?> actor = variableAssignment.getActor();

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
		Class declared_type = typeComputer.computeType(variableAssignment.getActor().getVariableDeclaration(variableAssignment.getVariableName()).getExpression());
		Class expression_type = typeComputer.computeType(variableAssignment.getExpression());
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr(Or or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(or, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(or, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(or, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd(And and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(and, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(and, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(and, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlus(Plus plus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(plus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(plus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(plus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(plus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(plus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(plus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(plus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(plus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(plus, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(plus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinus(Minus minus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(minus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(minus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(minus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(minus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(minus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(minus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(minus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(minus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(minus, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(minus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiply(Multiply multiply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiply, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiply, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(multiply, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDivide(Divide divide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(divide, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(divide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(divide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(divide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(divide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(divide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(divide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(divide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(divide, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(divide, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThan(LessThan lessThan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lessThan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lessThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(lessThan, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqual(Equal equal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(equal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(equal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(equal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(equal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(equal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(equal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(equal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(equal, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(equal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThan(GreaterThan greaterThan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(greaterThan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNot(Not not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(not, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(not, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(not, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(not, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(not, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(not, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(not, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(not, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(not, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnaryOperator_type(not, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanLiteral(BooleanLiteral booleanLiteral, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleLiteral(DoubleLiteral doubleLiteral, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringLiteral(StringLiteral stringLiteral, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableReference(VariableReference variableReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableReference_scope(variableReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the scope constraint of '<em>Variable Reference</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVariableReference_scope(VariableReference variableReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		AbstractActor<?> actor = variableReference.getActor();
		if (!actor.isInScope(variableReference.getVariableName())) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_VariableReference_undefined",
						new Object[] { "scope", getObjectLabel(variableReference, context) },
						new Object[] { variableReference },
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
	public boolean validateUnaryOperator(UnaryOperator unaryOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unaryOperator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnaryOperator_type(unaryOperator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the type constraint of '<em>Unary Operator</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateUnaryOperator_type(UnaryOperator unaryOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Class return_type = typeComputer.computeType(unaryOperator);
		if (return_type == null) {
			Class parameter_type = typeComputer.computeType(unaryOperator.getExpression());
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryOperator(BinaryOperator binaryOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(binaryOperator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(binaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(binaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(binaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(binaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(binaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(binaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(binaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(binaryOperator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(binaryOperator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the type constraint of '<em>Binary Operator</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateBinaryOperator_type(BinaryOperator binaryOperator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Class return_type = typeComputer.computeType(binaryOperator);
		if (return_type == null) {
			Class left_type = typeComputer.computeType(binaryOperator.getLeft());
			Class right_type = typeComputer.computeType(binaryOperator.getRight());
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
	public boolean validateFunctionCall(FunctionCall functionCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionCall_methodDeclaration(functionCall, diagnostics, context);
		return result;
	}

	/**
	 * Validates the methodDeclaration constraint of '<em>Function Call</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionCall_methodDeclaration(FunctionCall functionCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "methodDeclaration", getObjectLabel(functionCall, context) },
						 new Object[] { functionCall },
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
	public boolean validateStatement(Statement statement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractElement(AbstractElement abstractElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameStart(GameStart gameStart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gameStart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpriteClicked(SpriteClicked spriteClicked, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spriteClicked, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyPressed(KeyPressed keyPressed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyPressed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollidesWith(CollidesWith collidesWith, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collidesWith, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerLiteral(IntegerLiteral integerLiteral, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSleep(Sleep sleep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sleep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryMinus(UnaryMinus unaryMinus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unaryMinus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unaryMinus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unaryMinus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unaryMinus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unaryMinus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unaryMinus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unaryMinus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unaryMinus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unaryMinus, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnaryOperator_type(unaryMinus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToDouble(ToDouble toDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(toDouble, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(toDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(toDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(toDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(toDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(toDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(toDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(toDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(toDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnaryOperator_type(toDouble, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToInt(ToInt toInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(toInt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(toInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(toInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(toInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(toInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(toInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(toInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(toInt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(toInt, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnaryOperator_type(toInt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractActor(AbstractActor<?> abstractActor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScope(Scope<?> scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scope, diagnostics, context);
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
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return KlangPlugin.INSTANCE;
	}

} // KlangValidator
