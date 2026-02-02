package com.logicalconditions;

import java.util.Scanner;

//In logical statements if condition is true without brackets then will execute only first if statements 
//so if condition is false then skip the if statements then else statements are printing
public class LogicalConditions4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Marks percentage");
		double marks = sc.nextDouble();//

		if (marks >= 100)
			System.out.println("welcome to Accenture");
//			System.out.println("congrtulations you are eligible");
		else
			System.out.println("Better luck nexttime");

		System.out.println("all the best");

	}

}
