package com.Applications;

import java.util.Scanner;

public class AtmConsoleClass {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double balance=20000;
		double amount;
		System.out.println(" HELLO...!Welcome to simple ATM !!");
		System.out.println("1.CHECK BALANCE");
		System.out.println("2.DEPOSIT AMOUNT");
		System.out.println("3.WITHDRAW BALANCE");
		System.out.println("4.EXIT");
		System.out.println("CHOOSE AN OPTION BETWEEN 1-4");
		
		
		System.out.println("choose an option 1-4 !!");
		int option=sc.nextInt();
		
		switch(option) {
		case 1 -> {
			System.out.println("Checkbalance");
			System.out.println("Enter your pin:");
			int pin=sc.nextInt();
			System.out.println("your cuurent balance is:"+balance);
			
		}
		case 2 ->{
			System.out.println("enter your Deposite amount:");
			double deposit=sc.nextDouble();
				balance+=deposit;
				System.out.println("");
		}
		
		}
		

	}

}
