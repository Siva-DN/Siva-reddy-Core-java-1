package com.languagefundamentals;

//methods using scanner with return type + no arguments
import java.util.Scanner;

public class MethodsPractice8 {
	Scanner sc = new Scanner(System.in);

	void main(String[] args) {
		System.out.println("main method started ");
//		MethodsPractice8 m8=new MethodsPractice8();
		double hello = modules();
		int sum = aditionn();
		int diff = subraction();
		long mul = multiple();
		double div = division();

		System.out.println("modules of two values:" + hello);
		System.out.println("sum of two values:" + sum);
		System.out.println("diffence of two numbers:" + diff);
		System.out.println("multiple of two values:" + (mul));
		System.out.println("division  of two values:" + div);
		// System.out.println("modules of two values:"+hello);
		sc.close();

	}

	long modules() {
		System.out.println("enter o value:");
		long o = sc.nextLong();
		System.out.println("enter p value:");
		long p = sc.nextLong();
		long hel = o % p;
		return hel;

	}

	int aditionn() {
		System.out.println("enter a value:");
		int a = sc.nextInt();
		System.out.println("enter b value:");
		int b = sc.nextInt();
		int sum = a + b;

		return sum;

	}

	int subraction() {
		System.out.println("enter c value:");
		int c = sc.nextInt();
		System.out.println("enter d value:");
		int d = sc.nextInt();
		int diff = c - d;
		return diff;
	}

	long multiple() {
		System.out.println("enter e value:");
		int e = sc.nextInt();
		System.out.println("enter f value:");
		long f = sc.nextLong();
		long mul = e * f;
		return mul;

	}

	double division() {
		System.out.println("enter x value:");
		int x = sc.nextInt();
		System.out.println("enter y value:");
		int y = sc.nextInt();
		int div = x / y;
		return div;
	}

}
