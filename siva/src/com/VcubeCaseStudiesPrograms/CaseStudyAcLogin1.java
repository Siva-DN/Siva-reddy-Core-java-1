package com.VcubeCaseStudiesPrograms;

//Login system with limited attempts using do while loop ..?
//simulate a login system where:
//1.the correct password is "java123".
//2.Allow the user up to 3 attempts to enter the correct password.
//3.use a do-while loop for repeated login attempts. 
//4.if correct display "access granted.
//5.if wrong after 3 attempts display "Account Locked".

import java.util.Scanner;

public class CaseStudyAcLogin1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		int attempts = 0;
		String password;

		do {
			System.out.println("enter a password:");
			password = sc.nextLine();
			attempts++;

			switch (password) {

			case "java123":
				System.out.println("Access Granted");
				return;
			default:
				System.out.println("Incorrect Password");
			}
		} while (attempts < 3);
		System.out.println("Account Locked");
	}

}
