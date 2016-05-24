/**
 */
package klang.tests;

import junit.textui.TestRunner;

import klang.Divide;
import klang.KlangFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Divide</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DivideTest extends BinaryOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DivideTest.class);
	}

	/**
	 * Constructs a new Divide test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivideTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Divide test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Divide getFixture() {
		return (Divide)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangFactory.eINSTANCE.createDivide());
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

} //DivideTest
