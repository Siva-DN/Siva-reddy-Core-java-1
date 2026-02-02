package com.conditionalstatementsprograms;
//WAP to find the factors given number..?

import java.util.Scanner;

public class ConditionalStatementsDemo7 {

	static void findFactor(int num) {
		int count = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				System.out.print(num + " ");
			}
//			System.out.println(i);
			System.out.println(count);
		}

	}

	public static void main(String[] args) {
		System.out.println(("main method started:"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		findFactor(num);

	}

}
