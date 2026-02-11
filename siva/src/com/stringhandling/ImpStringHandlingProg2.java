package com.stringhandling;

import java.util.Arrays;
import java.util.Scanner;

//WAP the given  two Strings is Anagram or Not..?
public class ImpStringHandlingProg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a first String:");
		String str1 = sc.nextLine();
		System.out.println("enter a second String:");
		String str2 = sc.nextLine();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("the given strings are not anagram !!");
		}
		// convert into tocharArrays it returns array of characters.

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		System.out.println(ch1);
		System.out.println(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("the given String is Anagram !!");
		} else {
			System.out.println("the given String is not  Anagram !!");

		}

	}

}
