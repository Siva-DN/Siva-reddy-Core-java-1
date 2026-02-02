package com.conditionalstatementsprograms;

// WAP to print decimal to binary number like 25-->0101..?
import java.util.Scanner;

public class ConditionalStatDecToBinaryNumDemo22 {

	static void decimalToBinaryNum(int a) {
		int r = 0;
		String rstr = "";

		while (a != 0) {
			r = a % 2;// 25%2=1-->12%2=0-->6%2=0,3%2=1,1%2=1
			a = a / 2;// 25/2=12-->12/2=6-->6/2=3,-->3/2=1-->1/2=0
			rstr = r + " " + rstr;
		}
		System.out.print(rstr);
	}

	public static void main(String[] args) {

		int x = 0b101101;
		System.out.println(x);
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();
		decimalToBinaryNum(a);
	}

}
