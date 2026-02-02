package com.exceptionhandiling;

import java.util.Scanner;

public class CustomExceptions1 {

	public static void main(String[] args) throws sivaException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age:");
		int age = sc.nextInt();

		if (age < 18) {
			throw new sivaException("Sorry You are not eligible to votting !!");
		} else {
			System.out.println("You are eligible for voting !!");
		}

	}

}
