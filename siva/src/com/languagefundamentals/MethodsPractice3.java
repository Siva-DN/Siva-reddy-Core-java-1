package com.languagefundamentals;

//no return type + with arguments 
//

public class MethodsPractice3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		MethodsPractice3 m3 = new MethodsPractice3();
		// calling a method without values
		// call by value
		m3.subb(400, 500);
		m3.addd(300, 200);
		m3.mull(245, 349);
		m3.division(456, 3456);
		m3.divisions(456, 230);
		m3.modulus(560, 789);
	}

	void subb(int a, int b) {
		System.out.println("In subraction with arguments:" + (a - b));

	}

	void addd(long c, double d) {
		System.out.println("In addition:" + (c + d));

	}

	void mull(long e, double f) {
		System.out.println("In mull:" + (e * f));

	}

	void division(long g, float h) {
		System.out.println("In modules:" + (g % h));

	}

	void divisions(long i, double j) {
		System.out.println("In division:" + (i / j));

	}

	void modulus(int k, float l) {
		System.out.println("In modules:" + (l % k));

	}

}
