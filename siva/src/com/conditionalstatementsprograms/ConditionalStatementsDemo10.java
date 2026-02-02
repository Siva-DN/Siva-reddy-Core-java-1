package com.conditionalstatementsprograms;

//WAP to find the given number factorial..?
import java.util.Scanner;

public class ConditionalStatementsDemo10 {

	static int isFacto(int a) {
		int fact = 1;
		for (int k = 1; k <= a; k++) {
			fact = fact * k;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();
		int isFacto = isFacto(a);
		System.out.println("the given number factorial is:" + isFacto);
	}

}
