/**
 */
package klang.tests;

import junit.textui.TestRunner;

import klang.BinaryOperator;
import klang.KlangFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryOperatorTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinaryOperatorTest.class);
	}

	/**
	 * Constructs a new Binary Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Binary Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BinaryOperator getFixture() {
		return (BinaryOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangFactory.eINSTANCE.createBinaryOperator());
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

} //BinaryOperatorTest
