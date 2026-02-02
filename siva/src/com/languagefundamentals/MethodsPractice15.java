package com.languagefundamentals;

import java.util.Scanner;

public class MethodsPractice15 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started");

		MethodsPractice15 m15 = new MethodsPractice15();
		long sum = m15.add(20, 40);

		System.out.println("totalsum:" + sum);

	}

	long add(int a, int b) {
		System.out.println("enter a value:");
		long a1 = sc.nextLong();
		System.out.println("enter b value:");
		long b1 = sc.nextLong();
		long sum = a1 + b1;
		return sum;
	}

}
