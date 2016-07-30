package com.kaurel.klang.runtime;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;

import javafx.scene.Node;
import klang.Entity;
import klang.SpriteEntity;

public class Sprite {
	private Body body;
	private SpriteEntity entity;
	private Node node;
	
	public Sprite(Node node, Body body, SpriteEntity entity) {
		this.node = node;
		this.body = body;
		this.entity = entity;
		
		entity.setTarget(this);
	}

	public void print(String msg) {
		System.out.println(msg);
	}

	public void print(Double msg) {
		System.out.println(msg);
	}
	
	public Integer toInt(Double val) {
		return (Integer) val.intValue();
	}
	
	public Double toDouble(Integer val) {
		return (Double) val.doubleValue();
	}

	public void setX(Double x) {
		body.setTransform(new Vec2(x.floatValue(), body.getPosition().y), body.getAngle());
	}

	public void setY(Double y) {
		body.setTransform(new Vec2(body.getPosition().x, y.floatValue()), body.getAngle());
	}

	public Double getX() {
		return (double) body.getPosition().x;
	}

	public Double getY() {
		return (double) body.getPosition().y;
	}
	
	public Entity getEntity() {
		return entity;
	}
}