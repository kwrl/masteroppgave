/**
 */
package klangexpr.tests;

import junit.textui.TestRunner;

import klangexpr.KlangexprFactory;
import klangexpr.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileLoopTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhileLoopTest.class);
	}

	/**
	 * Constructs a new While Loop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoopTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this While Loop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WhileLoop getFixture() {
		return (WhileLoop)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangexprFactory.eINSTANCE.createWhileLoop());
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

} //WhileLoopTest
