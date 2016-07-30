package com.kaurel.klang.runtime;

import org.jbox2d.dynamics.Body;

public interface GameEventListener {
	public void onGameStart();
	public void onGamePaused();
	public void onGameStopped();
	public void onBodyClicked(Body body);
	public void onCollision(Body bodyA, Body bodyB);
	public void onKeyPressed(String key);
}
