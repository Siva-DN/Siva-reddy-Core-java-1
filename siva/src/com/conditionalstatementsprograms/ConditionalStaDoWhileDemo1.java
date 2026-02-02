package com.conditionalstatementsprograms;

//WAP for using switch case with also continue the console asking the proceed further
//option using do while conditional statements..?
import java.util.Scanner;

public class ConditionalStaDoWhileDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String yn = " ";
		do {
			System.out.println("enter a value:");
			int a = sc.nextInt();
			System.out.println("enter b value:");
			int b = sc.nextInt();
			System.out.println("enter a symbol for proceed like:+,-,*,%,/");
			String syb = sc.next();
//		System.out.println("If You want Play Again press y/n");
//		String s=sc.next();
//	
			switch (syb) {
			case "+" -> System.out.println("Addition:" + (a + b));
			case "-" -> System.out.println("subration:" + (a - b));
			case "*" -> System.out.println("multiplication:" + a * b);
			case "%" -> System.out.println("modulus:" + a % b);
			case "/" -> System.out.println("division:" + a / b);
			default -> System.out.println("invalid symbol");
			}
			System.out.println("If You want Play Again press y/n");
			yn = sc.next();//y

		} while (yn.equalsIgnoreCase("y"));

	}

}
