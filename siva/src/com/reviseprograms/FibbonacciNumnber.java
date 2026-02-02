package com.reviseprograms;

import java.util.Scanner;

public class FibbonacciNumnber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 1;
		System.out.println(n1 + n2);
		for (int i = 0; i <= a / 2; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
