package com.example.demo.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("Amod");
		set.add("Kunwar");
		set.add("Amit");
		set.add("Singh");

		for (String string : set) {
			System.out.println(string);
		}
	}
}
