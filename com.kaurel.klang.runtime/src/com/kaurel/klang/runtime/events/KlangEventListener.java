package com.kaurel.klang.runtime.events;

public interface KlangEventListener {
	public void onKeyEvent(KeyboardEvent keyEvent);
	public void onMessageReceived(MessageEvent messageEvent);
	public void onCollision(CollisionEvent collisionEvent);
	public void onClicked(ClickedEvent clickedEvent);
}
