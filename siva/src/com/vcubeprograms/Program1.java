//Take 2 instance and 2 static methods in a class call the methods without creating object in any methods  even in main method
package com.vcubeprograms;

public class Program1 {
	static {
		Program1 p1 = new Program1();
		p1.instance1();

		display();
		hello();
	}

	static void display() {
		System.out.println("static method 1");

	}

	static void hello() {
		System.out.println("static method 2");

	}

	void instance1() {
		System.out.println("instance method 1");
		instance2();
	}

	void instance2() {
		System.out.println("instance method 2");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

	}
}