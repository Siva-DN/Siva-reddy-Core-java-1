package com.stringhandling;

import java.util.Scanner;

public class StringMethods4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your userName:");
		String userName = sc.next();

		System.out.println("Enter your password:");
		String password = sc.next();

		if (userName.equalsIgnoreCase("Siva123") && password.equals("Siva@123")) {
			System.out.println("Successfully logging in !!!");
		} else {
			System.out.println("Sorry !! you entered Wrong credentials !!!");
		}
	}

}
