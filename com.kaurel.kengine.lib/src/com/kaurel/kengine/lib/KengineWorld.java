package com.kaurel.kengine.lib;

import java.util.ArrayList;
import java.util.List;

import com.kaurel.kengine.lib.entities.Entity;

import javafx.scene.Group;
import javafx.scene.Scene;

public class KengineWorld implements GameEventListener {
	private List<Entity> entities = new ArrayList<>();
	private Group group = new Group();
	private Scene scene;
	
	public KengineWorld() {
	}

	@Override
	public void onGameEvent(GameEvent event) {
		for(Entity e : entities) {
			e.onGameEvent(event);
		}
	}
	
	public void addEntity(Entity entity) {
		entities.add(entity);
		group.getChildren().add(entity.getGraphics());
	}
	
	public Scene getScene() {
		if(scene==null) {
			scene = new Scene(group);
		}
		return scene;
	}

}
