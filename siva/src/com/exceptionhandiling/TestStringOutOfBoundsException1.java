package com.exceptionhandiling;

public class TestStringOutOfBoundsException1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		try {
			String str1 = "SivaReddy";
			System.out.println(str1.charAt(5));//

			System.out.println(str1.charAt(9));
		} catch (StringIndexOutOfBoundsException se) {
			se.printStackTrace();
		}

		System.out.println("main method ended");
	}

}
