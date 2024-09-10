package com.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Apple");
		map1.put(2, "Banana");

		// Second map with a duplicate key
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(2, "Orange"); // Duplicate key
		map2.put(3, "Grapes");

		//flat map is use for combine the two collection in single collection
		Map<Integer, String> combine = Stream.of(map1, map2)
				.flatMap(map -> map.entrySet().stream())
				.collect(Collectors.toMap(
						Map.Entry::getKey, 
						Map.Entry::getValue,
						(i,j)->j
				));
		System.out.println(combine);
	}
}
