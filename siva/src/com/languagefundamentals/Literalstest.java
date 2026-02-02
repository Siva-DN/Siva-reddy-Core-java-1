package com.languagefundamentals;

public class Literalstest {

	public static void main(String[] args) {
		Literalstest l1 = new Literalstest();
		System.out.println(l1);
		int t2 = 0x1dbd16a6;
		System.out.println(t2);
		System.out.println(l1);

		// decimal literals: base 10 (0-9)
		int a1 = 123;
		int a2 = 145;
		int a3 = 150;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		// octal literals starts with o will be octal number
		// base:- >8 (0-7)
		int b1 = 023;
		int b2 = 01234;
		int b3 = 02245;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		// hexa-decimal range base 16 ==0-9and a-f,A-F
		// Any number starts with ox will be consider as hexadecimal number
		int c1 = 0x45;
		int c2 = 0x456;
		int c3 = 0x876;
		int c4 = 0xdad;
		int c5 = 0xdea;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		// floating literals
		float f1 = 10;
		float f2 = 0.345f;
		float f3 = 10.5f;
		float f4 = 0x45;
		float f5 = 0.2345f;
		float f6 = 0x6773;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);

		// double literals
		double d1 = 10322333.f;
		double d2 = 0.345f;
		double d3 = 10.5d;
		double d4 = 0x45;
		double d5 = 0.2345f;
		double d6 = 0x6773;

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);

		// char literals
		char h1 = 'A';
		char h2 = 30;
		char h3 = '\u0066';

		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

	}

}
