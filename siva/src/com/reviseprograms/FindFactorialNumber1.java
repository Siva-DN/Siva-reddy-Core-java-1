package com.reviseprograms;

import java.util.Scanner;

public class FindFactorialNumber1 {

	static int findFactorial(int a) {
		int sum = 1;
		for (int j = 1; j <= a; j++) {
			sum = sum * j;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();

		int sum = findFactorial(a);

		System.out.println(sum);
		
		sc.close();
	}

}
