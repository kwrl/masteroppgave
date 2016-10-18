package com.kaurel.klang.runtime.events;

import java.util.HashSet;
import java.util.Set;

public class EventBus {
	private Set<KlangEventHandler<?>> eventHandlers = new HashSet<>();

	public void addKlangEventHandler(KlangEventHandler<?> handler) {
		eventHandlers.add(handler);
	}

	@SuppressWarnings("unchecked")
	public <T extends KlangEvent> void onKlangEvent(T event) {
		eventHandlers.stream()
				.map(h -> {
					return (KlangEventHandler<T>) h;
				})
				.forEach(h -> {
					try {
						h.handle(event);
					} catch (ClassCastException e) {
					}
				});
	}
}
