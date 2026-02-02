package com.exceptionhandiling;


//Throw is the keyword to throw the exceptions explicitly.

import java.util.Scanner;

public class ExcepctionThrow1 {

	public static void main(String[] args) {
		System.out.println("main method statred !1");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int a = sc.nextInt();

		System.out.println("enter b number:");
		int b = sc.nextInt();

		if (b != 0) {
			System.out.println(a / b);

		} else {
			throw new ArithmeticException("Please Don't enter zero !!");
		}

		System.out.println("main mthod ended");
	}

}
