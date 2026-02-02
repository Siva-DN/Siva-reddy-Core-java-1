package com.conditionalstatementsprograms;

//wap to find the given number sum of digits using while
import java.util.Scanner;

public class ConditionalStaSumOfDigitsDemo14 {

	static int findSum(int a) {
		int sum = 0;
		int r = 0;
		while (a != 0) {
			r = a % 10;// 123%10--> r=3 ,12%10-->r=2,1%10--r=1

			a = a / 10;// 123/10-->12, 12/10--1,1/10-->0
			sum = sum + r;// 3+2+1=6
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();

		int sum = findSum(a);
		System.out.println("given number sum is:" + sum);

	}

}
