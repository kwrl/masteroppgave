package com.kaurel.kengine;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.jbox2d.dynamics.Body;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.stage.Stage;
import klang.AbstractElement;
import klang.Actor;
import klang.CollidesWith;
import klang.Entity;
import klang.EventHandler;
import klang.Game;
import klang.GameStart;
import klang.KeyPressed;
import klang.SpriteClicked;
import klang.SpriteEntity;
import klang.util.KlangThread;

public class KlangApplication extends Box2dApplication {
	private KlangScheduler scheduler = new KlangScheduler();

	private Map<Entity, List<EventHandler>> entityEventhandlerMapping = new HashMap<>();
	private Map<Body, Sprite> bodySpriteMapping = new HashMap<>();

	Stream<EventHandler> getEventHandlers(Class<? extends EventHandler> cls) {
		return entityEventhandlerMapping.values().stream().flatMap(List::stream).filter(e -> cls.isInstance(e));
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		super.start(primaryStage);
		addGameEventListener(new GameEventHandler());

		byte[] bytes = Files.readAllBytes(Paths.get("klangfiles/test.klang"));
		InputStream in = new ByteArrayInputStream(bytes);
		Game game = GameParser.INSTANCE.parseGame(in);

		//Initialize global variables
		KlangThread init = new KlangThread(new ArrayList<AbstractElement>(game.getVariableDeclarations()));
		init.run();

		for (Actor actor : game.getActorDefs()) {
			if (!(actor.getEntity() instanceof SpriteEntity))
				continue;
			SpriteEntity entity = (SpriteEntity) actor.getEntity();
			entityEventhandlerMapping.put(entity, new ArrayList<>(actor.getEventHandlers()));
			for (Body body : bodyNodeMapping.keySet()) {
				Node node = bodyNodeMapping.get(body);
				if (node.getId() == null)
					continue;
				if (node.getId().equals(entity.getName())) {
					bodySpriteMapping.put(body, new Sprite(node, body, entity));
				}
			}
			
			//Initialize actor's member variables
			init = new KlangThread(new ArrayList<AbstractElement>(actor.getVariableDeclarations()));
			init.run();
		}

		tickTasks.addLast(new Runnable() {
			@Override
			public void run() {
				scheduler.tick();
			}
		});

		running.set(true);
	}

	public static void main(String[] args) throws FileNotFoundException {
		launch(args);
	}

	class GameEventHandler extends GameState implements GameEventListener {

		@Override
		public void onGameStart() {
			getEventHandlers(GameStart.class)
					.forEach(e -> scheduler.addThread(new KlangThread(new ArrayList<>(e.getStatements()))));
		}

		@Override
		public void onGamePaused() {
		}

		@Override
		public void onGameStopped() {
			scheduler.flush();
		}

		@Override
		public void onBodyClicked(Body body) {
			Entity entity = bodySpriteMapping.get(body).getEntity();
			List<EventHandler> eventHandlers = new ArrayList<>(entityEventhandlerMapping.get(entity));
			eventHandlers.stream().filter(e -> e instanceof SpriteClicked)
					.forEach(e -> scheduler.addThread(new KlangThread(new ArrayList<>(e.getStatements()))));
		}

		@Override
		public void onCollision(Body bodyA, Body bodyB) {
			Sprite spriteA = bodySpriteMapping.get(bodyA);
			Sprite spriteB = bodySpriteMapping.get(bodyB);

			if (spriteA == null || spriteB == null) {
				return;
			}

			List<EventHandler> handlersA = new ArrayList<>(entityEventhandlerMapping.get(spriteA.getEntity()));
			List<EventHandler> handlersB = new ArrayList<>(entityEventhandlerMapping.get(spriteB.getEntity()));

			handlersA.stream().filter(e -> e instanceof CollidesWith).map(e -> (CollidesWith) e)
					.filter(e -> e.getTarget().equals(spriteB.getEntity()))
					.forEach(e -> scheduler.addThread(new KlangThread(new ArrayList<>(e.getStatements()))));

			handlersB.stream().filter(e -> e instanceof CollidesWith).map(e -> (CollidesWith) e)
					.filter(e -> e.getTarget().equals(spriteA.getEntity()))
					.forEach(e -> scheduler.addThread(new KlangThread(new ArrayList<>(e.getStatements()))));

		}

		@Override
		public void onKeyPressed(String key) {
			getEventHandlers(KeyPressed.class).filter(e -> ((KeyPressed) e).getKey().equals(key))
					.forEach(e -> scheduler.addThread(new KlangThread(new ArrayList<>(e.getStatements()))));

		}

	}
}