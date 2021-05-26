package com.java8;

import java.util.ArrayList;
import java.util.List;

//::

public class MethodReference {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(5);
		lst.add(25);
		lst.add(35);
		lst.add(45);
		lst.add(55);
		System.out.println("Normal");
		for (Integer integer : lst) {
			System.out.println(integer);
		}
		
		System.out.println("Method reference");
		lst.forEach(System.out::println);
		
	}
}
