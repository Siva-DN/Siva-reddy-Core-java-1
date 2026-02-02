package com.conditionalstatementsprograms;

//WAP sum of the number to given numbers..? like 123-->6,121-->4; 
import java.util.Scanner;

public class ConditionalStatementsDemo13 {
//	static int findSum(int a) {
//		int sum = 0;
//		for (int n = a; n > 0; n = n / 10) {
//			int digit = n % 10;
//			sum += digit;
//		}
//		return sum;
//	}

	// sum of given number using while loop..?

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();
		int s = 0;
		while (a > 0) {
			int r = a % 10;
			s = s + r;

			a = a / 10;
		}

		// int findSum = findSum(a);
		System.out.println(s + " ");
	}

}
