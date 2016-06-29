package com.kaurel.klang.runtime;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import klang.SpriteEntity;

public class DebugSpriteFactory implements SpriteFactory {

	@Override
	public Sprite createSprite(SpriteEntity entity) {
		return new Sprite(entity, new Circle(40, Color.GREEN));
	}

}
