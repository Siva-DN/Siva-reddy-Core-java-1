package com.praticeprograms;

/*1)Write a Java program to print all numbers between 1 and 100 that are both even and factors of 60.
2) Write a Java program to check whether a number is prime or composite, and print its factors.
Input 1: 
Enter a number: 7
Factors of 7 are: 1 , 7 
7 is a Prime Number.
Input 2 :
Enter a number: 12
Factors of 12 are: 1, 2, 3, 4, 6, 12 
12 is a Composite Number.*/
import java.util.Scanner;

public class Task3Factors {

	static void findFactorEven(int a) {
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				if (i % 2 == 0 && 60 % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 0 && 60 % j == 0) {
				System.out.print(j + " ");
			}

		}
		for (int k = 1; k <= 100; k++) {
			int count = 2;
			if (k % 2 == 0) {
				count++;
				System.out.print(k + " ");
			}
			if (k == count) {
				System.out.print(count + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = sc.nextInt();
		findFactorEven(a);

	}

}
