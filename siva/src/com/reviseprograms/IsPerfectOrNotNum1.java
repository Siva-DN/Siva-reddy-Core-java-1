package com.reviseprograms;

import java.util.Scanner;

public class IsPerfectOrNotNum1 {

	static boolean isPerfectOrNot(int a) {
		boolean status = false;
		int sum = 0;

		for (int i = 1; i <= a/2; i++) {
			if (a % i == 0)
				sum = sum + i;

		}
		if (sum == a) {
			status = true;
		}
		return status;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();

		boolean isPerfect = isPerfectOrNot(a);
		
		if(isPerfect) {
			System.out.println("isperfect:"+isPerfect);
		}else {
			System.out.println("isNotPerfect:"+isPerfect);
		}

	}

}
