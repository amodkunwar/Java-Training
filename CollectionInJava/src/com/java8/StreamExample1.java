package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();

		lst.add(5);
		lst.add(25);
		lst.add(35);
		lst.add(45);
		lst.add(55);

		System.out.println("Stream");
		lst.stream().forEach(amit -> {
			System.out.println(amit);
		});

		System.out.println("Paraller stream");
		lst.parallelStream().forEach(amit -> {
			System.out.println(amit);
		});
		System.out.println("Square number");
		lst.stream().map(amit -> amit * amit).collect(Collectors.toList()).forEach(amod -> {
			System.out.println(amod);
		});

		lst.stream().filter(i -> i > 30).forEach(amod -> {
			System.out.println(amod);
		});

		System.out.println(Optional.of(lst).isEmpty());

		System.out.println(Optional.of(lst).isPresent());

		System.out.println(Optional.ofNullable(lst));

		Optional.of(lst).get().forEach(amit -> {
			System.out.println(amit);
		});

	}
}
