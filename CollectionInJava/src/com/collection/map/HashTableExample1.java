package com.collection.map;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableExample1 {

	public static void main(String[] args) {
		Hashtable<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("1", 5);
		hashTable.put("2", 15);
		hashTable.put("3", 52);
		hashTable.put("4", 55);
		hashTable.put("5", 65);

		Iterator<String> iterator = hashTable.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Integer value = hashTable.get(key);
			System.out.println("Keys : " + key + ", values : " + value);
		}

	}
}
