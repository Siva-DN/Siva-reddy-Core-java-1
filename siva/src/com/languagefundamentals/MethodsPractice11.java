package com.languagefundamentals;

//methods using with scanner for with return type+with arguments
//calling the method with return type and with arguments
//write  a program to print
//area of rectangle,
//area of square,
//are of triangle,
//area of circle
import java.util.Scanner;

public class MethodsPractice11 {
	static Scanner sc = new Scanner(System.in);
	int a, b = 20, c = 50, d;
	String name = "siva";

	void main(String[] args) {
		System.out.println("main method stsrted");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(name);
//		finding the area of rectangle

		System.out.println("enter l value:");
		double lenght = sc.nextDouble();
		System.out.println("enter b value:");
		double breadth = sc.nextDouble();

		System.out.println("enter s value:");
		long s = sc.nextLong();
		System.out.println("enter p value:");
		long p = sc.nextLong();

		System.out.println("enter x value:");
		float x = sc.nextFloat();
		System.out.println("enter y value:");
		float y = sc.nextFloat();

		System.out.println("enter r value:");
		double r = sc.nextDouble();
//		calling the method with return type and with arguments
		double areaofradius = areaofcircle(r);
		System.out.println(" areaofradius:" + areaofradius);

//		calling the area of triangle() {
		float aroftri = areaoftriangle(x, y);
		System.out.println(("areaoftriangle:" + aroftri));

//		calling the area of square method
		long areaofsquare = areaofsquare(s, p);
		System.out.println("area of square:" + areaofsquare);

//		calling area of rectangle method
		double areaofrec = areaofrectangle(lenght, breadth);
		System.out.println("area rectangle:" + areaofrec);

	}

	double areaofcircle(double r) {
		return Math.PI * r * r;
	}

	float areaoftriangle(float x, float y) {
		return (float) (0.5 * x * y);
	}

	double areaofrectangle(double lenght, double breadth) {
//		System.out.println("area of rectangle:");
		return lenght * breadth;

	}

	long areaofsquare(long s, long p) {
//		System.out.println("area of square:");
		return s * p;

	}

}
