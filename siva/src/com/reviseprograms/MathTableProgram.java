package com.reviseprograms;

//print math table using for loop and while loop..?
import java.util.Scanner;

public class MathTableProgram {

	static void printMathTable(int a) {
		for (int k = 1; k <= 10; k++) {
			System.out.println(a + "x" + k + "=" + a * k);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();

		printMathTable(a);
//		for (int k = 1; k <= a; k++) {
//			System.out.println(a + "x" + k + "=" + a * k);
//		}
		int j = 9;
		while (j <= a) {
			System.out.println(a + "x" + j + "=" + a * j);
			j++;
		}
	}

}
