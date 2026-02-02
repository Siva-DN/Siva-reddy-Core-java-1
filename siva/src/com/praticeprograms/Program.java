package com.praticeprograms;

import java.util.Scanner;

/*Write a program that takes a number from the user and:

If the number is divisible by 3, print "Fizz"

If the number is divisible by 5, print "Buzz"

If the number is divisible by both 3 and 5, print "FizzBuzz"

Otherwise, print the number itself
 */
public class Program {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the num:");
		int msg = sc.nextInt();

		if (msg % 3 == 0 && msg % 5 == 0) {
			System.out.println("FizzBuzz");
		}
		else if (msg % 3 == 0) {
			System.out.println("Fizz");
		} else if (msg % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("not valid");
		}
		}
	}

	

