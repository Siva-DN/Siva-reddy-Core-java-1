package com.arrays;

import java.util.Scanner;

public class ArrayFirstRepChar {

	public static void main(String[] args) {

		System.out.println("main method Started !!!");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				if (c == s.charAt(j)) {
					count++;

				}

			}
			if (count >= 2) {
				System.out.println(s.charAt(i));
				break;
			}

		}

	}
}
