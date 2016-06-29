package com.kaurel.klang.runtime;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import klang.AbstractElement;
import klang.Actor;
import klang.EventHandler;
import klang.Game;
import klang.SpriteEntity;
import klang.util.KlangThread;
import klang.util.KlangThreadImpl;
import klang.util.ThreadStatus;

public class WorldFactory {
	public SpriteFactory primarySpriteFactory;
	public SpriteFactory fallbackSpriteFactory = new DebugSpriteFactory();
	
	public WorldFactory(SpriteFactory primarySpriteFactory) {
		this.primarySpriteFactory = primarySpriteFactory;
	}
	
	public World createWorld(Reader reader) {
		List<Sprite> sprites = new ArrayList<>();
		List<EventHandler> eventHandlers = new ArrayList<>();

		Game game = KlangParser.INSTANCE.parseGame(reader);
		KlangThread init = new KlangThreadImpl(new ArrayList<AbstractElement>(game.getVariableDeclarations()));
		
		while (init.step() != ThreadStatus.TERMINATED);
		for (Actor actor : game.getActorDefs()) {
			Sprite sprite = createSprite((SpriteEntity)actor.getEntity());
			sprites.add(sprite);
			actor.getEntity().setTarget(sprite);
			init = new KlangThreadImpl(new ArrayList<AbstractElement>(actor.getVariableDeclarations()));
			while (init.step() != ThreadStatus.TERMINATED);
			eventHandlers.addAll(actor.getEventHandlers());
		}

		return new World(sprites, eventHandlers);
	}
	
	private Sprite createSprite(SpriteEntity entity) {
		Sprite sprite = primarySpriteFactory.createSprite(entity);
		if(sprite==null) {
			return fallbackSpriteFactory.createSprite(entity);
		}
		return sprite;
	}
}
