package com.kaurel.gameengine.util;

import com.kaurel.gameengine.models.Sprite;

public class Collision extends UnorderedPair<Sprite> {
	public Collision(Sprite element1, Sprite element2) {
		super(element1, element2);
	}
}
