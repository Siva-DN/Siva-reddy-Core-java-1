package com.conditionalstatementsprograms;

//Write a program to print even and odd numbers using for loop..?
import java.util.Scanner;

public class ConditionalStstementsDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Even numbers:");
		for (int a = 1; a <= 100; a++) {

			if (a % 2 == 0 && a != 0) {

				System.out.print(a + " ");
			}
			
//			System.out.println("odd numbers:");
//			for (int b = 1; b <= 100; b++) {
//
//				if (b % 2 == 1 && b != 0) {
//					System.out.print(b + " ");
//				}
//			}

		}

	}
}



