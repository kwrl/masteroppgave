/**
 */
package klang.tests;

import junit.textui.TestRunner;

import klang.KlangFactory;
import klang.SpriteClicked;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sprite Clicked</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpriteClickedTest extends EventHandlerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpriteClickedTest.class);
	}

	/**
	 * Constructs a new Sprite Clicked test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpriteClickedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sprite Clicked test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SpriteClicked getFixture() {
		return (SpriteClicked)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangFactory.eINSTANCE.createSpriteClicked());
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

} //SpriteClickedTest
