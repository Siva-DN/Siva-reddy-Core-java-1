package com.languagefundamentals;

public class MethodsPractice1 {

//static show method
	static void show() {
		System.out.println("show method started ");
	}
//instance welcome method
	void welcome() {
		System.out.println("welcome method started");
		MethodsPractice1.show();
	}
// instance main method
//In instance  main method called by  jvm
//In instance method we can call instance methods directly no need to any object creation
//and also we can call static methods in instance area.
	public static void main(String[] args) {
		System.out.println("main method started ");
		 show();
		MethodsPractice1 m1 = new MethodsPractice1();
		m1.welcome();

	}

}
