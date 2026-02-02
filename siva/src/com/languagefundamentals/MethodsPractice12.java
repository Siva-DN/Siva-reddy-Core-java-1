package com.languagefundamentals;

import java.util.Scanner;

public class MethodsPractice12 {
//	write a program to print my name?
//	no return type +no arguments methods example.
	static String names = "siva ";

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started");
		MethodsPractice12 m12 = new MethodsPractice12();
		System.out.println(names);
//		m12.display();

		String namess = "sivaa ";
		System.out.println(namess);
		m12.display();
//		System.out.println(namess);
	}

	void display() {
		System.out.println("my lastname is:");
		String lastname = "Battula";
		System.out.println(lastname);
		System.out.println("my firsttname is:");
		String firstname = "siva reddy";
		System.out.println(firstname);
		System.out.println("my fullname is:" + (lastname + firstname));

	}

}
