package com.kaurel.klang.jbox2d.events;


import java.util.HashMap;
import java.util.Map;

import javafx.scene.input.KeyCode;
import klang.Keys;

public class JavaFXKeyCodeMapping {
	private static final Map<KeyCode, Keys> keyMapping = new HashMap<>();
	
	static {
		keyMapping.put(KeyCode.A, Keys.A);
		keyMapping.put(KeyCode.B, Keys.B);
		keyMapping.put(KeyCode.C, Keys.C);
		keyMapping.put(KeyCode.D, Keys.D);
		keyMapping.put(KeyCode.E, Keys.E);
		keyMapping.put(KeyCode.F, Keys.F);
		keyMapping.put(KeyCode.G, Keys.G);
		keyMapping.put(KeyCode.H, Keys.H);
		keyMapping.put(KeyCode.I, Keys.I);
		keyMapping.put(KeyCode.J, Keys.J);
		keyMapping.put(KeyCode.K, Keys.K);
		keyMapping.put(KeyCode.L, Keys.L);
		keyMapping.put(KeyCode.M, Keys.M);
		keyMapping.put(KeyCode.N, Keys.N);
		keyMapping.put(KeyCode.O, Keys.O);
		keyMapping.put(KeyCode.P, Keys.P);
		keyMapping.put(KeyCode.Q, Keys.Q);
		keyMapping.put(KeyCode.R, Keys.R);
		keyMapping.put(KeyCode.S, Keys.S);
		keyMapping.put(KeyCode.T, Keys.T);
		keyMapping.put(KeyCode.U, Keys.U);
		keyMapping.put(KeyCode.V, Keys.V);
		keyMapping.put(KeyCode.W, Keys.W);
		keyMapping.put(KeyCode.X, Keys.X);
		keyMapping.put(KeyCode.Y, Keys.Y);
		keyMapping.put(KeyCode.Z, Keys.Z);
		keyMapping.put(KeyCode.SPACE, Keys.SPACE);
		keyMapping.put(KeyCode.ENTER, Keys.ENTER);
	}
	
	public static Keys toKlangCode(KeyCode code) {
		return keyMapping.get(code);
	}

}
