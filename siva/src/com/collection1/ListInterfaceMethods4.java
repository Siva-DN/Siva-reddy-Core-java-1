package com.collection1;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethods4 {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();

		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		
		System.out.println(l);
		
		List<Integer> sublist=l.subList(0, 5);
		System.out.println(sublist);
		sublist.set(0, 10);
		System.out.println(sublist);
		l.set(0, 20);
		
		System.out.println(l);
		System.out.println(sublist);
		
		
	}

}
