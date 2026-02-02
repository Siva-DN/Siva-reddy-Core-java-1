package com.conditionalstatementsprograms;

//write a program to print the given number that factors i want using for loop..?
import java.util.Scanner;

public class ConditionalStatementsDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int k = sc.nextInt();
		findFact(k);

//		for (int a = 1; a <= k; a++) {
//			if (k % a == 0) {
//				System.out.println(a + "");
//			}
//		}

	}

	static void findFact(int k) {

		for (int j = 1; j <= k; j++) {
			if (k % j == 0) {
				System.out.println(j + ": ");
			}
		}
	}

}
