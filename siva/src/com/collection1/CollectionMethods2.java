package com.collection1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods2 {

	public static void main(String[] args) {
		
		Collection<Float> c1 = new ArrayList<>();
		System.out.println(c1.hashCode());
		
		//The method add(Float) in the type Collection<Float> 
		//is not applicable for the arguments (int)
//		c1.add(10);
		
		c1.add(10.0F);
		c1.add(4.5f);
		c1.add(5.10f);
		System.out.println(c1);
		
		Collection<Float> c2 = new ArrayList<>();
		System.out.println(c2.hashCode());
		c2.add(5.10f);
		System.out.println(c2);
		
		System.out.println(c1.equals(c2));
		
		Collection<Float> c3 = new ArrayList<>();
		
		if(!c3.isEmpty()) {
			c3.add(10f);
			c3.add(20f);
		}
		System.out.println(c3);
		
		
	}

}
