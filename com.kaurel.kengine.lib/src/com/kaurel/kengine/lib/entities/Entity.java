package com.kaurel.kengine.lib.entities;

import com.kaurel.kengine.lib.GameEventListener;

import javafx.scene.Node;

public abstract class Entity implements GameEventListener {
	protected Node graphics;

	public Entity(Node graphics) {
		super();
		this.graphics = graphics;
	}

	public Node getGraphics() {
		return graphics;
	}

	public void setGraphics(Node graphics) {
		this.graphics = graphics;
	}

}
