package com.praticeprograms;

/*1.Write a program to check if a number is positive or negative.

2.Take a number and check whether it is even or odd.

3.Check if a number is divisible by 5 and 11.*/

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter s1 value:");
		int s1 = sc.nextInt();

		if (s1 > 0) {
			System.out.println("positive number");
		} else
			System.out.println("negetive number");

		int s2 = sc.nextInt();
		if (s2 % 2 == 0) {
			System.out.println("is even");
		} else
			System.out.println("is odd");

		int s3 = sc.nextInt();
		if (s3 % 5 == 0 && s3 % 11 == 0) {
			System.out.println("is divisible by 5 and 11 ");
		} else
			System.out.println("is not divisible by 5 and 11");

	}

}
