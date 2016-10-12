package com.kaurel.klang.runtime;

import com.kaurel.klang.runtime.events.ClickedEvent;
import com.kaurel.klang.runtime.events.CollisionEvent;
import com.kaurel.klang.runtime.events.KeyboardEvent;
import com.kaurel.klang.runtime.events.RuntimeEventListener;
import com.kaurel.klang.runtime.threading.KlangScheduler;
import com.kaurel.klang.runtime.threading.MessageEvent;

import klang.AbstractActor;
import klang.CollidesWith;
import klang.EventHandler;
import klang.KeyPressed;
import klang.SceneActor;
import klang.SpriteClicked;
import klang.VariableDeclaration;

public class KlangInterpreter implements RuntimeEventListener {
	private KlangScheduler scheduler = new KlangScheduler();
	private SceneActor sceneActor;

	public KlangInterpreter(SceneActor sceneActor) {
		this.sceneActor = sceneActor;
		
		for(AbstractActor actor : sceneActor.traverseBFS()) {
			ExpressionEvaluator evaluator = new ExpressionEvaluatorImpl(actor);
			for(VariableDeclaration varDecl : actor.getLocalVariables()) {
				Object value = evaluator.evaluate(varDecl.getExpression());
				varDecl.setValue(value);
			}
		}
	}

	public void triggerEvent(AbstractActor actor, Class<? extends EventHandler> type) {
		actor.getEventHandlers()
				.stream()
				.filter(e -> type.isInstance(e))
				.forEach(e -> scheduler.processEventHandler(e));
	}

	public void triggerEvent(Class<? extends EventHandler> type) {
		sceneActor.traverseBFS()
				.stream()
				.flatMap(a -> a.getEventHandlers().stream())
				.filter(e -> type.isInstance(e))
				.forEach(e -> scheduler.processEventHandler(e));
	}

	public boolean isIdle() {
		return scheduler.isIdle();
	}

	public void tick() {
		scheduler.tick();
	}

	@Override
	public void onKeyEvent(KeyboardEvent keyEvent) {
		sceneActor
			.traverseBFS()
			.stream()
			.flatMap(a -> a.getEventHandlers().stream())
			.filter(e -> e instanceof KeyPressed) 
			.map(e -> (KeyPressed) e)
			.filter(e -> e.getKey()==keyEvent.getKeyCode()) 
			.forEach(e -> scheduler.processEventHandler(e));
	}

	@Override
	public void onMessageReceived(MessageEvent messageEvent) {
		
	}

	@Override
	public void onCollision(CollisionEvent collisionEvent) {
		sceneActor
			.traverseBFS()
			.stream()
			.filter(a -> a == collisionEvent.getActorA())
			.flatMap(a -> a.getEventHandlers().stream())
			.filter(e -> e instanceof CollidesWith)
			.map(e -> (CollidesWith) e)
			.filter(e -> e.getTarget() == collisionEvent.getActorB())
			.forEach(e -> scheduler.processEventHandler(e));
	}

	@Override
	public void onClicked(ClickedEvent clickedEvent) {
		sceneActor
			.traverseBFS()
			.stream()
			.filter(a -> a == clickedEvent.getActor())
			.flatMap(a -> a.getEventHandlers().stream())
			.filter(e -> e instanceof SpriteClicked)
			.forEach(e -> scheduler.processEventHandler(e));
	}
}
