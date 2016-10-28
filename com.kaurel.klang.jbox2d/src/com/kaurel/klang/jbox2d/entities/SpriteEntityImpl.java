package com.kaurel.klang.jbox2d.entities;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.BodyType;

import fxmlbox2d.INodeBody;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import klang.AbstractActor;
import klang.entities.SpriteEntity;

public class SpriteEntityImpl extends EntityImpl implements SpriteEntity {

	public SpriteEntityImpl(AbstractActor<?> actor, INodeBody<Node> nodeBody) {
		super(actor, nodeBody);
	}

	public void setX(Double x) {
		Vec2 pos = new Vec2(nodeBody.getBody().getPosition());
		pos.x = x.floatValue();
		nodeBody.getBody().setTransform(pos, nodeBody.getBody().getAngle());

		nodeBody.getBody().setLinearVelocity(new Vec2());
	}

	public void setBodyType(Integer type) {
		switch (type) {
		case 0:
			nodeBody.getBody().setType(BodyType.DYNAMIC);
			break;
		case 1:
			nodeBody.getBody().setType(BodyType.STATIC);
			break;
		case 2:
			nodeBody.getBody().setType(BodyType.KINEMATIC);
			break;
		}

	}

	public Double getX() {
		return (double) nodeBody.getBody().getPosition().x;
	}

	public void setY(Double y) {
		Vec2 pos = new Vec2(nodeBody.getBody().getPosition());
		pos.y = y.floatValue();
		nodeBody.getBody().setTransform(pos, nodeBody.getBody().getAngle());
		nodeBody.getBody().setLinearVelocity(new Vec2());
	}

	public Double getY() {
		return (double) nodeBody.getBody().getPosition().y;
	}

	public void scale(Double scale) {
		nodeBody.getBody().getFixtureList().getShape().setRadius((float)
				nodeBody.getBody().getFixtureList().getShape().getRadius()*scale.floatValue());
		nodeBody.getNode().setScaleX(nodeBody.getNode().getScaleX()*scale);
		nodeBody.getNode().setScaleY(nodeBody.getNode().getScaleY()*scale);
	}

	public void setColor(Double red, Double green, Double blue) {
		red = Math.min(1.0, Math.max(0.0, red));
		green = Math.min(1.0, Math.max(0.0, green));
		blue = Math.min(1.0, Math.max(0.0, blue));

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

	public void setVelocity(Double x, Double y) {
		nodeBody.getBody().setLinearVelocity(new Vec2(x.floatValue(), y.floatValue()));
	}

	@Override
	public void turnLeft(Double degrees) {
		
	}

	@Override
	public void turnRight(Double degrees) {
		
	}

	@Override
	public void say(String msg) {
		
	}
}
