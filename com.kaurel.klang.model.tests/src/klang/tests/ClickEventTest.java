/**
 */
package klang.tests;

import junit.textui.TestRunner;

import klang.ClickEvent;
import klang.KlangFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Click Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClickEventTest extends ActorEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClickEventTest.class);
	}

	/**
	 * Constructs a new Click Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Click Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClickEvent getFixture() {
		return (ClickEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangFactory.eINSTANCE.createClickEvent());
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

} //ClickEventTest
