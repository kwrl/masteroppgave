package com.kaurel.klang.runtime.events;

import klang.GlobalEvent;

public interface GlobalEventHandler<T extends GlobalEvent> {
	public void handle(T event);
}
