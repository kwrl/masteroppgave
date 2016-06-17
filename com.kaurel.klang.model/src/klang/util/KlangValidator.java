/**
 */
package klang.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
			case KlangPackage.GAME:
				return validateGame((Game)value, diagnostics, context);
			case KlangPackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case KlangPackage.EVENT_HANDLER:
				return validateEventHandler((EventHandler)value, diagnostics, context);
			case KlangPackage.WHILE_LOOP:
				return validateWhileLoop((WhileLoop)value, diagnostics, context);
			case KlangPackage.IF:
				return validateIf((If)value, diagnostics, context);
			case KlangPackage.FOREVER_LOOP:
				return validateForeverLoop((ForeverLoop)value, diagnostics, context);
			case KlangPackage.STATEMENT:
				return validateStatement((Statement)value, diagnostics, context);
			case KlangPackage.CONTROL_STATEMENT:
				return validateControlStatement((ControlStatement)value, diagnostics, context);
			case KlangPackage.YIELD:
				return validateYield((Yield)value, diagnostics, context);
			case KlangPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
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
			case KlangPackage.NUMERIC_LITERAL:
				return validateNumericLiteral((NumericLiteral)value, diagnostics, context);
			case KlangPackage.STRING_LITERAL:
				return validateStringLiteral((StringLiteral)value, diagnostics, context);
			case KlangPackage.VARIABLE_REF:
				return validateVariableRef((VariableRef)value, diagnostics, context);
			case KlangPackage.UNARY_OPERATOR:
				return validateUnaryOperator((UnaryOperator)value, diagnostics, context);
			case KlangPackage.BINARY_OPERATOR:
				return validateBinaryOperator((BinaryOperator)value, diagnostics, context);
			case KlangPackage.FUNCTION_CALL:
				return validateFunctionCall((FunctionCall)value, diagnostics, context);
			case KlangPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case KlangPackage.SPRITE_ENTITY:
				return validateSpriteEntity((SpriteEntity)value, diagnostics, context);
			case KlangPackage.SCENE_ENTITY:
				return validateSceneEntity((SceneEntity)value, diagnostics, context);
			case KlangPackage.EVENT_TYPE:
				return validateEventType((EventType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(game, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actor, diagnostics, context);
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
	public boolean validateStatement(Statement statement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlStatement(ControlStatement controlStatement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYield(Yield yield, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yield, diagnostics, context);
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
	 * @generated NOT
	 */
	public boolean validateVariableAssignment_scope(VariableAssignment variableAssignment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (variableAssignment.getVariable() != null) {
			return true;
		}

		diagnostics
				.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
						new Object[] { "no variable named " + variableAssignment.getVariableName() + " in scope",
								getObjectLabel(variableAssignment, context) },
						new Object[] { variableAssignment }, context));

		return false;
	}

	/**
	 * Validates the type constraint of '<em>Variable Assignment</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVariableAssignment_type(VariableAssignment variableAssignment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Class declarationType = typeComputer.doSwitch(variableAssignment.getVariable().getExpression());
		Class assignmentType = typeComputer.doSwitch(variableAssignment.getExpression());

		// Expression of undefined type, handled in expression constraints.
		if (declarationType == null || assignmentType == null) {
			return false;
		}
		if (declarationType != assignmentType) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] {
										"cannot assign value of type " + assignmentType + " to variable "
												+ variableAssignment.getVariableName() + " of type " + declarationType,
										getObjectLabel(variableAssignment, context) },
								new Object[] { variableAssignment }, context));
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
	public boolean validateNumericLiteral(NumericLiteral numericLiteral, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericLiteral, diagnostics, context);
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
	public boolean validateVariableRef(VariableRef variableRef, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableRef_scope(variableRef, diagnostics, context);
		return result;
	}

	/**
	 * Validates the scope constraint of '<em>Variable Ref</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVariableRef_scope(VariableRef variableRef, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (variableRef.getVariable() == null) {
			diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
					new Object[] { "no variable " + variableRef.getVariableName() + " in scope",
							getObjectLabel(variableRef, context) },
					new Object[] { variableRef }, context));
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
	 * Validates the type constraint of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUnaryOperator_type(UnaryOperator unaryOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (typeComputer.doSwitch(unaryOperator)==null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "operator "+unaryOperator.getClass()+" undefined for type "+typeComputer.doSwitch(unaryOperator.getExpression()), getObjectLabel(unaryOperator, context) },
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
	 * Validates the type constraint of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBinaryOperator_type(BinaryOperator binaryOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (typeComputer.doSwitch(binaryOperator)==null) {
			Class leftType = typeComputer.doSwitch(binaryOperator.getLeft());
			Class rightType = typeComputer.doSwitch(binaryOperator.getRight());
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Operator "+binaryOperator.getClass()+" undefined for types "+ leftType +" and " + rightType, getObjectLabel(binaryOperator, context) },
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
	 * 
	 * @generated NOT
	 */
	public boolean validateFunctionCall_methodDeclaration(FunctionCall functionCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariable_scope(variable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the scope constraint of '<em>Variable</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateVariable_scope(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		Actor actor = KlangUtil.getActor(variable);
		Game game = KlangUtil.getGame(variable);

		if (game.getVariableDeclarations().contains(variable) && actor.getVariableDeclarations().contains(variable)) {

			diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
					new Object[] { "multiple declarations of variable: " + variable.getName(),
							getObjectLabel(variable, context) },
					new Object[] { variable }, context));

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpriteEntity(SpriteEntity spriteEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spriteEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSceneEntity(SceneEntity sceneEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sceneEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType(EventType eventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // KlangValidator
