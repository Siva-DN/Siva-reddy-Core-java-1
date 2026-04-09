package com.collection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListInterfaceMethods1 {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();

		li.add(6);
		li.add(10);
		li.add(7);
		li.add(8);
		li.add(1,5);
		li.add(3,11);
			
		System.out.println(li);

		
		
		
		
		
		
//		Set<Integer> s1=new HashSet<>();
//		
//		s1.add(102);
//		s1.add(102);
//		
//		System.out.println(s1);
	}

}
