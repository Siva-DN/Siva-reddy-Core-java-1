package com.arrays;

import java.util.Scanner;

public class NonRepeatCharFromString {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a Word ");
		String a = sc.nextLine();// swiss

		for (int i = 0; i < a.length(); i++) {
			int count = 1;
			char ch = a.charAt(i);
			for (int j = i + 1; j < a.length(); j++) {
				if (ch == a.charAt(j)) {
					count++;

				}

			}
			if (count == 1) {
				System.out.println(a.charAt(i));
				break;
			}
		}
	}
}
