package com.kaurel.klang.runtime;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public abstract class BaseApplication extends Application {
	protected Group root = new Group();
	protected Scene scene = new Scene(root, 800, 600);
	protected Button startBtn = new Button("START");
	
	private boolean running = false;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		root.getChildren().add(startBtn);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				onKeyDown(event.getCode());
			}
		});
		
		startBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				running = !running;
				if(running) {
					onGameStart();
				} else {
					onGameStop();
				}
			}
		});
	}
	
	protected abstract void onKeyDown(KeyCode code);
	protected abstract void onGameStart();
	protected abstract void onGameStop();
}
