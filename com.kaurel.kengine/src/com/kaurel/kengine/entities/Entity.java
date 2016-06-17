package com.kaurel.kengine.entities;

import com.kaurel.kengine.world.EntityWorld;

import javafx.scene.Node;

public class Entity {
	protected EntityWorld world;
	protected Node graphics;

	public EntityWorld getWorld() {
		return world;
	}

	public void setWorld(EntityWorld world) {
		this.world = world;
	}

	public Node getGraphics() {
		return graphics;
	}

	public void setGraphics(Node graphics) {
		this.graphics = graphics;
	}
}
