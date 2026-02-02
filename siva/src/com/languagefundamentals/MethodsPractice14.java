package com.languagefundamentals;

import java.util.Scanner;

public class MethodsPractice14 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		MethodsPractice14 m14 = new MethodsPractice14();
		m14.stdmarks(50, 50, 50);

	}
	/*
	 * int a=m14.luckynum(); // int b=m14.luckynumb(); int c=m14.evenodd();
	 * 
	 * System.out.println("my lucky num:"+a);
	 * System.out.println("my evenodd num:"+c/2); //
	 * System.out.println("my luckynumb:"+b);
	 * 
	 * }/*
	 * 
	 * 
	 * int luckynum() { // System.out.println("my lucky num:"); int a=7; //
	 * System.out.println("my lucky num:"+a); return a; }
	 * 
	 * /*int luckynumb() {
	 * 
	 * // System.out.println("my lucky num:"); int b= sc.nextInt(); //
	 * System.out.println("my lucky numb:"+b); return b; }
	 */

	int evenodd() {

		// System.out.println("my lucky num:");
		int c = sc.nextInt();
//		System.out.println("my evenodd num:"+c%2);
		return c;
	}

	void stdmarks(int a, int b, int c) {
		System.out.println("enter subject1:");
		int m1 = sc.nextInt();
		System.out.println("Subject 1 Marks: " + m1);

		System.out.println("enter subject2:");
		int m2 = sc.nextInt();
		System.out.println("Subject 2 Marks: " + m2);

		System.out.println("enter subject3:");
		int m3 = sc.nextInt();
		System.out.println("sub 3 marks:" + m3);

	}

	void totalmarks(int m1, int m2, int m3) {
		System.out.println("total sum of three subjects:");
		int total = (m1 + m2 + m3);
		System.out.println("total sum of three subjects:" + total);
	}

}
