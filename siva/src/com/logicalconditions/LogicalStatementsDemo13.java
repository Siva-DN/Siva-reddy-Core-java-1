package com.logicalconditions;

// ATM mission MIni console based app with switch case..?
import java.util.Scanner;

public class LogicalStatementsDemo13 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		double balance = 15000.00;

		double amount;
		System.out.println(" HELLO...!Welcome to simple ATM !!");
		System.out.println("1.CHECK BALANCE");
		System.out.println("2.DEPOSIT AMOUNT");
		System.out.println("3.WITHDRAW BALANCE");
		System.out.println("4.EXIT");
		System.out.println("CHOOSE AN OPTION BETWEEN 1-4");

		System.out.println("CHOOSE AN OPTION 1TO 4 ONLY");
		int option = sc.nextInt();
		switch (option) {
		case 1 -> {
			System.out.println("check balance:");
			System.out.println("Enter your pin:");
			int pin=sc.nextInt();
			System.out.println("YOUR CURRENT BALANCE IS:" + balance);
		}
		case 2 -> {
			System.out.println("ENTER THE DEPOSITED AMOUNT:");
			double amount1 = sc.nextDouble();
			balance += amount1;
			System.out.println("CONGRUTULATIONS..!! AMOUNT SUCCUESFULLY DEPOSITED!!:" + amount1);
			System.out.println("YOUR UPDATED AMOUNT IS:" + balance);

		}
		case 3 -> {
			System.out.println("ENTER YOUR WITHDRAW AMOUNT:");
			double amount1 = sc.nextDouble();
			if (balance >= amount1) {
				balance -= amount1;
				System.out.println("CONGRUTULATIONS..!! AMOUNT SUCCUESFULLY WITHDRAW:" + amount1);
				System.out.println("YOUR REMAINING AMOUNT IS:" + balance);
			} else {
				System.out.println("INSUFFIENT BALANCE..!!");
			}
		}
		case 4 -> {
			System.out.println("THANK YOU..!! FOR VISITING THE ATM");
		}
		default -> System.out.println("not in option");
		}
		sc.close();
	}

}
