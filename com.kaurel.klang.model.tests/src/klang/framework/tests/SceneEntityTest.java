/**
 */
package klang.framework.tests;

import junit.textui.TestRunner;

import klang.framework.FrameworkFactory;
import klang.framework.SceneEntity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scene Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SceneEntityTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SceneEntityTest.class);
	}

	/**
	 * Constructs a new Scene Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Scene Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SceneEntity getFixture() {
		return (SceneEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FrameworkFactory.eINSTANCE.createSceneEntity());
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

} //SceneEntityTest
