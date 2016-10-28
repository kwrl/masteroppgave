package com.kaurel.klang.jbox2d.entities;

import com.kaurel.klang.jbox2d.KlangApplication;

import fxmlbox2d.INodeBody;
import javafx.scene.Node;
import klang.AbstractActor;
import klang.entities.Entity;

public class EntityImpl implements Entity {
	protected INodeBody<Node> nodeBody;
	protected AbstractActor<?> actor;

	public EntityImpl(AbstractActor<?> actor, INodeBody<Node> nodeBody) {
		this.nodeBody = nodeBody;
		this.actor = actor;
	}

	public AbstractActor<?> getActor() {
		return actor;
	}

	public Double random() {
		return Math.random();
	}

	public Double random(Double min, Double max) {
		return min + random() * (max - min);
	}

	public Double getWorldWidth() {
		return (double) Math.abs(Math.round(KlangApplication.getInstance().getGeometryHelper()
				.fxVec2world(KlangApplication.getInstance().getScene().getWidth(), 0).getX()));
	}

	public Double getWorldHeight() {
		return (double) Math.abs(Math.round(KlangApplication.getInstance().getGeometryHelper()
				.fxVec2world(0, KlangApplication.getInstance().getScene().getHeight()).getY()));
	}

	public Double getMouseX() {
		return KlangApplication.getInstance().getMouseX();
	}

	public Double getMouseY() {
		return KlangApplication.getInstance().getMouseY();
	}

	public String getName() {
		return getActor().getName();
	}

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}

	@Override
	public Double mouseX() {
		return KlangApplication.getInstance().getMouseX();
	}

	@Override
	public Double mouseY() {
		return KlangApplication.getInstance().getMouseY();
	}
	
}
