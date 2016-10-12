package com.kaurel.klang.jbox2d.entities;

import fxmlbox2d.INodeBody;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import klang.AbstractActor;

public class SpriteEntity extends Entity {

	public SpriteEntity(AbstractActor actor, INodeBody<Node> nodeBody) {
		super(actor, nodeBody);
	}

	public void setX(Double x) {
		nodeBody.getBody().getPosition().x = x.floatValue();
		System.out.println(x);
	}

	public void setY(Double y) {
		nodeBody.getBody().getPosition().y = y.floatValue();
	}

	public void setX(Integer x) {
		setX(x.doubleValue());
	}

	public void setY(Integer y) {
		setY(y.doubleValue());
	}

	public void setColor(Double red, Double green, Double blue) {
		Color newColor = new Color(red, green, blue, 1.0);
		if (nodeBody.getNode() instanceof Parent) {
			Parent parent = (Parent) nodeBody.getNode();
			parent.getChildrenUnmodifiable()
				.stream()
				.filter(n -> n instanceof Shape)
				.map(n -> (Shape) n)
				.forEach(s -> s.setFill(newColor));
		} else {
			Shape shape = (Shape) nodeBody.getNode();
			shape.setFill(newColor);
		}
	}
}
