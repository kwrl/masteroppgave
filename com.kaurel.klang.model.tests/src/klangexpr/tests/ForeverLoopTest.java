/**
 */
package klangexpr.tests;

import junit.textui.TestRunner;

import klangexpr.ForeverLoop;
import klangexpr.KlangexprFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Forever Loop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForeverLoopTest extends AbstractElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForeverLoopTest.class);
	}

	/**
	 * Constructs a new Forever Loop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeverLoopTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Forever Loop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ForeverLoop getFixture() {
		return (ForeverLoop)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangexprFactory.eINSTANCE.createForeverLoop());
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

} //ForeverLoopTest
