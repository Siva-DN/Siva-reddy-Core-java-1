package com.Operators;

public class OpInstanceOf {

	public static void main(String[] args) {

		OpInstanceOf t1 = new OpInstanceOf();

		Integer i = 100;

		System.out.println(i instanceof Integer);

		System.out.println(i instanceof Number);
		System.out.println(i instanceof Object);

		System.out.println("*************************");
		String name = "Java";

		System.out.println(name instanceof String);
		System.out.println(name instanceof Object);
		System.out.println("***********************************");
		System.out.println(null instanceof Integer);
		System.out.println(null instanceof String);

		class TestA {

		}

		class TestB extends OpInstanceOf {

		}

		System.out.println(t1 instanceof OpInstanceOf);
		System.out.println(t1 instanceof TestB);
	}

}
