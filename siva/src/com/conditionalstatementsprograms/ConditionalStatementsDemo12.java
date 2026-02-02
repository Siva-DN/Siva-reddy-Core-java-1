package com.conditionalstatementsprograms;

import java.util.Scanner;

//fibo-nocci series using for loop..?
public class ConditionalStatementsDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = sc.nextInt();
		int n1 = 0;
		int n2 = 1;

		int n3 = 0;
		System.out.println(n1 + "  " + n2);
		for (int j = 1; j <= a; j++) {
			n3 = n1 + n2;
			System.out.print("  " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
