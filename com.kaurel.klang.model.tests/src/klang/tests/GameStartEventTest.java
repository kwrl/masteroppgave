/**
 */
package klang.tests;

import junit.textui.TestRunner;

import klang.GameStartEvent;
import klang.KlangFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Game Start Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameStartEventTest extends GlobalEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GameStartEventTest.class);
	}

	/**
	 * Constructs a new Game Start Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameStartEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Game Start Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GameStartEvent getFixture() {
		return (GameStartEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangFactory.eINSTANCE.createGameStartEvent());
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

} //GameStartEventTest
