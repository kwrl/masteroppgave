package com.kaurel.klang.runtime;

import com.kaurel.klang.runtime.events.ClickedEvent;
import com.kaurel.klang.runtime.events.CollisionEvent;
import com.kaurel.klang.runtime.events.EventBus;
import com.kaurel.klang.runtime.events.KeyboardEvent;
import com.kaurel.klang.runtime.events.KlangEvent;
import com.kaurel.klang.runtime.events.KlangEventHandler;
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

public class KlangInterpreter {
	private final Processor processor = new ProcessorImpl(this);
	private final Scheduler scheduler = new Scheduler();
	private final SceneActor sceneActor;

	public KlangInterpreter(SceneActor sceneActor) {
		this.sceneActor = sceneActor;
		processor.initializeAllVariables(sceneActor);
		
		addKlangEventHandler(onClick);
		addKlangEventHandler(onCollision);
		addKlangEventHandler(onKeyPressed);
		addKlangEventHandler(onMessage);
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

	public void processEventHandler(EventHandler handler) {
		scheduler.addThread(new KlangThread(handler.getStatements(), handler.getActor()));
	}

	public Processor getProcessor() {
		return processor;
	}

	public Scheduler getScheduler() {
		return scheduler;
	}

	private EventBus eventBus = new EventBus();

	public void addKlangEventHandler(KlangEventHandler<?> handler) {
		eventBus.addKlangEventHandler(handler);
	}

	public <T extends KlangEvent> void onKlangEvent(T event) {
		eventBus.onKlangEvent(event);
	}

	private KlangEventHandler<MessageEvent> onMessage = new KlangEventHandler<MessageEvent>() {
		@Override
		public void handle(MessageEvent event) {
			sceneActor
					.traverseBFS()
					.stream()
					.flatMap(a -> a.getEventHandlers().stream())
					.filter(e -> e instanceof MessageReceived)
					.map(e -> (MessageReceived) e)
					.filter(e -> event.getName().equals(e.getName()))
					.forEach(e -> processEventHandler(e));
		}
	};

	private KlangEventHandler<ClickedEvent> onClick = new KlangEventHandler<ClickedEvent>() {
		@Override
		public void handle(ClickedEvent event) {
			sceneActor
					.traverseBFS()
					.stream()
					.filter(a -> a == event.getActor())
					.flatMap(a -> a.getEventHandlers().stream())
					.filter(e -> e instanceof SpriteClicked)
					.forEach(e -> processEventHandler(e));

		}
	};

	private KlangEventHandler<CollisionEvent> onCollision = new KlangEventHandler<CollisionEvent>() {
		@Override
		public void handle(CollisionEvent event) {
			sceneActor
					.traverseBFS()
					.stream()
					.filter(a -> a == event.getActorA())
					.flatMap(a -> a.getEventHandlers().stream())
					.filter(e -> e instanceof CollidesWith)
					.map(e -> (CollidesWith) e)
					.filter(e -> e.getTarget() == event.getActorB())
					.forEach(e -> processEventHandler(e));

		}
	};

	private KlangEventHandler<KeyboardEvent> onKeyPressed = new KlangEventHandler<KeyboardEvent>() {
		@Override
		public void handle(KeyboardEvent event) {
			sceneActor
					.traverseBFS()
					.stream()
					.flatMap(a -> a.getEventHandlers().stream())
					.filter(e -> e instanceof KeyPressed)
					.map(e -> (KeyPressed) e)
					.filter(e -> e.getKey() == event.getKeyCode())
					.forEach(e -> processEventHandler(e));
		}
	};

}
