package com.collection1;

import java.util.ArrayList;
import java.util.List;

public class CollectionListInterface1 {

	public static void main(String[] args) {

		List<Integer> a1 = new ArrayList<Integer>();

		System.out.println(a1.size());
		a1.add(10);// 0
		a1.add(102);// 1
		a1.add(100);// 2
		a1.add(0, 101);//
		a1.add(2, 80);
		a1.add(1, 90);

		List<Integer> a2 = new ArrayList<Integer>();

		a2.add(1);
		a2.add(2);
		a2.add(3);
//		a2.add(0, 101);
//		a2.add(1, 102);
//		a2.add(2, 103);

		List<Integer> a3 = new ArrayList<>();
		a3.addAll(0, a2);
		a3.addAll(1, a1);
		
		System.out.println("a1:" + a1);
		System.out.println("a2:" + a2);
		System.out.println("a3:" + a3);

	}

}
