package com.kaurel.klang.runtime;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import klang.SpriteEntity;

public class JavaFXSpriteFactory implements SpriteFactory {
	
	private List<Node> fxNodes = new ArrayList<>();

	public JavaFXSpriteFactory(URL resourceURL) {
		try {
			Parent root = FXMLLoader.load(resourceURL);
			getDescendants(root, fxNodes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void getDescendants(Node root, List<Node> children) {
		children.add(root);
		if(root instanceof Parent) {
			for(Node child : ((Parent) root).getChildrenUnmodifiable()) {
				getDescendants(child, children);
			}
		}
	}

	@Override
	public Sprite createSprite(SpriteEntity entity) {
		for(Node node : fxNodes) {
			if(node.getId() != null && node.getId().equals(entity.getName())) {
				System.out.println(node.getId());
				return new Sprite(entity, node);
			}
		}
		return null;
	}

}
