package com.kaurel.klang.runtime;

import java.util.List;

import klang.EventHandler;

public class World {
	private List<Sprite> sprites;
	private List<EventHandler> eventHandlers;
	
	public World(List<Sprite> sprites, List<EventHandler> eventHandlers) {
		this.sprites = sprites;
		this.eventHandlers = eventHandlers;
	}
	
	public List<Sprite> getSprites() {
		return sprites;
	}
	public List<EventHandler> getEventHandlers() {
		return eventHandlers;
	}
	
	
}
