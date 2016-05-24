/**
 */
package klang.framework.tests;

import junit.textui.TestRunner;

import klang.framework.FrameworkFactory;
import klang.framework.SpriteEntity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sprite Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpriteEntityTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpriteEntityTest.class);
	}

	/**
	 * Constructs a new Sprite Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpriteEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sprite Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SpriteEntity getFixture() {
		return (SpriteEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FrameworkFactory.eINSTANCE.createSpriteEntity());
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

} //SpriteEntityTest
