package com.collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface1 {

	public static void main(String[] args) {

		Map<Integer, String> crickInfo = new HashMap<>();

		crickInfo.put(7, "Dhoni");
		crickInfo.put(18, "virat");
		crickInfo.put(63, "sky");
		crickInfo.put(45, "Rohit");
		crickInfo.put(9, "Sanju");

		System.out.println(crickInfo.put(77, "gill"));
		System.out.println(crickInfo.put(77, "iyer"));

		Collection<Integer> keys = crickInfo.keySet();
		System.out.println(keys);

		Collection<String> values = crickInfo.values();
		System.out.println(values);

		System.out.println(crickInfo);

		System.out.println("********************8");

		Collection<Entry<Integer, String>> entries = crickInfo.entrySet();
		System.out.println(entries);

		System.out.println("---------------------------");
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	}

}
