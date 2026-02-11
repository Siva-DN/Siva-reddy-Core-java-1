package com.stringhandling;

public class StringMethods2 {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4};
		System.out.println(num);//Address of the object
		
		char[] ch= {'H','i','i'};
		System.out.println(ch);//Hii--array of characters is called string thats why
		
		
		System.out.println(String.copyValueOf(ch));

		String s1 = "java";

		String s2 = "Srikanth";

		System.out.println(s1.concat(s2));// javaSrikanth

		System.out.println(s1 + s2);// javaSrikanth

		String[] s3 = { "Dhoni", "Rohit", "Kohili", "Tilak", "Sanju", "Hardik" };

		for (String s : s3) {
			if (s.toLowerCase().contains("r")) {
				System.out.println(s);
			}

		}

		CharSequence cs = "java";
		System.out.println(s1.contentEquals(cs));

	}

}
