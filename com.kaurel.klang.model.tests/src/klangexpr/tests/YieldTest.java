/**
 */
package klangexpr.tests;

import junit.textui.TestRunner;

import klangexpr.KlangexprFactory;
import klangexpr.Yield;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Yield</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class YieldTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(YieldTest.class);
	}

	/**
	 * Constructs a new Yield test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Yield test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Yield getFixture() {
		return (Yield)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangexprFactory.eINSTANCE.createYield());
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

} //YieldTest
