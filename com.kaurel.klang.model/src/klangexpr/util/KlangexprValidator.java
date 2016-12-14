/**
 */
package klangexpr.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import klang.AbstractActor;
import klang.VariableDeclaration;
import klang.util.KlangUtil;
import klang.util.MemoizingTypeComputer;
import klang.util.TypeComputer;
import klangexpr.And;
import klangexpr.BinaryOperator;
import klangexpr.BooleanLiteral;
import klangexpr.Divide;
import klangexpr.DoubleLiteral;
import klangexpr.Equal;
import klangexpr.Expression;
import klangexpr.ForeverLoop;
import klangexpr.FunctionCall;
import klangexpr.GreaterThan;
import klangexpr.GreaterThanOrEqual;
import klangexpr.If;
import klangexpr.IntegerLiteral;
import klangexpr.KlangexprPackage;
import klangexpr.LessThan;
import klangexpr.LessThanOrEqual;
import klangexpr.Minus;
import klangexpr.Multiply;
import klangexpr.Not;
import klangexpr.Operator;
import klangexpr.Or;
import klangexpr.Plus;
import klangexpr.SendMessage;
import klangexpr.Sleep;
import klangexpr.Statement;
import klangexpr.StringLiteral;
import klangexpr.ToDouble;
import klangexpr.ToInt;
import klangexpr.UnaryMinus;
import klangexpr.UnaryOperator;
import klangexpr.VariableAssignment;
import klangexpr.VariableReference;
import klangexpr.WhileLoop;
import klangexpr.Yield;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see klangexpr.KlangexprPackage
 * @generated
 */
public class KlangexprValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final KlangexprValidator INSTANCE = new KlangexprValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "klangexpr";

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

	protected TypeComputer typeComputer = new MemoizingTypeComputer();

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public KlangexprValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return KlangexprPackage.eINSTANCE;
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
			case KlangexprPackage.WHILE_LOOP:
				return validateWhileLoop((WhileLoop)value, diagnostics, context);
			case KlangexprPackage.IF:
				return validateIf((If)value, diagnostics, context);
			case KlangexprPackage.FOREVER_LOOP:
				return validateForeverLoop((ForeverLoop)value, diagnostics, context);
			case KlangexprPackage.YIELD:
				return validateYield((Yield)value, diagnostics, context);
			case KlangexprPackage.VARIABLE_ASSIGNMENT:
				return validateVariableAssignment((VariableAssignment)value, diagnostics, context);
			case KlangexprPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case KlangexprPackage.OR:
				return validateOr((Or)value, diagnostics, context);
			case KlangexprPackage.AND:
				return validateAnd((And)value, diagnostics, context);
			case KlangexprPackage.PLUS:
				return validatePlus((Plus)value, diagnostics, context);
			case KlangexprPackage.MINUS:
				return validateMinus((Minus)value, diagnostics, context);
			case KlangexprPackage.MULTIPLY:
				return validateMultiply((Multiply)value, diagnostics, context);
			case KlangexprPackage.DIVIDE:
				return validateDivide((Divide)value, diagnostics, context);
			case KlangexprPackage.LESS_THAN:
				return validateLessThan((LessThan)value, diagnostics, context);
			case KlangexprPackage.EQUAL:
				return validateEqual((Equal)value, diagnostics, context);
			case KlangexprPackage.GREATER_THAN:
				return validateGreaterThan((GreaterThan)value, diagnostics, context);
			case KlangexprPackage.NOT:
				return validateNot((Not)value, diagnostics, context);
			case KlangexprPackage.BOOLEAN_LITERAL:
				return validateBooleanLiteral((BooleanLiteral)value, diagnostics, context);
			case KlangexprPackage.DOUBLE_LITERAL:
				return validateDoubleLiteral((DoubleLiteral)value, diagnostics, context);
			case KlangexprPackage.STRING_LITERAL:
				return validateStringLiteral((StringLiteral)value, diagnostics, context);
			case KlangexprPackage.VARIABLE_REFERENCE:
				return validateVariableReference((VariableReference)value, diagnostics, context);
			case KlangexprPackage.UNARY_OPERATOR:
				return validateUnaryOperator((UnaryOperator)value, diagnostics, context);
			case KlangexprPackage.BINARY_OPERATOR:
				return validateBinaryOperator((BinaryOperator)value, diagnostics, context);
			case KlangexprPackage.FUNCTION_CALL:
				return validateFunctionCall((FunctionCall)value, diagnostics, context);
			case KlangexprPackage.INTEGER_LITERAL:
				return validateIntegerLiteral((IntegerLiteral)value, diagnostics, context);
			case KlangexprPackage.UNARY_MINUS:
				return validateUnaryMinus((UnaryMinus)value, diagnostics, context);
			case KlangexprPackage.TO_DOUBLE:
				return validateToDouble((ToDouble)value, diagnostics, context);
			case KlangexprPackage.TO_INT:
				return validateToInt((ToInt)value, diagnostics, context);
			case KlangexprPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case KlangexprPackage.STATEMENT:
				return validateStatement((Statement)value, diagnostics, context);
			case KlangexprPackage.SLEEP:
				return validateSleep((Sleep)value, diagnostics, context);
			case KlangexprPackage.SEND_MESSAGE:
				return validateSendMessage((SendMessage)value, diagnostics, context);
			case KlangexprPackage.LESS_THAN_OR_EQUAL:
				return validateLessThanOrEqual((LessThanOrEqual)value, diagnostics, context);
			case KlangexprPackage.GREATER_THAN_OR_EQUAL:
				return validateGreaterThanOrEqual((GreaterThanOrEqual)value, diagnostics, context);
			default:
				return true;
		}
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
		AbstractActor<?> actor = KlangUtil.getActor(variableAssignment);

		if (!actor.isInScope(variableAssignment.getVariableName())) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "scope", getObjectLabel(variableAssignment, context) },
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
		VariableDeclaration decl = actor.getVariableDeclaration(variableAssignment.getVariableName());
		Class<?> declaredType, assignedType;

		declaredType = typeComputer.computeType(decl.getExpression());
		assignedType = typeComputer.computeType(variableAssignment.getExpression());

		if (!declaredType.equals(assignedType)) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "type", getObjectLabel(variableAssignment, context) },
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
		if (!validate_NoCircularContainment(greaterThan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(greaterThan, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(greaterThan, diagnostics, context);
		return result;
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
	 * @generated
	 */
	public boolean validateVariableReference_scope(VariableReference variableReference, DiagnosticChain diagnostics,
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
	 * @generated
	 */
	public boolean validateUnaryOperator_type(UnaryOperator unaryOperator, DiagnosticChain diagnostics,
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
						 new Object[] { "type", getObjectLabel(unaryOperator, context) },
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
	 * @generated
	 */
	public boolean validateBinaryOperator_type(BinaryOperator binaryOperator, DiagnosticChain diagnostics,
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
						 new Object[] { "type", getObjectLabel(binaryOperator, context) },
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
	public boolean validateIntegerLiteral(IntegerLiteral integerLiteral, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerLiteral, diagnostics, context);
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
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operator, diagnostics, context);
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
	public boolean validateSleep(Sleep sleep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sleep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendMessage(SendMessage sendMessage, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessThanOrEqual(LessThanOrEqual lessThanOrEqual, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lessThanOrEqual, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lessThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(lessThanOrEqual, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreaterThanOrEqual(GreaterThanOrEqual greaterThanOrEqual, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(greaterThanOrEqual, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(greaterThanOrEqual, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryOperator_type(greaterThanOrEqual, diagnostics, context);
		return result;
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

} // KlangexprValidator
