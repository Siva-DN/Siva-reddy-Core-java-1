package com.logicalconditions;

//In logical statements if condition is true with brackets then will execute all if statements 
//so if condition is false then skip the if statements then else statements are printing
import java.util.Scanner;

public class LogicalConditions3 {

	public static void main(String[] args) {
		System.out.println("main methoopd started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Marks percentage");
		double marks = sc.nextDouble();//

		if (marks >= 100) {
			System.out.println("welcome to Accenture");
			System.out.println("congrtulations you are eligible");
		} else {
			System.out.println("Better luck nexttime");
			System.out.println("all the best");
            sc.close();
		}
		System.out.println("***********");

	}
//	System.out.println("***********");

}
