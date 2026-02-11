package com.stringhandling;

public class StringMethods1 {

	public static void main(String[] args) {

		String s1 = "java";

		System.out.println(s1.codePointAt(1));
		
		System.out.println(s1.codePointBefore(1));
		
		
		String str1="java";
		String str2="Abhi";
		
		System.out.println(str1.compareTo(str2));//41
		
		String str3="Siva";
		String str4="SIva";
		
		System.out.println(str3.compareTo(str4));//32.
		
		System.out.println(str3.compareToIgnoreCase(str4));//0(Lexicographically).
		
		

	}

}
