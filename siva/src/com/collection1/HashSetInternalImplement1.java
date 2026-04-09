package com.collection1;

import java.util.HashSet;
import java.util.Set;

public class HashSetInternalImplement1 {

	public static void main(String[] args) {
		
		
		//Constructs a new, empty set;
		//the backing HashMap instance has default initial capacity (16) and load factor (0.75).
		
		Set<Integer> ss=new HashSet<>();
		
		ss.add(12);
		ss.add(27);
		ss.add(16);
		ss.add(25);
		ss.add(15);
		
		System.out.println(ss);
		
		
		Set<String> s1=new HashSet<>();
		
		s1.add("DHONI");
		s1.add("SKY");
		s1.add("VIRAT");
		
		System.out.println(s1);
		
		
	}

}
