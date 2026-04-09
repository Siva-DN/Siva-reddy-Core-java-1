package com.collection1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

//Fail-fast vs Fail Safe
//Hash-map vs Concurrent-hashmap
public class TestIConcurrentHashmap1 {

	public static void main(String[] args) {

		Map<String, String> map = new ConcurrentHashMap<>();

		map.put("Ap", "Andra");
		map.put("Tg", "Telengana");
		map.put("KA", "Karnataka");
		map.put("Kl", "Kerala");
		map.put("MH", "Maharastra");
		map.put("Up", "Utarpradesh");
		map.put("Mp", "Mahyapradesh");

		Set<Entry<String, String>> entries = map.entrySet();

		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
			map.put("IN", "India");

		}

	}

}
