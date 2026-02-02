package com.exceptionhandiling;

//NullpointerException 
public class TestNullPointerException {

	public static void main(String[] args) {
		System.out.println("main method Started !");

		String str1 = "siva";
		String s1 = null;
		String s2 = "reddy";

		try {
			System.out.println("In try");
			System.out.println(str1.length());// 4
			System.out.println(s1.length());// NULL Pointer exception
			System.out.println(s2.length());// Can't
		} catch (NullPointerException e) {
			System.out.println("In catch !!");
			e.printStackTrace();

		}

		System.out.println("main method started !!");
	}

}
