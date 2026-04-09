package com.collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods3 {

	public static void main(String[] args) {

		Collection<String> names = new ArrayList<>();

		names.add("Dhoni");
		names.add("Kohili");
		names.add("Surya");
		names.add("Rohit");
		names.add("AbhiShek");
		names.add("Tilak");

		names.remove("Surya");
		System.out.println(names);
		
		Collection<String> words = new ArrayList<>();
		words.add("surya");
		words.add("Dhoni");
		words.add("sky");
		words.add("sree");
		words.add("bumra");
		words.add("surya");
		
		names.retainAll(words);
		System.out.println(names);
		
		Object[] objs=words.toArray();
		for(Object obj:objs) {
			System.out.println(obj);
		}
		
		

		// for-each loop or enhanced for loop
//		for(String name:names) {
//			System.out.println(name);
//		}
		
		
//		//Universal cursor:Iterator
//		Iterator<String> itr = names.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			if (itr.next().equals("Dhoni")) {
//				itr.remove();
//			}
//		}

	}

}
