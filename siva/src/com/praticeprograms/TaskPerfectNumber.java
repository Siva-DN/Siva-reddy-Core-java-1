package com.praticeprograms;

/*1) Java Program to Check Whether a Given Number is a Perfect Number or Not
 Input 1 : 
Enter a number: 6
Output 1 : 
6 is a Perfect Number.
Input 2 : 
Enter a number: 12
Output 2 :
12 is not a Perfect Number.
--------------------------------------
2) Java Program to Print All Perfect Numbers Between 1 and 1000
Output: 
Perfect numbers between 1 and 1000 are:
6
28
496 */
import java.util.Scanner;

public class TaskPerfectNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int num = sc.nextInt();// 6

		for (int i = 1; i < num / 2; i++) {
			int count = 0;
			if (num % i == 0) {
//				System.out.println(i + " ");
				count++;
				
				System.out.println("Is perfect number !!");
			}else {
				System.out.println("Is not a perfect number");
			}
			
//			for(int j=1;)
			System.out.println(i + " ");
			System.out.println(count + " ");
		}

	}

}
