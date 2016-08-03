package com.kaurel.kengine;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleSetProperty;
import javafx.scene.input.KeyCode;

public class GameState {
	private BooleanProperty running = new SimpleBooleanProperty(false);
	private SimpleSetProperty<UnorderedPair<Sprite>> collisions = new SimpleSetProperty<>();
	private SimpleSetProperty<KeyCode> keysDown = new SimpleSetProperty<>();

	public BooleanProperty getRunning() {
		return running;
	}

	public SimpleSetProperty<UnorderedPair<Sprite>> getCollisions() {
		return collisions;
	}

	public SimpleSetProperty<KeyCode> getKeysDown() {
		return keysDown;
	}

}
