package com.languagefundamentals;

public class MethodsPractice13 {

	public static void main(String[] args) {
		System.out.println("main method started");
		MethodsPractice13 m13 = new MethodsPractice13();
		m13.numbers();
		m13.evennumbers();
		m13.evennumber(20, 40);
		m13.printsquare(20, 40);
		m13.rectangle(20, 20);

	}

	void numbers() {
		for (int a = 1; a <= 20; a++) {
			System.out.println("one to twenty num:" + a);
		}
	}

	void evennumber(int i, int j) {
//		for(int i=2; i<=20;i+=2) {
		System.out.println("zero to 200 even num:" + (i *= j));
	}

	void evennumbers() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("zero to 20 even num:" + i);
			}
		}
	}

	void printsquare(double a, double b) {
		System.out.println("square value:" + (a * b));

	}

	void rectangle(int l, int h) {

		System.out.println("rec values:" + (l * h));
	}

}
