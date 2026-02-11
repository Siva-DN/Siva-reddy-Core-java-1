package com.arrays;

import java.util.Scanner;

public class VowelsandConsonentsCount {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String !!");

		String s1 = sc.nextLine();
		String s2 = "aeiou";
		int vowels = 0;
		int consonant = 0;
		s1 = s1.toLowerCase();
		s1 = s1.replaceAll("\\s+", "");

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (s2.contains(String.valueOf(s1.charAt(i)))) {
//				System.out.println(i);
				vowels++;
			} else {
				consonant++;
			}

		}
		System.out.println("vowels: " + vowels);
		System.out.println("consonants: " + consonant);
		System.out.println(s1);
	}

}
