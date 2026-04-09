package com.collection1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//WAP to print each character count from a given String..?
//EX: Input:JAVA --->Output:J-1,a=2,v=1.
public class ImpMapInterfaceProgram {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();
		System.out.println(map);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String:");
		String name = sc.nextLine();// java
		int maxcount=0;

		char[] ach = name.toCharArray();

		for (char c : ach) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);//add value with get method.
			} else {
				map.put(c, 1);
			}

		}
		
		Set<Entry<Character,Integer>>entries=map.entrySet();
		for(Entry<Character,Integer> entry:entries) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
			
		}
		
		System.out.println(map);

	}

}
