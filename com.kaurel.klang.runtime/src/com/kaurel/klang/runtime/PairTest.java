package com.kaurel.klang.runtime;

import java.util.HashSet;
import java.util.Set;

public class PairTest {

	public static void main(String[] args) {
		Set<UnorderedPair<Integer>> pairs = new HashSet<>();
		
		pairs.add(new UnorderedPair<Integer>(10, 20));
		System.out.println(pairs.size());
		pairs.remove(new UnorderedPair<Integer>(20, 10));
		System.out.println(pairs.size());
	}

}
