package com.collection1;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet1 {

	public static void main(String[] args) {

		NavigableSet<Integer> s = new TreeSet<>();

		s.add(12);
		s.add(27);
		s.add(16);
		s.add(25);
		s.add(15);
		
		System.out.println(s.ceiling(13));
		System.out.println(s.floor(13));
		
		System.out.println("*******************");
		
		System.out.println(s.higher(25));
		System.out.println(s.lower(15));
		
		
		NavigableSet<Object> ss = new TreeSet<>();
		ss.add(12);
		ss.add("siva");
		ss.add(16.0f);
		
		System.out.println(ss);
		

	}

}
