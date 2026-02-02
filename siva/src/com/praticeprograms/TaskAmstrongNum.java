package com.praticeprograms;

import java.util.Scanner;

/*1. Write a program to find whether the number is Armstrong or not.
EX:1)153 
O/p : Armstrong 
2. 123
O/p : Not a Armstrong */
public class TaskAmstrongNum {

	static boolean findSumm(int a) {
		boolean status = false;
		int r = 0;
		int sump = 0;
		int temp = a;

		while (a != 0) {
			r = a % 10;

			sump = sump + r * r * r;
			a = a / 10;
		}
		if (temp == sump) {
			return true;
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		boolean find = findSumm(a);

		if (find) {
			System.out.println("IS amstrong number:" + find);
		} else {
			System.out.println("IS not amstrong number:" + find);

		}

	}

}
