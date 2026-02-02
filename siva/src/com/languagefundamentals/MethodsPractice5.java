package com.languagefundamentals;

//no return type+with arguments program we will do small calculations 
import java.util.Scanner;

public class MethodsPractice5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		MethodsPractice4 m5 = new MethodsPractice4();
		System.out.println("enter the Id:");
		double y = sc.nextDouble();
		System.out.println("enter the lastname:");
		double x = sc.nextDouble();
		System.out.println("enter the fullname:");
		double z = sc.nextDouble();
		m5.subb(x, y);
		m5.mull(y, x);
		m5.division(y, x);
		m5.modulus(y, x);
		m5.divisions(y, x);

	}

	void subb(double y, double x) {
		System.out.println("In subraction with arguments:" + (x - y));
		addd(y, y);
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
