package com.kaurel.klang.runtime.events;

import com.kaurel.klang.runtime.threading.MessageEvent;

public interface RuntimeEventListener {
	public void onKeyEvent(KeyboardEvent keyEvent);
	public void onMessageReceived(MessageEvent messageEvent);
	public void onCollision(CollisionEvent collisionEvent);
	public void onClicked(ClickedEvent clickedEvent);
}
