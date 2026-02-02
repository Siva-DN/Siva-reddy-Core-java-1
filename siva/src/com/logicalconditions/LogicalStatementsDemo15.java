package com.logicalconditions;

//MOVIE TICKET BOOKING WITH AGE DISCOUNT WITH SWITCH CASE..?
import java.util.Scanner;

public class LogicalStatementsDemo15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select your seat type:");
		System.out.println("1.silver");
		System.out.println("2.Gold");
		System.out.println("3.platinium");

		int seat = sc.nextInt();

		System.out.println("Enter your age:");

		int age = sc.nextInt();

		int price = 0;

		switch (seat) {
		case 1 -> price = 120;
		case 2 -> price = 180;
		case 3 -> price = 250;
		default -> System.out.println("not available in seat type");

		}

		if (age < 12 || age >= 60) {
			price -= 30;
			System.out.println("Final ticket price:" + price);
		}
		sc.close();

	}

}
