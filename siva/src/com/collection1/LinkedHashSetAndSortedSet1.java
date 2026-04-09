package com.collection1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class LinkedHashSetAndSortedSet1 {

	public static void main(String[] args) {
		
		System.out.println("main method started !!");
		
		Set<String> s1=new LinkedHashSet<>();
		
		
		s1.add("DHONI");
		s1.add("Virat");
		s1.add("Rohit");
		s1.add("Tilak");
		s1.add("sky");
		s1.add("dhoni");
		
		System.out.println(s1);
		
		
		SortedSet<Integer> s2=new TreeSet<>();
		
		s2.add(101);
		s2.add(102);
		s2.add(110);
		s2.add(105);
		s2.add(100);
		
//		s2.add("siva");
//		s2.add("Virat");
//		s2.add("kiran");
//		s2.add("sree");
//		s2.add("radha");
//		s2.add("dhoni");
		
		
		System.out.println(s2.first());
		System.out.println(s2.last());
		System.out.println(s2.getFirst());
		System.out.println(s2.getLast());
		System.out.println(s2.subSet(100, 103));
		System.out.println(s2.reversed());
		System.out.println(s2.headSet(100));
		System.out.println(s2.tailSet(100));
		
		
		
		
		
		System.out.println(s2);
		

		
		
		
		
		
	}

}
