package com.collection1;

import java.util.Hashtable;
import java.util.Map;

public class TestHashtable1 {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<>();

		map.put("A", "Apple");
		map.put("B", "Banana");
		map.put("C", "Carrot");
		map.put("M", "Mango");
		map.put("G", "Graph");
//		map.put(null, null);
//		map.put(null, "Hello");

		System.out.println(map);

	}

}
