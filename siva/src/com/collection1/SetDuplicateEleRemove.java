package com.collection1;

import java.util.ArrayList;
import java.util.Arrays;
//Remove duplicate elements in a set using array..?
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class SetDuplicateEleRemove {

	public static void main(String[] args) {
		
		
		
		Set<Integer> ss=new HashSet<>();
		
		ss.add(20);
		ss.add(30);
		ss.add(15);
		ss.add(40);
		ss.add(40);
		
		System.out.println(ss);
		
		

		int[] num = { 10, 20, 30, 40, 10, 20, 30 };

		Set<Integer> s1 = new HashSet<>();

		for (int n : num) {
			if (!s1.add(n)) {
				System.out.println(n + " ");
			}

		}
			
		String[] names= {"mahesh","Ntr","prabhas","mahesh"};
		
		Set<String> s2 = new HashSet<>();
		
		for(String s:names) {
			if(!s2.add(s)) {
				System.out.println(s+" ");
				
			}
			
		}
		
		String s=null;
		System.out.println(s);
		
		s=s+"java";
		System.out.println(s);
		
		
		List list=Arrays.asList("java","j2ee","Spring");
		
		System.out.println(list);
		
		//java.lang.UnsupportedOperationException
//		list.add("servlets");
//		System.out.println(list);
		
		
		String s3="null";
		System.out.println(Objects.equals(null, s3));
		
		
		//java.lang.IndexOutOfBoundsException
//		List<String> l1=new ArrayList<>();
//		System.out.println(l1.get(0));
		

	}

}
