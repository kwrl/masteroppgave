package com.kaurel.klang.runtime;

import com.kaurel.klang.runtime.events.ClickedEvent;
import com.kaurel.klang.runtime.events.CollisionEvent;
import com.kaurel.klang.runtime.events.KeyboardEvent;
import com.kaurel.klang.runtime.events.KlangEventListener;
import com.kaurel.klang.runtime.events.MessageEvent;
import com.kaurel.klang.runtime.threading.KlangThread;
import com.kaurel.klang.runtime.threading.Processor;
import com.kaurel.klang.runtime.threading.ProcessorImpl;
import com.kaurel.klang.runtime.threading.Scheduler;

import klang.CollidesWith;
import klang.EventHandler;
import klang.KeyPressed;
import klang.MessageReceived;
import klang.SceneActor;
import klang.SpriteClicked;

public class KlangInterpreter implements KlangEventListener {
	private Processor processor = new ProcessorImpl(this);
	private Scheduler scheduler = new Scheduler(this);
	private SceneActor sceneActor;

	public KlangInterpreter(SceneActor sceneActor) {
		this.sceneActor = sceneActor;
		processor.initializeAllVariables(sceneActor);
	}

	public void triggerEvent(Class<? extends EventHandler> type) {
		sceneActor.traverseBFS()
				.stream()
				.flatMap(a -> a.getEventHandlers().stream())
				.filter(e -> type.isInstance(e))
				.forEach(e -> processEventHandler(e));
	}

	public boolean isIdle() {
		return scheduler.isIdle();
	}

	public void tick() {
		processor.processSchedulerPass();
	}

	@Override
	public void onKeyEvent(KeyboardEvent keyEvent) {
		sceneActor
				.traverseBFS()
				.stream()
				.flatMap(a -> a.getEventHandlers().stream())
				.filter(e -> e instanceof KeyPressed)
				.map(e -> (KeyPressed) e)
				.filter(e -> e.getKey() == keyEvent.getKeyCode())
				.forEach(e -> processEventHandler(e));
	}

	@Override
	public void onMessageReceived(MessageEvent messageEvent) {
		sceneActor
				.traverseBFS()
				.stream()
				.flatMap(a -> a.getEventHandlers().stream())
				.filter(e -> e instanceof MessageReceived)
				.map(e -> (MessageReceived) e)
				.filter(e -> messageEvent.getName().equals(e.getName()))
				.forEach(e -> processEventHandler(e));
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
				.forEach(e -> processEventHandler(e));
	}

	@Override
	public void onClicked(ClickedEvent clickedEvent) {
		sceneActor
				.traverseBFS()
				.stream()
				.filter(a -> a == clickedEvent.getActor())
				.flatMap(a -> a.getEventHandlers().stream())
				.filter(e -> e instanceof SpriteClicked)
				.forEach(e -> processEventHandler(e));
	}

	public void processEventHandler(EventHandler handler) {
		scheduler.addThread(new KlangThread(handler.getStatements(), handler.getActor()));
	}
	
	public Processor getProcessor() {
		return processor;
	}
	
	public Scheduler getScheduler() {
		return scheduler;
	}
}
