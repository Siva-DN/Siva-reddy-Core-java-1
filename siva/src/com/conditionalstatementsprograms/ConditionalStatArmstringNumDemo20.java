package com.conditionalstatementsprograms;

//WAP to find given number is Armstrong/Narcosist number or not..?
import java.util.Scanner;

public class ConditionalStatArmstringNumDemo20 {

	static boolean IsArmstrong(int a) {
		boolean flag = false;
		int r = 0;
		double sum = 0;
		int temp = a;

		String str = Integer.toString(a);// 1234
		int digitCount = str.length();
		while (a != 0) {
			r = a % 10;
			sum = (int) sum + Math.pow(r, digitCount);
			a = a / 10;
		}
		if (sum == temp) {
			flag = true;
		}

		return flag;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();

		boolean status = IsArmstrong(a);

		if (status) {
			System.out.println("isArmstrong number:" + status);
		} else {
			System.out.println("isNotArmstrong:" + status);
		}
	}

}
