package com.stringhandling;

public class StringMethods5 {

	public static void main(String[] args) {
		
		StringMethods5 s=new StringMethods5();
		
		StringMethods5 s5=new StringMethods5();
		
		System.out.println(s.hashCode());
		System.out.println(s5.hashCode());
		
//
//		String s1 = "Siva";
//		String s2 = "Siva";
		
		String s3=new String("Siva");
		String s4=new String("Siva");

		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		

		
		if (s3 == s4) {
			System.out.println("Both are same !!");

		} else {
			System.out.println("Both are not same !!");
		}

		if (s3.equals(s4)) {
			System.out.println("Both Are Same");
		} else {
			System.out.println("Both are not same !!");
		}
	}

}
