package com.kaurel.gameengine.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnorderedPair<T> {
	private final Set<T> set;
	
	public UnorderedPair(T element1, T element2) {
		set = new HashSet<T>(Arrays.asList(element1, element2));
	}
	
	public boolean equals(UnorderedPair<T> other) {
		return set.equals(other.set);
	}

	@Override
	public int hashCode() {
		return set.hashCode();
	}
}
