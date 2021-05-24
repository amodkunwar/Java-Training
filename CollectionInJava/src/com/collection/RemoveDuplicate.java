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

		List<Integer> collect = lst.stream().distinct().collect(Collectors.toList());

		for (Integer integer : collect) {
			System.out.println(integer);
		}
	}

}
