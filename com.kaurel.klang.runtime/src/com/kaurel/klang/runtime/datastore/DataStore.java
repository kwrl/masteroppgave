package com.kaurel.klang.runtime.datastore;

import java.util.HashMap;
import java.util.Map;

import klang.VariableDeclaration;

public class DataStore {
	private final Map<VariableDeclaration, Object> storage = new HashMap<>();
	
	public void setValue(VariableDeclaration decl, Object value) {
		storage.put(decl, value);
	}
	
	public Object getValue(VariableDeclaration decl) {
		return storage.get(decl);
	}
}
