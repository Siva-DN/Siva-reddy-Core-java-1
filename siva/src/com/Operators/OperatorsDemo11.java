package com.Operators;

//ternary operators--> ?,:..
//we can use also without logical condition so we can go for ternary operators

public class OperatorsDemo11 {

	public static void main(String[] args) {

		int a = 30;

		String msg = (a > 50) ? "yes" : "no";

		System.out.println(msg);

		int s1 = 20;
		int s2 = 50;
		int max = 0;

		max = (s1 > s2) ? s1 : s2;

		System.out.println("max value:" + max);

		int a1 = 40;
		int a2 = 30;
		int a3 = 70;
		;
		int max1 = 0;

		max1 = (a1 > a2) ? (a1 > a3 ? a1 : a3) : (a2 > a3 ? a2 : a3);

		System.out.println("max1 value:" + max1);

		int b1 = 20;
		int b2 = 50;
		int max3 = 0;

		max3 = (b1 < b2) ? b1 : b2;
		System.out.println(max3);

		String d1 = "siva";
		String d2 = "reddy";

		String bigString = "";

		bigString = (d1.length() > d2.length()) ? d1 : d2;

		System.out.println("bigstring:" + bigString);

	}

}
