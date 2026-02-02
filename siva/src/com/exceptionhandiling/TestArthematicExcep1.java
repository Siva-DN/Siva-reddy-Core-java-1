package com.exceptionhandiling;

import java.util.Scanner;

public class TestArthematicExcep1 {

	public static void main(String[] args) {
		System.out.println("main method statred");

		Scanner sc = new Scanner(System.in);

		System.out.println("To enter a value:");
		int a = sc.nextInt();
		System.out.println("To enter b value:");
		int b = sc.nextInt();

		try {
			System.out.println("In try !!");
			System.out.println(a / b);
		} catch (Exception e) {
			System.err.println("In Catch !!");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

		// No exception of type Object can be thrown;
		// an exception type must be a subclass of Throwable

		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");

	}

}
