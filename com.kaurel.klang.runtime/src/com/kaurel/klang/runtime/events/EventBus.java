package com.kaurel.klang.runtime.events;

import java.util.Arrays;
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
				.filter(h -> compatibleWith(event, h))
				.map(h -> (KlangEventHandler<T>) h)
				.forEach(h -> h.handle(event));
	}

	//TODO: horrible check... will crash if KlangEventHandler.handle is renamed etc.
	public <T extends KlangEvent> boolean compatibleWith(T event, KlangEventHandler<?> handler)  {
		return Arrays.asList(handler.getClass().getMethods())
			.stream()
			.filter(m -> m.getParameterCount() == 1)
			.filter(m -> m.getParameterTypes()[0] == event.getClass())
			.filter(m -> "handle".equals(m.getName()))
			.findAny().isPresent();
	}
	
}
