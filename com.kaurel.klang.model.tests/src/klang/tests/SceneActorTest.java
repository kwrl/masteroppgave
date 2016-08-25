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
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link klang.SceneActor#print(java.lang.String) <em>Print</em>}</li>
 * </ul>
 * </p>
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

	/**
	 * Tests the '{@link klang.SceneActor#print(java.lang.String) <em>Print</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klang.SceneActor#print(java.lang.String)
	 * @generated
	 */
	public void testPrint__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SceneActorTest
