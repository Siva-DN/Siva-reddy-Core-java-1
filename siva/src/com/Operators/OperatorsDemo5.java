package com.Operators;

//Logical operators---> &&, ||,!.
public class OperatorsDemo5 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 50;

		String name = "Srikanth";
		String name2 = new String("Srikanth");

		System.out.println("&& INFO");
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println("&& INFO");
		System.out.println(a != b && name.equals(name2));// true
		System.out.println(a == b && name.equals(name2));// false
		System.out.println(a != b && !name.equals(name2));// false
		System.out.println(a == b && !name.equals(name2));// false

		System.out.println("|| INFO");
		System.out.println(true && true);// true
		System.out.println(true && false);// true
		System.out.println(false && true);// true
		System.out.println(false && false);// false

		System.out.println("|| INFO");
		System.out.println(a != b || name.equals(name2));// true
		System.out.println(a == b || name.equals(name2));// true
		System.out.println(a != b || !name.equals(name2));// false
		System.out.println(a == b || !name.equals(name2));// false

		System.out.println(!(b == c));
	}

}
