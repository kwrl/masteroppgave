package com.kaurel.klang.runtime.events;

import klang.AbstractActor;

public abstract class ActorRuntimeEvent {
	private AbstractActor actor;
	
	public ActorRuntimeEvent(AbstractActor actor) {
		this.actor = actor;
	}
	
	public AbstractActor getActor() {
		return actor;
	}
}
