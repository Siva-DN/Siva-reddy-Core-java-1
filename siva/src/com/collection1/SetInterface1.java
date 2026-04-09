package com.collection1;

import java.util.HashSet;
import java.util.Set;

public class SetInterface1 {

	public static void main(String[] args) {
		
		Set<Integer> s  = new HashSet<>();
		
		System.out.println(s.hashCode());
		
		s.add(7);
		s.add(18);
		s.add(45);
		s.add(10);
		s.add(27);
		s.add(7);
		s.add(45);
		s.add(18);
		
		
		System.out.println(s);
	}

}
