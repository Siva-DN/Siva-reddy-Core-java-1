package com.languagefundamentals;

public class DataTypes {
	byte b1 = 127;
	byte b = (byte) 258; // Explicit type casting:int to byte
	short s = 32767;
	short s1 = (short) 32768; // Explicit type casting:int to short

	// 4byte--32bits--2^31==2147483647
	int i = (int) 2147483647l;

	// 8byte=64bits==2^63== 92233720368
	long l = (int) 2147483648l;

	float f = 2000234567890789099l;
	float f1 = 5.2344f;
	// System.out.printf("%.2f%n",f1);

	double D = (float) 123445756687446678557788990765443445.0d;
	// Ascil code int--char-->implicit type casting
	// A=65,B=66,...Z=90
	// a=91,b=92....z=122
	char c = 'd';
	char c1 = 122;
	char c2 = '\u0040';// unicode character
	boolean bhom = true;
//	 boolean boomb =101;
//	 boolean boo ="false";
	boolean bo = true;

	public static void main(String[] args) {
		DataTypes d1 = new DataTypes();
		System.out.println(d1.b1);
		System.out.println(d1.b);

		System.out.println(d1.s);
		System.out.println(d1.s1);

		System.out.println(d1.i);
		System.out.println(d1.l);

		System.out.println(d1.f);
		System.out.println(d1.f1);

		System.out.println(d1.D);

		System.out.println(d1.c);
		System.out.println(d1.c1);
		System.out.println(d1.c2);

		System.out.println(d1.bhom);
		System.out.println(d1.bo);

	}

}
