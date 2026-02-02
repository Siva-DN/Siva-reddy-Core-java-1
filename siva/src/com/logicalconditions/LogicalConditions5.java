package com.logicalconditions;

import java.util.Scanner;

//WAP to get the job in 1 year what is the eligibility check..!
public class LogicalConditions5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Are you regular for classes &daily assesments");
		boolean regularclases = sc.nextBoolean();

		System.out.println("Are you practicing the 4hr");
		boolean regularpracticing = sc.nextBoolean();

		System.out.println("Are you attending the assignments");
		boolean regulattending = sc.nextBoolean();

		System.out.println("Are you attending the mocks");
		boolean attendmocks = sc.nextBoolean();

		if (regularclases && regularpracticing && regulattending && attendmocks) {
			System.out.println("you will get the job in 1 year");
			System.out.println("hey welcome to my company");

		} else {
			System.out.println("not eligible betterluck nexttime");
		}
	}

}
