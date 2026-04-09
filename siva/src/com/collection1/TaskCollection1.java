package com.collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TaskCollection1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Collection<Integer> c1 = new ArrayList<>();

		c1.add(1000);
		c1.add(2000);
		c1.add(3000);
		c1.add(4000);
		c1.add(5000);
		int max = 0;

		Iterator<Integer> itr = c1.iterator();
		int max1 = 0;
		while (itr.hasNext()) {
			Integer currsalary = itr.next();
			if (currsalary > max1) {
				max1 = currsalary;

			}
		}
		System.out.println(max1);
//
//		for (int sal : c1) {
//			if (sal >max) {
//				max=sal;
//			}
//
//		}
//		

//		System.out.println(max);

	}

}
