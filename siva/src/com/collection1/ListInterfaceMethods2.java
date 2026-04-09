package com.collection1;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethods2 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(0);
		l.add(100);
		l.add(107);
		l.add(108);
		l.add(109);
		l.add(0, 110);
		l.add(1, 111);
		l.add(2, 112);

		System.out.println("l:" + l);

		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(10);
		l1.add(0, 110);
		l1.add(1, 111);
		l1.add(2, 112);

		System.out.println("l1:" + l1);

		List<Integer> l2 = new ArrayList<>();

		l2.addAll(0, l);
		l2.addAll(1, l1);
		System.out.println("l2:" + l2);

		List<Integer> l3 = new ArrayList<>();

		l3.add(0);
		l3.add(100);
		l3.add(107);
		l3.add(108);
		l3.add(109);

//		l3.remove(0);
		
		l3.remove(l3.indexOf(100));

		System.out.println(l3);

		List<String> l4 = new ArrayList<>();

		l4.add("siva");
		l4.add("sree");
		l4.add("gopi");
		l4.add("surya");
		l4.add("eswar");
		l4.remove("siva");

		l4.remove("gopi");

		System.out.println(l4);

	}

}
