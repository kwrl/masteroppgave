package com.kaurel.klang.runtime;

import java.io.FileReader;
import java.io.Reader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import klang.Game;

public class KlangApplication extends Application {
	private Parent root;
	private Scene scene;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Reader reader = new FileReader("klangfiles/test.klang");
		Game game = KlangParser.INSTANCE.parseGame(reader);
		root = (Parent) FXMLLoader.load(KlangApplication.class.getResource("test.fxml"));

		System.out.println(root.getChildrenUnmodifiable().size());
		scene = new Scene(root, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
