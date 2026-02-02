package com.conditionalstatementsprograms;

import java.util.Scanner;

//do-while demo 
public class ConditionalStaDoWhileDemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started");
//		int a=20;
//		
//		do {
//			System.out.println("welcome");
//			Thread.sleep(200);
//			a--;
//		}while(a>15);
//		
//		
//		System.out.println("main method ended");
		Scanner sc = new Scanner(System.in);
		int attempts = 0; // counter for attempts
		String password; // user input

		do {
			System.out.print("Enter your Password: ");
			password = sc.nextLine();
			attempts++;

			// switch-case
			switch (password) {
			case "java123":
				System.out.println("Access Granted");
				return; // exit program immediately if correct
			default:
				System.out.println("Wrong Password");
			}

		} while (attempts < 3);

		// after loop ends (3 wrong attempts)
		System.out.println("Account Locked");
	}
}
