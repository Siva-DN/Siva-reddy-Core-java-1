package com.conditionalstatementsprograms;

import java.util.Scanner;

public class ConditionalStatePrimeNumDemo21 {

	static boolean isPrime(int i) {
		boolean status = true;

		if (i == 0 || i == 1) {
			return false;
		}

		for (int a = 2; a < i; a++) {
			if (i % a == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	static void primeNumbers(int i) {
//		boolean status=false;
		for (int a = 0; a <= i; a++) {
			if (isPrime(a)) {
				System.out.print(a + " ");
			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int i = sc.nextInt();
		primeNumbers(i);
	}

}
