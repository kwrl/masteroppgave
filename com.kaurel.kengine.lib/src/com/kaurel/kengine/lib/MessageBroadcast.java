package com.kaurel.kengine.lib;

import java.util.ArrayList;
import java.util.List;

public class MessageBroadcast {
	private static List<MessageListener> listeners = new ArrayList<>();
	
	public void subscribe(MessageListener listener) {
		listeners.add(listener);
	}
	
	public void broadcast(String message) {
		for(MessageListener l : listeners) {
			l.onMessage(message);
		}
	}
}
