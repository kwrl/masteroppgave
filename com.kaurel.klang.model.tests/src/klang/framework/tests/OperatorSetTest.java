/**
 */
package klang.framework.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import klang.framework.FrameworkFactory;
import klang.framework.OperatorSet;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operator Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorSetTest extends TestCase {

	/**
	 * The fixture for this Operator Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorSet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperatorSetTest.class);
	}

	/**
	 * Constructs a new Operator Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorSetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Operator Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OperatorSet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Operator Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorSet getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FrameworkFactory.eINSTANCE.createOperatorSet());
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

} //OperatorSetTest
