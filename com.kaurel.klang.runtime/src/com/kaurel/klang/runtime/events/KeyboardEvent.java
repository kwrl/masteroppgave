package com.kaurel.klang.runtime.events;

import klang.Keys;

public class KeyboardEvent extends GlobalRuntimeEvent {
	private final Keys keyCode;
	
	public KeyboardEvent(Keys keyCode) {
		this.keyCode = keyCode;
	}
	
	public Keys getKeyCode() {
		return keyCode;
	}
}
