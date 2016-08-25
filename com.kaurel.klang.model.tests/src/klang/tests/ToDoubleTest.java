/**
 */
package klang.tests;

import junit.textui.TestRunner;

import klang.KlangFactory;
import klang.ToDouble;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>To Double</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToDoubleTest extends UnaryOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ToDoubleTest.class);
	}

	/**
	 * Constructs a new To Double test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToDoubleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this To Double test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ToDouble getFixture() {
		return (ToDouble)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangFactory.eINSTANCE.createToDouble());
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

} //ToDoubleTest
