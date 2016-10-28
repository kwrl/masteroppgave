/**
 */
package klang.util;

import klang.*;
import klang.entities.Entity;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see klang.KlangPackage
 * @generated
 */
public class KlangAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KlangPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlangAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KlangPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KlangSwitch<Adapter> modelSwitch =
		new KlangSwitch<Adapter>() {
			@Override
			public Adapter caseSceneActor(SceneActor object) {
				return createSceneActorAdapter();
			}
			@Override
			public Adapter caseSpriteActor(SpriteActor object) {
				return createSpriteActorAdapter();
			}
			@Override
			public Adapter caseEventHandler(EventHandler object) {
				return createEventHandlerAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public <T extends Entity> Adapter caseAbstractActor(AbstractActor<T> object) {
				return createAbstractActorAdapter();
			}
			@Override
			public Adapter caseGameStartEvent(GameStartEvent object) {
				return createGameStartEventAdapter();
			}
			@Override
			public Adapter caseClickEvent(ClickEvent object) {
				return createClickEventAdapter();
			}
			@Override
			public Adapter caseKeyPressEvent(KeyPressEvent object) {
				return createKeyPressEventAdapter();
			}
			@Override
			public Adapter caseCollisionEvent(CollisionEvent object) {
				return createCollisionEventAdapter();
			}
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public <T extends TreeNode<T>> Adapter caseTreeNode(TreeNode<T> object) {
				return createTreeNodeAdapter();
			}
			@Override
			public Adapter caseMessageReceivedEvent(MessageReceivedEvent object) {
				return createMessageReceivedEventAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseGlobalEvent(GlobalEvent object) {
				return createGlobalEventAdapter();
			}
			@Override
			public Adapter caseActorEvent(ActorEvent object) {
				return createActorEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link klang.SceneActor <em>Scene Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.SceneActor
	 * @generated
	 */
	public Adapter createSceneActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.SpriteActor <em>Sprite Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.SpriteActor
	 * @generated
	 */
	public Adapter createSpriteActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.EventHandler
	 * @generated
	 */
	public Adapter createEventHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.AbstractActor <em>Abstract Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.AbstractActor
	 * @generated
	 */
	public Adapter createAbstractActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.GameStartEvent <em>Game Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.GameStartEvent
	 * @generated
	 */
	public Adapter createGameStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.ClickEvent <em>Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.ClickEvent
	 * @generated
	 */
	public Adapter createClickEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.KeyPressEvent <em>Key Press Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.KeyPressEvent
	 * @generated
	 */
	public Adapter createKeyPressEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.CollisionEvent <em>Collision Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.CollisionEvent
	 * @generated
	 */
	public Adapter createCollisionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.TreeNode <em>Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.TreeNode
	 * @generated
	 */
	public Adapter createTreeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.MessageReceivedEvent <em>Message Received Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.MessageReceivedEvent
	 * @generated
	 */
	public Adapter createMessageReceivedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.GlobalEvent <em>Global Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.GlobalEvent
	 * @generated
	 */
	public Adapter createGlobalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klang.ActorEvent <em>Actor Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klang.ActorEvent
	 * @generated
	 */
	public Adapter createActorEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KlangAdapterFactory
