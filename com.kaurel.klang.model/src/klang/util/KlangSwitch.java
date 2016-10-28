/**
 */
package klang.util;

import klang.*;
import klang.entities.Entity;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see klang.KlangPackage
 * @generated
 */
public class KlangSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KlangPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlangSwitch() {
		if (modelPackage == null) {
			modelPackage = KlangPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KlangPackage.SCENE_ACTOR: {
				SceneActor sceneActor = (SceneActor)theEObject;
				T1 result = caseSceneActor(sceneActor);
				if (result == null) result = caseAbstractActor(sceneActor);
				if (result == null) result = caseTreeNode(sceneActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.SPRITE_ACTOR: {
				SpriteActor spriteActor = (SpriteActor)theEObject;
				T1 result = caseSpriteActor(spriteActor);
				if (result == null) result = caseAbstractActor(spriteActor);
				if (result == null) result = caseTreeNode(spriteActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.EVENT_HANDLER: {
				EventHandler eventHandler = (EventHandler)theEObject;
				T1 result = caseEventHandler(eventHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T1 result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.ABSTRACT_ACTOR: {
				AbstractActor<?> abstractActor = (AbstractActor<?>)theEObject;
				T1 result = caseAbstractActor(abstractActor);
				if (result == null) result = caseTreeNode(abstractActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.GAME_START_EVENT: {
				GameStartEvent gameStartEvent = (GameStartEvent)theEObject;
				T1 result = caseGameStartEvent(gameStartEvent);
				if (result == null) result = caseGlobalEvent(gameStartEvent);
				if (result == null) result = caseEvent(gameStartEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.CLICK_EVENT: {
				ClickEvent clickEvent = (ClickEvent)theEObject;
				T1 result = caseClickEvent(clickEvent);
				if (result == null) result = caseActorEvent(clickEvent);
				if (result == null) result = caseEvent(clickEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.KEY_PRESS_EVENT: {
				KeyPressEvent keyPressEvent = (KeyPressEvent)theEObject;
				T1 result = caseKeyPressEvent(keyPressEvent);
				if (result == null) result = caseGlobalEvent(keyPressEvent);
				if (result == null) result = caseEvent(keyPressEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.COLLISION_EVENT: {
				CollisionEvent collisionEvent = (CollisionEvent)theEObject;
				T1 result = caseCollisionEvent(collisionEvent);
				if (result == null) result = caseActorEvent(collisionEvent);
				if (result == null) result = caseEvent(collisionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.PROGRAM: {
				Program program = (Program)theEObject;
				T1 result = caseProgram(program);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.TREE_NODE: {
				TreeNode<?> treeNode = (TreeNode<?>)theEObject;
				T1 result = caseTreeNode(treeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.MESSAGE_RECEIVED_EVENT: {
				MessageReceivedEvent messageReceivedEvent = (MessageReceivedEvent)theEObject;
				T1 result = caseMessageReceivedEvent(messageReceivedEvent);
				if (result == null) result = caseGlobalEvent(messageReceivedEvent);
				if (result == null) result = caseEvent(messageReceivedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.EVENT: {
				Event event = (Event)theEObject;
				T1 result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.GLOBAL_EVENT: {
				GlobalEvent globalEvent = (GlobalEvent)theEObject;
				T1 result = caseGlobalEvent(globalEvent);
				if (result == null) result = caseEvent(globalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.ACTOR_EVENT: {
				ActorEvent actorEvent = (ActorEvent)theEObject;
				T1 result = caseActorEvent(actorEvent);
				if (result == null) result = caseEvent(actorEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSceneActor(SceneActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sprite Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sprite Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpriteActor(SpriteActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventHandler(EventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseAbstractActor(AbstractActor<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGameStartEvent(GameStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Click Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Click Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClickEvent(ClickEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Press Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Press Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKeyPressEvent(KeyPressEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collision Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collision Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCollisionEvent(CollisionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TreeNode<T>> T1 caseTreeNode(TreeNode<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Received Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Received Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMessageReceivedEvent(MessageReceivedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGlobalEvent(GlobalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActorEvent(ActorEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //KlangSwitch
