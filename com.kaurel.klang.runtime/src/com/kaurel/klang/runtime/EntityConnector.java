package com.kaurel.klang.runtime;

import java.util.function.Consumer;

import klang.Actor;
import klang.Entity;

public interface EntityConnector<T extends Entity> extends Consumer<Actor>{
	default void accept(Actor actor) {
		try {
			connect((T) actor.getEntity());
		} catch(ClassCastException e) {
		}
	}
	public void connect(T entity);
}
