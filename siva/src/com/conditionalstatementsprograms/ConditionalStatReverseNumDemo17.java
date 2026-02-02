package com.conditionalstatementsprograms;

import java.util.Scanner;

public class ConditionalStatReverseNumDemo17 {

	static int findRev(int name) {
		int rev = 0;
		int r = 0;
		while (name != 0) {
			r = name % 10;
			rev = rev * 10 + r;
			name = name / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a name:");

		int name = sc.nextInt();

		int rev = findRev(name);
		System.out.println(rev + ": reverse number of given number");

		if (rev == name) {
			System.out.println(name + ":is palindrome number");
		} else {
			System.out.println(name + ":is not a palindroma number");
		}
	}

}
