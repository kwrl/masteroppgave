package com.kaurel.kengine.world;

import java.util.ArrayList;
import java.util.List;

import com.kaurel.kengine.entities.Entity;

public class EntityWorld {
	private List<Entity> entities = new ArrayList<>();
	
	public void registerEntity(Entity entity) {
		entities.add(entity);
		entity.setWorld(this);
	}
}
