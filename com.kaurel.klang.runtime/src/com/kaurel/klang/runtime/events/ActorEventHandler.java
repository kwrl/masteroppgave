package com.kaurel.klang.runtime.events;

import klang.AbstractActor;
import klang.ActorEvent;

public interface ActorEventHandler<T extends ActorEvent> {
	public void handle(T event, AbstractActor<?> actor); 
}