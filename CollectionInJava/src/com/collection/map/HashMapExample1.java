package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();
		map.put("1", 22.3);
		map.put("2", 122.3);
		map.put("3", 222.3);
		map.put("4", 322.3);
		map.put("5", 422.3);
		map.put("null", 422.3);

		Set<Entry<String, Double>> entrySet = map.entrySet();

		Set<String> keySet = map.keySet();

		System.out.println("Only keys");
		for (String string : keySet) {
			System.out.println(string);
		}

		System.out.println("Only values");
		Collection<Double> values = map.values();
		for (Double double1 : values) {
			System.out.println(double1);
		}

		System.out.println(map.containsKey("6"));
		System.out.println("Both key and values");
		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
