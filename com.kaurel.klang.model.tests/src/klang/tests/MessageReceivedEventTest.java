/**
 */
package klang.tests;

import junit.textui.TestRunner;

import klang.KlangFactory;
import klang.MessageReceivedEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Received Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageReceivedEventTest extends GlobalEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageReceivedEventTest.class);
	}

	/**
	 * Constructs a new Message Received Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageReceivedEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message Received Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MessageReceivedEvent getFixture() {
		return (MessageReceivedEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KlangFactory.eINSTANCE.createMessageReceivedEvent());
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

} //MessageReceivedEventTest
