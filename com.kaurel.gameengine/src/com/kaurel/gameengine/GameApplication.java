package com.kaurel.gameengine;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;

import com.kaurel.gameengine.models.GameState;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class GameApplication extends Application {
	private GameState gameState = new GameState();

	private Group root = new Group();
	private Scene scene = new Scene(root);
	
	private List<Runnable> frameTasks = new LinkedList<>();
	private List<Runnable> tickTasks = new LinkedList<>();
	private Timer tickTimer = new Timer(true);

	private AnimationTimer frameTimer = new AnimationTimer() {
		@Override
		public void handle(long now) {
			frameTasks.stream().forEach(r -> r.run());
		}
	};
	
	public void handleKeyPressed(KeyEvent event) {
		gameState.getKeysDown().add(event.getCode());
	}

	public void handleKeyReleased(KeyEvent event) {
		gameState.getKeysDown().remove(event.getCode());
	}

	public void handleMousePressed(MouseEvent event) {
		gameState.getMouseDown().set(true);
	}
	
	public void handleMouseReleased(MouseEvent event) {
		gameState.getMouseDown().set(false);
	}

	public GameApplication() {
		scene.setOnKeyPressed(this::handleKeyPressed);
		scene.setOnKeyReleased(this::handleKeyReleased);
		scene.setOnMousePressed(this::handleMousePressed);
		scene.setOnMouseReleased(this::handleMouseReleased);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(scene);
		primaryStage.show();
		frameTimer.start();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
