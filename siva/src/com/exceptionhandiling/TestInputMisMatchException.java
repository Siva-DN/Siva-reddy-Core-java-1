package com.exceptionhandiling;

//InputMisMatchException with while loop to check age is matched or not...? 
import java.util.Scanner;

public class TestInputMisMatchException {

	public static void main(String[] args) {
		System.out.println("main method Started");
		boolean validInput = false;
		int age = 0;

		while (!validInput) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your  age ");
				age = sc.nextInt();
				validInput = true;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Your entered age is wrong!! please entered right age !!");
			}
		}
		System.out.println("Your enterted age is:" + age);

		System.out.println("main method ended !!");
	}

}
