package com.vcubeprograms;

public class MethodsJvm {

	void hello() {
		System.out.println("hey goodmorning");
		display();
		dosthi();
	}

	public static void main(String[] args) {
		MethodsJvm m1 = new MethodsJvm();

		m1.hello();
	}

	static void display() {
		System.out.println("display1");
		desk();

	}

	static void dosthi() {
		System.out.println("display2");

	}

	static void desk() {
		System.out.println("display3");
		dosthi();

	}
}
