package com.conditionalstatementsprograms;

//WAP to find the given number is perfect number or not..?
//input:number so -->INT
//output:true or false so-->boolean expression.

//perfect num means: the given number and its sum of all the factors 
//A perfect number is a positive integer that is equal to the sum of its proper divisors, 
//excluding itself. For example, 6 is a perfect number because its divisors (1, 2, and 3) 
//add up to 6. 
//Another example is 28, where the sum of its divisors (1, 2, 4, 7, and 14) equals 28.
import java.util.Scanner;

public class ConditionalStatementsDemo8 {

	static boolean isPerfect(int a) {
		boolean status = false;
		int sum = 0;

		for (int j = 1; j <= a / 2; j++) {
			if (a % j == 0) {
				sum = sum + j;
			}
		}
		if (a == sum) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();
		boolean isPerfect = isPerfect(a);

		if (isPerfect) {
			System.out.println(isPerfect + ":isPerfect");

		} else {
			System.out.println(isPerfect + ":isNotPerfect");
		}

	}

}
