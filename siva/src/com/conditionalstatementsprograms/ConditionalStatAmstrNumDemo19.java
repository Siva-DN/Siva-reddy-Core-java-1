package com.conditionalstatementsprograms;

import java.util.Scanner;

public class ConditionalStatAmstrNumDemo19 {

	static boolean findArmstrongNum(int a) {
		boolean status = false;
		int flag = 0;
		double sum = 0;
		int r = 0;
		int temp = a;

		while (a != 0) {
			r = a % 10;
			sum = sum + Math.pow(a, sum);
			a = a / 10;
		}
		if (temp == sum) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();
		boolean flag = findArmstrongNum(a);

		if (flag) {
			System.out.println(flag + ":is armstrong");
		} else {
			System.out.println(flag + ":is not armstrong");
		}

	}

}
