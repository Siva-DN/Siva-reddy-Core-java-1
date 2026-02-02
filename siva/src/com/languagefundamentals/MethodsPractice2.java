package com.languagefundamentals;

//program for small calucates the add,sub,mul, division
//no return type + no arguments call the methods
//we can slove small program functionalities like sum and this method is uses for palindroma numbers and prime numbers we doing
public class MethodsPractice2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		MethodsPractice2 m2 = new MethodsPractice2();
		m2.subraction();
		m2.addition();
		m2.division();
	}

	void subraction() {
		System.out.println("In subration");
		int a1 = 20;
		int b1 = 40;
		System.out.println(a1 - b1);

	}

	void addition() {
		System.out.println("In addition");
		int a2 = 234;
		double b2 = 350;
		System.out.println("Addition of two numbers:" + (b2 + a2));
	}

	void division() {
		System.out.println("In division");
		int a3 = 234;
		double b3 = 359d;
		System.out.println(b3 % a3);
	}

}
