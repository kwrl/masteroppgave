/**
 */
package klangexpr.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>klangexpr</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class KlangexprTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new KlangexprTests("klangexpr Tests");
		suite.addTestSuite(WhileLoopTest.class);
		suite.addTestSuite(IfTest.class);
		suite.addTestSuite(ForeverLoopTest.class);
		suite.addTestSuite(YieldTest.class);
		suite.addTestSuite(VariableAssignmentTest.class);
		suite.addTestSuite(ExpressionTest.class);
		suite.addTestSuite(OrTest.class);
		suite.addTestSuite(AndTest.class);
		suite.addTestSuite(PlusTest.class);
		suite.addTestSuite(MinusTest.class);
		suite.addTestSuite(MultiplyTest.class);
		suite.addTestSuite(DivideTest.class);
		suite.addTestSuite(LessThanTest.class);
		suite.addTestSuite(EqualTest.class);
		suite.addTestSuite(GreaterThanTest.class);
		suite.addTestSuite(NotTest.class);
		suite.addTestSuite(BooleanLiteralTest.class);
		suite.addTestSuite(DoubleLiteralTest.class);
		suite.addTestSuite(StringLiteralTest.class);
		suite.addTestSuite(VariableReferenceTest.class);
		suite.addTestSuite(UnaryOperatorTest.class);
		suite.addTestSuite(BinaryOperatorTest.class);
		suite.addTestSuite(FunctionCallTest.class);
		suite.addTestSuite(IntegerLiteralTest.class);
		suite.addTestSuite(UnaryMinusTest.class);
		suite.addTestSuite(ToDoubleTest.class);
		suite.addTestSuite(ToIntTest.class);
		suite.addTestSuite(SleepTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlangexprTests(String name) {
		super(name);
	}

} //KlangexprTests