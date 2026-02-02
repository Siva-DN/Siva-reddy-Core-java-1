package com.Operators;

import java.util.Scanner;

public class OperatorsDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a value");
		int age = sc.nextInt();

		System.out.println("enter b value");
		String nationality = sc.next();

		// driving license

		if (age >= 20 && nationality.equalsIgnoreCase("india")) {
			System.out.println("Approve the license");
		} else {
			System.out.println("Rejected");
		}
	}

}
