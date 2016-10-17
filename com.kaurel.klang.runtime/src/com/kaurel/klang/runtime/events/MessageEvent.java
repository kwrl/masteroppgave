package com.kaurel.klang.runtime.events;

public class MessageEvent extends GlobalEvent {
	private String name;
	
	public MessageEvent(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
