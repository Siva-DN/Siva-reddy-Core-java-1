package com.logicalconditions;

import java.util.Scanner;

//WAP to check the age based program with the help of else if..?
public class LogicalStatementsDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

		if (age >= 0 && age < 5) {
			System.out.println("you are  kid");
		} else if (age >= 5 && age <= 12) {
			System.out.println(" you are children age");
		} else if (age >= 13 && age <= 19) {
			System.out.println("you are teenage guy");
		} else if (age >= 20 && age <= 35) {
			System.out.println("you are middle age");
		} else if (age >= 60) {
			System.out.println("you are a senior citizen");
		} else {
			System.out.println("your are not eligible for human being");
		}

	}

}
