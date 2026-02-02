package com.logicalconditions;

import java.util.Scanner;

//switch case
//menu selection in cafe..?
public class LogicalStatementsDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter choice item:");

		int item = sc.nextInt();

		switch (item) {
		case 101 -> {
			System.out.println("pizza");
			System.out.println("Price:" + 149);
		}
		case 102 -> {
			System.out.println("Burger");
			System.out.println("Price:" + 299);
		}
		case 103 -> {
			System.out.println("pasta");
			System.out.println("Price:" + 249);
		}
		case 104,105 -> {
			System.out.println("No-veg-pizza");
			System.out.println("Price:" + 129);
		}
		default -> System.out.println("not Available");
		}

	}

}
