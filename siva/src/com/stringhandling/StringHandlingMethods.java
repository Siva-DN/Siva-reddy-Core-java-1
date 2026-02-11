package com.stringhandling;

import java.util.Scanner;

//write a program to print reverse of the given string ..?
//WAP to print the given string is palin-drome or not...?

public class StringHandlingMethods {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");

		String s1 = sc.next();// s i v a --0 1 2 3
		String rev = "";

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);// s i v a
			rev = c + rev;// a v i s
		}
		System.out.println("revrese of the given string:" + rev);

		if (rev.equalsIgnoreCase(s1)) {
			System.out.println("the given string is palindrome !!");
		} else {
			System.out.println("The given string is not as palindrome !!");
		}
	}

}
