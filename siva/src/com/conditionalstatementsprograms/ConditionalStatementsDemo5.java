package com.conditionalstatementsprograms;

// write a program to print the given number that factors i want using for loop..?
//input =6
//output :1236

//
import java.util.Scanner;

public class ConditionalStatementsDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");

		int a = sc.nextInt();// 9

		for (int j = 1; j <= a; j++) {

			if (a % j == 0) {
				System.out.print(j+ " ");
			}
//			System.out.println(a);
		}
	}

}
