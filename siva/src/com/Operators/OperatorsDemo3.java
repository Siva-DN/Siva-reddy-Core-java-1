package com.Operators;

//Relational or comparison operator----->==.<,<=,>,>=,and !=
//--->will give you result boolean expression  values like true or false 

public class OperatorsDemo3 {

	public static void main(String[] args) {

		String s1 = "Siva";// String Literals
		String s2 = "Siva";// String Literals
		String s3 = "Siva";// String Literals

		String s4 = new String("Siva");
		System.out.println(s4);// Siva
		System.out.println(s1 == s2);// false
		System.out.println(s1 == s3);// false
		System.out.println(s1 == s4);// false

		double c = 50;
		double d = 100;

		System.out.println(c == d);// false
		System.out.println(c > d);// false
		System.out.println(c < d);// true

		int a = 50;
		double b = 50;
		int x = 150;

		System.out.println(a == b);// true
		System.out.println(b == x);// false
		System.out.println(a >= x);// false
		System.out.println(a <= x);// true
		System.out.println(a >= b);// true
		System.out.println(a <= b);// true

		System.out.println(a != b);// false

	}

}
