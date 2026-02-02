package com.arrays;

import java.util.Scanner;

public class CodeChefArrays1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		int[] weeklyProblems = new int[4];
		int successfulWeeks = 0;

		// check if the entered number of the problem solved each week is greater than
		// or equal to 10
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter the Weekly solved probles based on size");
			weeklyProblems[i] = sc.nextInt();
			if (weeklyProblems[i] >= 10) {
				successfulWeeks++;
			}
			System.out.println(successfulWeeks);

		}

//		System.out.println(successfulWeeks);
		sc.close();
	}

}
