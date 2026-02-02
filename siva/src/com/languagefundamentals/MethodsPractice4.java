package com.languagefundamentals;

import java.util.Scanner;

public class MethodsPractice4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		MethodsPractice4 m4 = new MethodsPractice4();
		System.out.println("enter the number:");
		double y = sc.nextDouble();
		System.out.println("enter the number:");
		double x = sc.nextDouble();
		System.out.println("enter the number:");
		subb(x, y);
		m4.addd(y, y);
		m4.mull(y, x);
		m4.division(y, x);
		m4.modulus(y, x);
		m4.divisions(y, x);

	}

	static void subb(double x, double y) {
		System.out.println("In subraction with arguments:" + (x - y));

	}

	void addd(double c, double d) {
		System.out.println("In addition:" + (c + d));

	}

	void mull(double e, double f) {
		System.out.println("In mull:" + (e * f));

	}

	void division(double g, double h) {
		System.out.println("In modules:" + (g % h));

	}

	void divisions(double i, double j) {
		System.out.println("In division:" + (i / j));

	}

	void modulus(double k, double l) {
		System.out.println("In modules:" + (l % k));

	}

}
