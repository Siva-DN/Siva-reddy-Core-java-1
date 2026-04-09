package com.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceMethods3 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		l1.add(8);
		l1.add(10);
		l1.add(6);
		l1.add(17);
		l1.add(4);
		l1.add(5);
		l1.add(2);

		l1.set(4, 20);

		System.out.println(l1.get(4));

		System.out.println(l1);

		for (int i = 0; i < l1.size(); i++) {
			System.out.println();

		}
		System.out.println("*************************");

		Iterator<Integer> itr = l1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("*************************");

		ListIterator litr = l1.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());

		}

		System.out.println("*************************");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());

		}

	}

}
