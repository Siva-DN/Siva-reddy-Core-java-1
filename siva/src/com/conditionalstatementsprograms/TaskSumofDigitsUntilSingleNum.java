package com.conditionalstatementsprograms;

import java.util.Scanner;

public class TaskSumofDigitsUntilSingleNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a value ");
		int a = sc.nextInt();

		int r = 0;
		int sum = 0;
		while (a > 9) {
			sum = 0;
			while (a != 0) {
				r = a % 10;
				sum = sum + r;
				a = a / 10;

			}
			a = sum;
		}

		System.out.println("The total single digit sum is:" + sum);

	}

}
