package com.example.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionExample1 {
	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		lst.add(2);

		List<Integer> lst1 = new LinkedList<Integer>();

//		System.out.println(lst);
//		
//		lst.remove(2);
//		
//		
//		System.out.println(lst);
//		
//		lst1.addAll(lst);
//		
//		System.out.println(lst1);
//		
//		lst1.addAll(2, lst);
//		
//		System.out.println(lst1);
//		
//		System.out.println(lst.get(0));
//		
//		lst.set(0, 1000);
//		System.out.println(lst);
//		
//		
//		System.out.println(lst.indexOf(1000));

		// 3 ways
		// using for loop

//		for (Integer it : lst) {
//			System.out.println(it);
//		}

		// List Iterator

		ListIterator<Integer> lstIt = null;
		lstIt = lst.listIterator();

		System.out.println("In actual order :");

		while (lstIt.hasNext()) {
			System.out.println("Iterator : " + lstIt.next());
		}

		System.out.println("In reverse order :");

		while (lstIt.hasPrevious()) {
			System.out.println("Iterator : " + lstIt.previous());
		}

		// Iterator
		System.out.println("Using Iterator");
		Iterator<Integer> iterator = lst.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Java 8");
		
		lst.parallelStream().forEach(amit -> {
			System.out.println(amit);
		});

	}
}
