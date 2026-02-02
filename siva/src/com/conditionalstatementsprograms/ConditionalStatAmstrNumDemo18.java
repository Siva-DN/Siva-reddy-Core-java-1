package com.conditionalstatementsprograms;

import java.util.Scanner;

//WAP to find the given number is Armstrong number or not...?
//Armstrong number means 
//Ex:153, 370,371..

//1^3 +5^3 +3^3=153--->1+125+27=153
//3^3+7^3+0^3=370--->27+343+0=370
//3^3+7^3+1^3=371-->27+343+1=371

//1634 =1^4+6^4+3^4+4^4=1+1296+81+256=1634

public class ConditionalStatAmstrNumDemo18 {

	static boolean findAmstrong(int n) {
		boolean status = false;
		int r = 0;
		int temp = n;//To store the actual given number after calculation thats why.
		double sum = 0;
		while (n != 0) {
			r = n % 10;
			sum = sum + Math.pow(n, sum);
			n = n / 10;
		}

		return status = true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int n = sc.nextInt();

		boolean flag = findAmstrong(n);
		if (flag) {
			System.out.println(flag + ": is amstrong");
		} else {
			System.out.println(flag + ":is not a amstrong number");
		}

	}

}
