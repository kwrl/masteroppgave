/**
 */
package klangexpr.impl;

import klangexpr.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KlangexprFactoryImpl extends EFactoryImpl implements KlangexprFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KlangexprFactory init() {
		try {
			KlangexprFactory theKlangexprFactory = (KlangexprFactory)EPackage.Registry.INSTANCE.getEFactory(KlangexprPackage.eNS_URI);
			if (theKlangexprFactory != null) {
				return theKlangexprFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KlangexprFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlangexprFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KlangexprPackage.WHILE_LOOP: return createWhileLoop();
			case KlangexprPackage.IF: return createIf();
			case KlangexprPackage.FOREVER_LOOP: return createForeverLoop();
			case KlangexprPackage.YIELD: return createYield();
			case KlangexprPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
			case KlangexprPackage.EXPRESSION: return createExpression();
			case KlangexprPackage.OR: return createOr();
			case KlangexprPackage.AND: return createAnd();
			case KlangexprPackage.PLUS: return createPlus();
			case KlangexprPackage.MINUS: return createMinus();
			case KlangexprPackage.MULTIPLY: return createMultiply();
			case KlangexprPackage.DIVIDE: return createDivide();
			case KlangexprPackage.LESS_THAN: return createLessThan();
			case KlangexprPackage.EQUAL: return createEqual();
			case KlangexprPackage.GREATER_THAN: return createGreaterThan();
			case KlangexprPackage.NOT: return createNot();
			case KlangexprPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case KlangexprPackage.DOUBLE_LITERAL: return createDoubleLiteral();
			case KlangexprPackage.STRING_LITERAL: return createStringLiteral();
			case KlangexprPackage.VARIABLE_REFERENCE: return createVariableReference();
			case KlangexprPackage.UNARY_OPERATOR: return createUnaryOperator();
			case KlangexprPackage.BINARY_OPERATOR: return createBinaryOperator();
			case KlangexprPackage.FUNCTION_CALL: return createFunctionCall();
			case KlangexprPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case KlangexprPackage.UNARY_MINUS: return createUnaryMinus();
			case KlangexprPackage.TO_DOUBLE: return createToDouble();
			case KlangexprPackage.TO_INT: return createToInt();
			case KlangexprPackage.STATEMENT: return createStatement();
			case KlangexprPackage.SLEEP: return createSleep();
			case KlangexprPackage.SEND_MESSAGE: return createSendMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoop createWhileLoop() {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeverLoop createForeverLoop() {
		ForeverLoopImpl foreverLoop = new ForeverLoopImpl();
		return foreverLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Yield createYield() {
		YieldImpl yield = new YieldImpl();
		return yield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment createVariableAssignment() {
		VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiply createMultiply() {
		MultiplyImpl multiply = new MultiplyImpl();
		return multiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Divide createDivide() {
		DivideImpl divide = new DivideImpl();
		return divide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleLiteral createDoubleLiteral() {
		DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
		return doubleLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableReference createVariableReference() {
		VariableReferenceImpl variableReference = new VariableReferenceImpl();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperator() {
		UnaryOperatorImpl unaryOperator = new UnaryOperatorImpl();
		return unaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperator() {
		BinaryOperatorImpl binaryOperator = new BinaryOperatorImpl();
		return binaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryMinus createUnaryMinus() {
		UnaryMinusImpl unaryMinus = new UnaryMinusImpl();
		return unaryMinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToDouble createToDouble() {
		ToDoubleImpl toDouble = new ToDoubleImpl();
		return toDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToInt createToInt() {
		ToIntImpl toInt = new ToIntImpl();
		return toInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sleep createSleep() {
		SleepImpl sleep = new SleepImpl();
		return sleep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessage createSendMessage() {
		SendMessageImpl sendMessage = new SendMessageImpl();
		return sendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlangexprPackage getKlangexprPackage() {
		return (KlangexprPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KlangexprPackage getPackage() {
		return KlangexprPackage.eINSTANCE;
	}

} //KlangexprFactoryImpl
