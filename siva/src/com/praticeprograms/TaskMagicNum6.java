package com.praticeprograms;


import java.util.Scanner;

public class TaskMagicNum6 {
	static boolean findMagic(int n) {
		boolean status = false;
		int r = 0;
		int sum = 1;
		while (n != 0) {
			r = r % 10;
			sum = sum % r;
			n = n / 10;
		}
		if (sum == n) {
			status= true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean magic = findMagic(n);
		if (magic) {
			System.out.println(magic + ":is magic number");
		} else {
			System.out.println(magic + " is not a magic number");
		}
	}

}
