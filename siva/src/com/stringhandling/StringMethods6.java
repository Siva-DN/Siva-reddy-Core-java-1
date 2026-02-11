package com.stringhandling;

//WAP to print reverse of an given array..?
public class StringMethods6 {

	public static void main(String[] args) {

		String str1 = "Sree";

		byte[] ab = str1.getBytes();// 0 1 2 3

		for (int i = ab.length - 1; i >= 0; i--) {
			System.out.print((char) ab[i]);
		}
		System.out.println();

		String s2 = "siva";

		char[] ch = s2.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();

		String s3 = "Nandhu";

		char[] ach = s3.toCharArray();

		int start = 0;
		int end = ach.length - 1;
		int temp = 0;

		while (start < end) {
			temp = ach[start];
			ach[start] = ach[end];
			ach[end] = (char) temp;
			start++;
			end--;

		}
		for (char c : ach) {
			System.out.print(c);
		}

	}

}
