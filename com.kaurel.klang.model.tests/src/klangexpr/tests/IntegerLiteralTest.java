/**
 */
package klangexpr.tests;

import junit.textui.TestRunner;

import klangexpr.IntegerLiteral;
import klangexpr.KlangexprFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerLiteralTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerLiteralTest.class);
	}

	/**
	 * Constructs a new Integer Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integer Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegerLiteral getFixture() {
		return (IntegerLiteral)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangexprFactory.eINSTANCE.createIntegerLiteral());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IntegerLiteralTest
