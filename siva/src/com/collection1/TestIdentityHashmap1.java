package com.collection1;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TestIdentityHashmap1 {

	public static void main(String[] args) {

//		Map<String, String> map = new HashMap<>();
		Map<String, String> map1 = new IdentityHashMap<>();

		//String literals here both addresses are pointing same
//		String s1 = "siva";
//		String s2 = "siva";
		
		
		//String objects--
		String s1=new String("sree");
		String s2=new String("sree");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		map1.put(s1, "mrk");
		map1.put(s2, "vijayawada");
		
		System.out.println(map1);
//		System.out.println(map);

	}

}
