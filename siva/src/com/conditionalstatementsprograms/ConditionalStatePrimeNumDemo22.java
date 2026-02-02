package com.conditionalstatementsprograms;

// WAP to print prime numbers 0 to 100..? 
import java.util.Scanner;

public class ConditionalStatePrimeNumDemo22 {

	static void primeNumber(int a) {
		for (int i = 0; i <= a; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");
			}
		}
	}

	static boolean isPrime(int a) {
		boolean flag = false;
		if (a == 0 || a == 1) {
			return false;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		primeNumber(a);
	}

}
