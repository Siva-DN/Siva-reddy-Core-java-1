package com.reviseprograms;

import java.util.Scanner;

public class ConditionalStatements1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		System.out.println("Are you Indian !!");
		boolean statusCheck = sc.nextBoolean();

		if (age >= 20 && statusCheck) {
			System.out.println("Congratulation you are eligible !!");
			System.out.println("For Driving also eligible !!");
		} else {
			System.out.println("Bad luck ");
			System.out.println("Your age will have time !!");
		}
	}

}
