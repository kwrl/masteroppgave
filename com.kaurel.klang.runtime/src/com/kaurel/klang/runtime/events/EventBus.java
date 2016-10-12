package com.kaurel.klang.runtime.events;

import java.util.HashSet;
import java.util.Set;

import com.kaurel.klang.runtime.threading.MessageEvent;

public class EventBus {
	private Set<RuntimeEventListener> listeners = new HashSet<>();
	
	public void addListener(RuntimeEventListener listener) {
		listeners.add(listener);
	}
	
	public void broadcast(GlobalRuntimeEvent event) {
		if(event instanceof KeyboardEvent) {
			broadcastEvent((KeyboardEvent) event);
		} else if (event instanceof MessageEvent) {
			broadcastEvent((MessageEvent) event);
		}
	}
	
	private void broadcastEvent(MessageEvent event) {
		for(RuntimeEventListener l : listeners) {
			l.onMessageReceived(event);
		}
	}

	private void broadcastEvent(KeyboardEvent event) {
		for(RuntimeEventListener l : listeners) {
			l.onKeyEvent(event);
		}
	}
}
