package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<>();
		lst.add(5);
		lst.add(10);
		lst.add(15);
		lst.add(10);
		lst.add(15);
		lst.add(5);
		lst.add(5);

//		List<Integer> collect = lst.stream().distinct().collect(Collectors.toList());
//
//		for (Integer integer : collect) {
//			System.out.println(integer);
//		}

		System.out.println("Before removing duplicates");
		for (Integer integer : lst) {
			System.out.println(integer);
		}

		System.out.println("After removing duplicates");
		for (int i = 0; i < lst.size(); i++) {
			for (int j = i + 1; j < lst.size(); j++) {
				if (lst.get(i).equals(lst.get(j))) {
					lst.remove(j);
					j--;
				}
			}
		}

		for (Integer integer : lst) {
			System.out.println(integer);
		}

	}

}
