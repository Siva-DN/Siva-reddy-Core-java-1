package com.logicalconditions;

import java.util.Scanner;

//using nested if else..
//WAP to check the eligibility for a marriage and 
//Write a simple Vcube-Matrimonial console based APP..?
public class LogicalStatementsDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("vcube  Matrimonial");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your full name: ");
		String name = sc.nextLine();
		System.out.println("hello mr:" + name);

		System.out.println("Enter your assets and salary..? ");
		double assets = sc.nextDouble();
		System.out.println("salary Also");
		double salary = sc.nextDouble();

		if (assets >= 1000000.00 && salary >= 200000.0) {
			System.out.println("good to know !! lets continue the disscusion");
			System.out.println("Enter your age:");
			int age = sc.nextInt();
			if (age >= 27 && age >= 25) {
				System.out.println("yaah its good to know your age is matching to our profile !!");

				System.out.println("enter your height:");
				float height = sc.nextFloat();

				if (height >= 6.5 && height >= 5.8) {
					System.out.println("okay we can continue futher !!");

					System.out.println("Do you have a siblings :");
					boolean siblstatus = sc.nextBoolean();
					if (!siblstatus) {
						System.out.println("its nice to known !!");
						System.out.println("lets start the futher marriage process !!");

					} else {
						System.out.println("soory!! we didn't expect !!");
					}
				} else {
					System.out.println(" sorry !! your are to short ");
				}
			} else {
				System.out.println("your age is very high rejected !!");

			}
		} else {
			System.out.println("sorry !! you can leave for the day");
		}
	}
}
