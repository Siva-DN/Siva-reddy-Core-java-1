package com.logicalconditions;

import java.util.Scanner;

//Wap to print the grade based on your marks..?

public class LogicalStatementsDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a marks");

		double marksP = sc.nextDouble();

		if (marksP >= 100 || marksP < 0) {
			System.out.println("Invalid marks");
		} else if (marksP >= 90) {
			System.out.println("A grade");
		} else if (marksP >= 80) {
			System.out.println("B grade");
		} else if (marksP >= 70) {
			System.out.println(" C grade");
		} else if (marksP >= 60) {
			System.out.println("D grade");
		} else if (marksP >= 35) {
			System.out.println("just passed");
		} else {
			System.out.println("your failed");
		}
	}
}
