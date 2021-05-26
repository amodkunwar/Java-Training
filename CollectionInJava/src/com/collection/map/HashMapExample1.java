package com.collection.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("1", 5);
		map.put("2", 5);
		map.put("3", 15);
		map.put("4", 25);
		map.put("5", 35);
		map.put("null", 55);

		// Want to get only keys
		System.out.println("Only keys");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key);
		}

		System.out.println("Only values");
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}

		System.out.println("Both key and values");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println("Key : " + entry.getKey() + ", value : " + entry.getValue());
		}

	}
}
