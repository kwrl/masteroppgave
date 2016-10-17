package com.kaurel.klang.runtime.events;

import klang.AbstractActor;

public abstract class ActorEvent extends KlangEvent {
	private AbstractActor actor;
	
	public ActorEvent(AbstractActor actor) {
		this.actor = actor;
	}
	
	public AbstractActor getActor() {
		return actor;
	}
}
