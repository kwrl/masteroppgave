package com.kaurel.klang.runtime;

import java.util.stream.Stream;

import com.kaurel.klang.runtime.datastore.DataStore;
import com.kaurel.klang.runtime.events.ActorEventHandler;
import com.kaurel.klang.runtime.events.EventRegistry;
import com.kaurel.klang.runtime.events.GlobalEventHandler;
import com.kaurel.klang.runtime.threading.KlangThread;
import com.kaurel.klang.runtime.threading.Processor;
import com.kaurel.klang.runtime.threading.ProcessorImpl;
import com.kaurel.klang.runtime.threading.Scheduler;

import klang.AbstractActor;
import klang.ActorEvent;
import klang.EventHandler;
import klang.GlobalEvent;
import klang.SceneActor;
import klang.util.TreeTraversal;

public class KlangInterpreter {
	private final EventRegistry eventRegistry = new EventRegistry();
	private final Processor processor = new ProcessorImpl(this);
	private final Scheduler scheduler = new Scheduler();
	
	private final DataStore dataStore = new DataStore();
	
	private final SceneActor sceneActor;

	public KlangInterpreter(SceneActor sceneActor) {
		this.sceneActor = sceneActor;
		processor.initializeAllVariables(sceneActor);

		eventRegistry.addHandler(GlobalEvent.class, globalEventHandler);
		eventRegistry.addHandler(ActorEvent.class, actorEventHandler);
	}

	private GlobalEventHandler<GlobalEvent> globalEventHandler = new GlobalEventHandler<GlobalEvent>() {
		@Override
		public void handle(GlobalEvent event) {
			TreeTraversal.INSTANCE.BreadthFirst(sceneActor)
					.flatMap(a -> a.getEventHandlers().stream())
					.filter(h -> h.getReferenceEvent().matchingEvent(event))
					.forEach(KlangInterpreter.this::processEventHandler);
		}
	};

	private ActorEventHandler<ActorEvent> actorEventHandler = new ActorEventHandler<ActorEvent>() {
		@Override
		public void handle(ActorEvent event, AbstractActor<?> actor) {
			actor.getEventHandlers()
					.stream()
					.filter(h -> h.getReferenceEvent().matchingEvent(event))
					.forEach(KlangInterpreter.this::processEventHandler);
		}
	};

	private void processEventHandler(EventHandler handler) {
		scheduler.addThread(new KlangThread(handler.getStatements(), handler.getActor()));
	}

	public boolean isIdle() {
		return scheduler.isIdle();
	}

	public void tick() {
		processor.processSchedulerPass();
	}

	public Processor getProcessor() {
		return processor;
	}

	public Scheduler getScheduler() {
		return scheduler;
	}

	public EventRegistry getEventRegistry() {
		return eventRegistry;
	}
	
	public DataStore getDatastore() {
		return dataStore;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractActor<?>> Stream<T> getActors(Class<T> type) {
		return TreeTraversal.INSTANCE.BreadthFirst(sceneActor)	
			.filter(type::isInstance)
			.map(a -> (T) a);
	}
}
