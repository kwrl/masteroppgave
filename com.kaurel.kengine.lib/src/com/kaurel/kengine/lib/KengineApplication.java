package com.kaurel.kengine.lib;

import org.jbox2d.collision.shapes.CircleShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.BodyType;
import org.jbox2d.dynamics.Fixture;
import org.jbox2d.dynamics.FixtureDef;
import org.jbox2d.dynamics.World;

import com.kaurel.kengine.lib.entities.Sprite;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class KengineApplication extends Application {
	private KengineWorld world = new KengineWorld();
	private World jbox2dWorld = new World(new Vec2(0f, 10f));
	
	public Sprite createBall(Vec2 position, float radius, Paint color) {
		BodyDef bodyDef = new BodyDef();
		bodyDef.position = position;
		bodyDef.type = BodyType.DYNAMIC;
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.density = 10f;
		fixtureDef.restitution = 10f;
		CircleShape shape = new CircleShape();
		shape.setRadius(radius);
		fixtureDef.shape = shape;

		Body body = jbox2dWorld.createBody(bodyDef);
		Fixture fixture = body.createFixture(fixtureDef);
		Sprite sprite = new Sprite(new Circle(radius, color));
		sprite.getGraphics().relocate(position.x, position.y);
		body.setUserData(sprite);
		
		return sprite;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(world.getScene());

		world.addEntity(createBall(new Vec2(10, 10), 20f, Color.DARKGREEN));
		world.addEntity(createBall(new Vec2(70, 10), 20f, Color.ALICEBLUE));
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
