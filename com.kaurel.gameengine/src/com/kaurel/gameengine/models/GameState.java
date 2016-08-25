package com.kaurel.gameengine.models;

import java.util.HashSet;

import com.kaurel.gameengine.util.Collision;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;
import javafx.scene.input.KeyCode;

public class GameState {
	private BooleanProperty mouseDown = new SimpleBooleanProperty();
	private ObservableSet<KeyCode> keysDown = FXCollections.observableSet(new HashSet<>());
	private ObservableSet<Collision> collisions = FXCollections.observableSet(new HashSet<>());
	
	public BooleanProperty getMouseDown() {
		return mouseDown;
	}
	public ObservableSet<KeyCode> getKeysDown() {
		return keysDown;
	}
	public ObservableSet<Collision> getCollisions() {
		return collisions;
	}
}
