package com.kaurel.klang.runtime.events;

import klang.AbstractActor;

public class CollisionEvent extends KlangEvent {
	private final AbstractActor actorA;
	private final AbstractActor actorB;
	
	public CollisionEvent(AbstractActor actorA, AbstractActor actorB) {
		this.actorA = actorA;
		this.actorB = actorB;
	}

	public AbstractActor getActorA() {
		return actorA;
	}

	public AbstractActor getActorB() {
		return actorB;
	}
}
