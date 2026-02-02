package com.Operators;

//ComparisionOperator--->&&,||,!.
public class OperatorsDemo8 {

	public static void main(String[] args) {

		int a = 50;
		int b = 40;

		String s1 = "Siva";
		String s2 = new String("Siva");

		System.out.println("&& Info");
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println(a == b && b == a);// false
		System.out.println(a != b && a == b);// false
		System.out.println(b != a && a != b);// true
		System.out.println(b == a && b != a);// false

		System.out.println(a == b && s1.equals(s2));// false
		System.out.println(a != b && s1 == s2);// false
		System.out.println(b != a && !s1.equals(s2));// false
		System.out.println(b != a && s1.equals(s2));// true

	}

}
