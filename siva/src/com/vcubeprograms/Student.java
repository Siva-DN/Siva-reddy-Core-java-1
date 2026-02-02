//printing all methods calling in main method..??
package com.vcubeprograms;

public class Student {
	static void display() {
		System.out.println("static method1 ");
		hello();

	}

	static void hello() {
		System.out.println("static method2 ");

	}

	void instance() {
		System.out.println("instance block 1");
		display();
	}

	void instance1() {
		System.out.println("instance block 2");
		instance();
	}

	public static void main(String[] args) {
		System.out.println("main method stared");
		Student s1 = new Student();
		s1.instance1();

	}

}
