package com.kaurel.klang.jbox2d.entities;

import fxmlbox2d.INodeBody;
import javafx.scene.Node;
import klang.AbstractActor;

public class SceneEntity extends Entity {
	public SceneEntity(AbstractActor actor, INodeBody<Node> nodeBody) {
		super(actor, nodeBody);
	}

	public void setBackgroundColor(Double red, Double green, Double blue) {
	}

}
