package com.logicalconditions;

import java.util.Scanner;

//Switch cases program and WAP to print Name base on his Jersey number..?
public class LogicalStatementsDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int jno = sc.nextInt();
//  	String jerseyname=sc.next();

		switch (jno) {
		case 7:
			System.out.println("MS DHONI");
			break;
		case 18:
			System.out.println("VIRAT KOHILI");
			break;
		case 45:
			System.out.println("ROHIT SHARMA");
			break;
		case 1:
			System.out.println("KL RAHUL");
			break;
		case 11:
			System.out.println("GILL");
			break;
		default:
			System.out.println("not in list");

			String jerseyname = sc.next();
			switch (jerseyname) {
			case "101":
				System.out.println("hi good morning");
			case "102":
				System.out.println("welcome to vcube");
			case "103":
				System.out.println("congrutulations !!");

			case "104":
				System.out.println("you are selected");

				sc.close();
			}
		}
	}

}
