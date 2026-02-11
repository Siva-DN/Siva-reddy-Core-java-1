package com.stringhandling;

public class StringMethods8 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		String s1 = "Siva";

		byte[] arrbyte = s1.getBytes(); // 0 1 2 3 4

		for (int i = arrbyte.length - 1; i >= 0; i--) {
			System.out.print((char) arrbyte[i]);
		}

		System.out.println("********************");

		String s2 = "Sree";

		char[] ach = s2.toCharArray();
		for (int i = ach.length - 1; i >= 0; i--) {
			System.out.print(ach[i]);

		}
	}

}
