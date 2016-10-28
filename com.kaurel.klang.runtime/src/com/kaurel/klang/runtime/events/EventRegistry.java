package com.kaurel.klang.runtime.events;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import klang.AbstractActor;
import klang.ActorEvent;
import klang.GlobalEvent;

public class EventRegistry {
	private Map<Class<? extends GlobalEvent>, Set<GlobalEventHandler<?>>> globalHandlers = new HashMap<>();
	private Map<Class<? extends ActorEvent>, Set<ActorEventHandler<?>>> actorHandlers = new HashMap<>();

	public <T extends GlobalEvent> void addHandler(Class<T> cls, GlobalEventHandler<T> handler) {
		if(!globalHandlers.containsKey(cls)) {
			globalHandlers.put(cls, new HashSet<>());
		}
		globalHandlers.get(cls).add(handler);
	}
	
	public <T extends ActorEvent> void addHandler(Class<T> cls, ActorEventHandler<T> handler) {
		if(!actorHandlers.containsKey(cls)) {
			actorHandlers.put(cls, new HashSet<>());
		}
		actorHandlers.get(cls).add(handler);
	}

	@SuppressWarnings("unchecked")
	public <T extends GlobalEvent> void fireEvent(T event) {
		globalHandlers.entrySet()
			.stream()
			.filter(e -> e.getKey().isInstance(event))
			.flatMap(e -> e.getValue().stream())
			.map(h -> (GlobalEventHandler<T>) h)
			.forEach(h -> h.handle(event));
	}

	@SuppressWarnings("unchecked")
	public <T extends ActorEvent> void fireEvent(T event, AbstractActor<?> actor) {
		actorHandlers.entrySet()
			.stream()
			.filter(e -> e.getKey().isInstance(event))
			.flatMap(e -> e.getValue().stream())
			.map(h -> (ActorEventHandler<T>) h)
			.forEach(h -> h.handle(event, actor));
	}
}
