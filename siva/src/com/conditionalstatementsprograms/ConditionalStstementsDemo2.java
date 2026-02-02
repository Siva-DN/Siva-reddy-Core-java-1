package com.conditionalstatementsprograms;

/*1. Print numbers from 1 to 100.
2. Print numbers from 100 to 1.
3. Print all even numbers between 1 and 100 without using if statement or ternary operator.
You may use loops and arithmetic operations only.*/

public class ConditionalStstementsDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		for (int a = 1; a < 100; a++) {
			System.out.println(a + "hello welcome !!");

		}

		for (int b = 100; b > 0; b--) {
			System.out.println(b + "Hi good morning !!");
		}

		for (int i = 0; i < 100; i = i + 2) {
			System.out.println(i + "congrutulations");
		}

		for (int j = 100; j > 1; j--) {
//			System.out.println(j + "Have a nice day");
			if (j % 2 != 0) {
				System.out.print(j + " ");
			}

		}

		for (int k = 1; k < 100; k = k + 2) {
			System.out.println(k + " ");
		}

	}

}
