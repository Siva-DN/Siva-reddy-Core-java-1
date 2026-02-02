package com.languagefundamentals;

//no return type and+no arguments
public class JavaMethodpractice {

	// main method is the entire point of the java program
	public static void main(String[] args) {
		System.out.println("main method started ");
		JavaMethodpractice m = new JavaMethodpractice();

		hello();
		JavaMethodpractice.hello();
		// calling the method
		m.display();

	}

	void display() {
		System.out.println("hey hii goodmorning");

	}

	// static methods call directly or by using class name and object reference
	// variable
	static void hello() {
		System.out.println("welocome to my world");

	}

}
