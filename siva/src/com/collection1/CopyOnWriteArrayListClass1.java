package com.collection1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListClass1 {

	public static void main(String[] args) {

		// Exception in thread "main" java.util.ConcurrentModificationException
//		List<Integer> l1=new ArrayList<>();  ---(Fail-Fast)

		List<Integer> l1 = new CopyOnWriteArrayList<>(); // (Fail-Safe);
		l1.add(10);
		l1.add(40);
		l1.add(300);
		l1.add(50);
		l1.add(60);

		Iterator<Integer> itr = l1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			l1.add(100);

		}
		System.out.println("****************************");
//
		for (int l : l1) {
			System.out.println(l);

		}
		System.out.println("****************************");

		// StackOverFlow
//		for (int i = 0; i < l1.size(); i++) {
//			System.out.println(l1);
//			l1.add(200);
//	}

		System.out.println(l1);

	}

}
