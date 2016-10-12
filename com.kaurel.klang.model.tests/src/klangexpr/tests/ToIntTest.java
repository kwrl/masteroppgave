/**
 */
package klangexpr.tests;

import junit.textui.TestRunner;

import klangexpr.KlangexprFactory;
import klangexpr.ToInt;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>To Int</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToIntTest extends UnaryOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ToIntTest.class);
	}

	/**
	 * Constructs a new To Int test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToIntTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this To Int test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ToInt getFixture() {
		return (ToInt)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangexprFactory.eINSTANCE.createToInt());
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

} //ToIntTest
