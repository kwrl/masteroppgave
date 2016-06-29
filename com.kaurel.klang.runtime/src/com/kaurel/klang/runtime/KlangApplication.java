package com.kaurel.klang.runtime;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import javafx.animation.AnimationTimer;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import klang.AbstractElement;
import klang.EventHandler;
import klang.GameStart;
import klang.KeyPressed;
import klang.util.KlangThreadImpl;

public class KlangApplication extends BaseApplication {
	private World world;
	private final KlangScheduler scheduler = new KlangScheduler();
	private Thread schedulerThread;
	private CollisionChecker collisionChecker = new CollisionChecker();

	private Boolean tick = false;

	private AnimationTimer timer = new AnimationTimer() {
		@Override
		public void handle(long now) {
			collisionChecker.run();
			world.getSprites().stream().forEach(s -> s.syncUI());
		}
	};

	public static void main(String[] args) throws FileNotFoundException {
		launch(args);
	}

	Stream<EventHandler> getEventHandlers(Class<? extends EventHandler> cls) {
		return world.getEventHandlers().stream().filter(e -> cls.isInstance(e));
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		super.start(primaryStage);
		Reader reader = new FileReader("klangfiles/test.klang");
		WorldFactory builder = new WorldFactory(new JavaFXSpriteFactory(getClass().getResource("test.fxml")));
		world = builder.createWorld(reader);

		for (Sprite sprite : world.getSprites()) {
			root.getChildren().add(sprite.getGraphics());
		}
		
		timer.start();
	}

	@Override
	protected void onKeyDown(KeyCode code) {
		getEventHandlers(KeyPressed.class).filter(e -> ((KeyPressed) e).getKey().equals(code.toString())).forEach(
				e -> scheduler.addThread(new KlangThreadImpl(new ArrayList<AbstractElement>(e.getStatements()))));
	}

	@Override
	protected void onGameStart() {
		getEventHandlers(GameStart.class).forEach(
				e -> scheduler.addThread(new KlangThreadImpl(new ArrayList<AbstractElement>(e.getStatements()))));
		schedulerThread = new Thread(scheduler);
		schedulerThread.setDaemon(true);
		schedulerThread.start();
	}

	@Override
	protected void onGameStop() {
		if (schedulerThread != null) {
			schedulerThread.stop();
			scheduler.flush();
		}
	}

	class CollisionChecker implements Runnable {
		private Set<Set<Sprite>> collisions = new HashSet<>();

		@Override
		public void run() {
			List<Sprite> sprites = world.getSprites();
			for (int i = 0; i < sprites.size(); i++) {
				Node n1 = sprites.get(i).getGraphics();
				for (int j = i + 1; j < sprites.size(); j++) {
					Set<Sprite> collision = new HashSet<>();
					collision.add(sprites.get(i));
					collision.add(sprites.get(j));

					Node n2 = sprites.get(j).getGraphics();

					if (n1.getBoundsInParent().intersects(n2.getBoundsInParent())) {
						if (!collisions.contains(collision)) {
							collisions.add(collision);
						}
					} else {
						if (collisions.contains(collision)) {
							collisions.remove(collision);
						}
					}
				}
			}
		}
	}

}