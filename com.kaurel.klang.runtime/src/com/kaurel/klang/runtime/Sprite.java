package com.kaurel.klang.runtime;

import javafx.scene.Node;
import klang.SpriteEntity;

public class Sprite {
	private Node graphics;
	private Double x, y;
	private SpriteEntity entity;

	public Sprite(SpriteEntity entity, Node graphics) {
		this.entity = entity;
		this.graphics = graphics;
		x = 0.0;
		y = 0.0;
	}
	
	public Node getGraphics() {
		return graphics;
	}

	public void print(String msg) {
		System.out.println(msg);
	}

	public void print(Double msg) {
		System.out.println(msg);
	}

	public void setX(Double x) {
		this.x = x;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}

	public void syncUI() {
		graphics.relocate(x, y);
	}
}