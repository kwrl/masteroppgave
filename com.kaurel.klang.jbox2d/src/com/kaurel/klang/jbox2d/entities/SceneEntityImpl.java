package com.kaurel.klang.jbox2d.entities;

import fxmlbox2d.INodeBody;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import klang.AbstractActor;
import klang.entities.SceneEntity;

public class SceneEntityImpl extends EntityImpl implements SceneEntity {
	
	public SceneEntityImpl(AbstractActor<?> actor, INodeBody<Node> nodeBody) {
		super(actor, nodeBody);
	}

	public void setColor(Double red, Double green, Double blue) {
		red = Math.min(1.0, Math.max(0.0, red));
		green = Math.min(1.0, Math.max(0.0, green));
		blue = Math.min(1.0, Math.max(0.0, blue));
		Node node = nodeBody.getNode();
		if(node instanceof Pane) {
			Pane p = (Pane) node;
			p.backgroundProperty().set(new Background(new BackgroundFill(new Color(red, green, blue, 1.0), CornerRadii.EMPTY, Insets.EMPTY)));
		} else {
		}
	}

}
