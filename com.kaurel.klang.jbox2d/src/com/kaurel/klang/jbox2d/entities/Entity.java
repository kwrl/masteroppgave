package com.kaurel.klang.jbox2d.entities;

import fxmlbox2d.INodeBody;
import javafx.scene.Node;
import klang.AbstractActor;

public class Entity {
	protected INodeBody<Node> nodeBody;
	protected AbstractActor actor;

	public Entity(AbstractActor actor, INodeBody<Node> nodeBody) {
		this.nodeBody = nodeBody;
		this.actor = actor;
	}
	
	public AbstractActor getActor() {
		return actor;
	}

	public void print(String message) {
		System.out.println(message);
	}

	public void print(Double message) {
		System.out.println(message);
	}

	public void print(Integer message) {
		System.out.println(message);
	}
	
	public Double random() {
		return Math.random();
	}
	
	public Double random(Double min, Double max) {
		return min + random()*(max-min);
	}
}
