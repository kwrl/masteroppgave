/**
 */
package klangexpr.tests;

import junit.textui.TestRunner;

import klangexpr.KlangexprFactory;
import klangexpr.LessThanOrEqual;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Less Than Or Equal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LessThanOrEqualTest extends BinaryOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LessThanOrEqualTest.class);
	}

	/**
	 * Constructs a new Less Than Or Equal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThanOrEqualTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Less Than Or Equal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LessThanOrEqual getFixture() {
		return (LessThanOrEqual)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangexprFactory.eINSTANCE.createLessThanOrEqual());
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

} //LessThanOrEqualTest
