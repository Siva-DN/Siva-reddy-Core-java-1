package com.MethodOverriding;

abstract class Test1 {
	

	 void hello(int a) throws InterruptedException {
		System.out.println("hello" + a);
	}

	public static void main(String[] args) {
		System.out.println("main method started from test1");

	}
}

class Test2 extends Test1 {

	void hello(int a) throws InterruptedException {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		System.out.println("main method started from test2");
	}
}

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");

	}

}