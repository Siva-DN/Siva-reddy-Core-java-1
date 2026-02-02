package com.Operators;

//Unary operators--->+,-,++,--?
//pre-increment--pre-decrement--->a++--a=a+1,++a-->a+1then a print
//post-increment--post-decrement

public class OperatorsDemo7 {

	public static void main(String[] args) {

		int a = 30;
		int b = 50;

		System.out.println(+a);
		System.out.println(-b);

		System.out.println(++a);// 30-->+1-->31
		System.out.println(++a);// 32-->
		System.out.println(++a);// 33
		System.out.println(--a);// 32
		System.out.println(++a);// 33
		System.out.println(a--);// 33
		System.out.println(a++);// 32
		System.out.println(--a);// 32

		System.out.println("a value is:" + a);
		System.out.println("b value is:" + b);

		int s1 = 100;
		int s2 = 200;
		System.out.println(+s1);
		System.out.println(-s2);

		System.out.println(++s1);// 101
		System.out.println(++s1);// 102
		System.out.println(s1++);// 102--103
		System.out.println(--s1);// 102
		System.out.println(s1++);// 102
		System.out.println(++s2);// 201
		System.out.println(s2--);// 201
		System.out.println(--s2);// 199

		System.out.println("s1 value:" + s1);// 103
		System.out.println("s2 value:" + s2);// 199
	}

}
