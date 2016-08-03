package com.kaurel.kengine;

import java.util.HashSet;

public class UnorderedPair<T> {
	private HashSet<T> set = new HashSet<T>();
	
	public UnorderedPair(T firstElement, T secondElement) {
		super();
		set.add(firstElement);
		set.add(secondElement);
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof UnorderedPair) {
			return ((UnorderedPair)other).set.equals(set);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return set.hashCode();
	}
}
