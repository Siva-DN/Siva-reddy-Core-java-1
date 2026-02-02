package com.logicalconditions;

//checking the eligible for driving license
import java.util.Scanner;

public class LogicalConditions2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("Are you Indian");
		boolean statuscheck = sc.nextBoolean();

		
		try {
		if (age >= 18 && statuscheck) {
			System.out.println("congrtulations");
			System.out.println("you are eligible for driving ");

		} else {
			System.out.println("Not eligible");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
