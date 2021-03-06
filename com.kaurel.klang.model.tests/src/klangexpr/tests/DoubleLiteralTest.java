/**
 */
package klangexpr.tests;

import junit.textui.TestRunner;

import klangexpr.DoubleLiteral;
import klangexpr.KlangexprFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Double Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DoubleLiteralTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DoubleLiteralTest.class);
	}

	/**
	 * Constructs a new Double Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleLiteralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Double Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DoubleLiteral getFixture() {
		return (DoubleLiteral)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangexprFactory.eINSTANCE.createDoubleLiteral());
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

} //DoubleLiteralTest
