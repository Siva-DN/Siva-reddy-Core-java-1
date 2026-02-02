package com.praticeprograms;

//Find the Leap-year using Logical statements..?
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a year:");

		int year = sc.nextInt();

		if (year % 4 == 0   && year % 400 == 0) {
			System.out.println("Is Leap-year:" + year);
		} else {
			System.out.println("IS not Leap-year:" + year);
		}

	}

}
