/**
 */
package klang.tests;

import junit.textui.TestRunner;

import klang.KlangFactory;
import klang.SceneActor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scene Actor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SceneActorTest extends AbstractActorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SceneActorTest.class);
	}

	/**
	 * Constructs a new Scene Actor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneActorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Scene Actor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SceneActor getFixture() {
		return (SceneActor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangFactory.eINSTANCE.createSceneActor());
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

} //SceneActorTest
