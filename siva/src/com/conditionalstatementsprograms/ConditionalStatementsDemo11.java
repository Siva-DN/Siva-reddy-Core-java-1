package com.conditionalstatementsprograms;

// Write a program to find the factorial of a given number..?
import java.util.Scanner;

public class ConditionalStatementsDemo11 {

	static int findFactorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();
		int fact = findFactorial(a);

		System.out.println("The given number factorial is:" + fact);

	}

}
