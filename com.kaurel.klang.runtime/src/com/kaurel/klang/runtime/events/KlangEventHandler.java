package com.kaurel.klang.runtime.events;

public interface KlangEventHandler<T extends KlangEvent> {
	public void handle(T event);
}
