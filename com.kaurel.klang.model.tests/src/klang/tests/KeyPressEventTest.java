/**
 */
package klang.tests;

import junit.textui.TestRunner;

import klang.KeyPressEvent;
import klang.KlangFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Key Press Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KeyPressEventTest extends GlobalEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KeyPressEventTest.class);
	}

	/**
	 * Constructs a new Key Press Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyPressEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Key Press Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected KeyPressEvent getFixture() {
		return (KeyPressEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangFactory.eINSTANCE.createKeyPressEvent());
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

} //KeyPressEventTest
