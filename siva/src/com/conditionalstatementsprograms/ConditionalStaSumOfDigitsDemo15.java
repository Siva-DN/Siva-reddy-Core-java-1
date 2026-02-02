package com.conditionalstatementsprograms;

import java.util.Scanner;

public class ConditionalStaSumOfDigitsDemo15 {

	static int find_sum(int i) {
		int sum = 0;
		int r = 0;

		while (i != 0) {
			r = i % 10;
			sum = sum + r;

			i = i / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int i = sc.nextInt();

		int sum = find_sum(i);
		
		System.out.println(sum+":sum of given number");
	}

}
