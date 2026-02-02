package com.logicalconditions;

// Calculator with switch and case..? 
import java.util.Scanner;

public class LogicalStatementsDemo12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int a = sc.nextInt();

		System.out.println("Enter B number:");
		int b = sc.nextInt();

		System.out.println("Enter a symbol to procced like +,-,*,/,%,$");
		String symbol = sc.next();

		int result = 0;
//		sc.close();
		switch (symbol) {
		case "+" -> result = a + b;
		case "-" -> result = (a - b);
		case "*" -> result = (a * b);
		case "/" -> result = (a / b);
		case "%" -> result = (a % b);
		case "$" -> result = (a - b);
		default -> System.out.println("unknown symbol ");
		}

		System.out.println("Resulted values:" + result);

	}
}
