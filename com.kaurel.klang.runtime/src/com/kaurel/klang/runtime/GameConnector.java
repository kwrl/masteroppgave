package com.kaurel.klang.runtime;

import klang.Game;

public class GameConnector {
	private Game game;
	
	public GameConnector(Game game) {
		this.game = game;
	}
	
	public void connectEntities(EntityConnector connector) {
		game.getActorDefs().forEach(connector);
	}
	
}
