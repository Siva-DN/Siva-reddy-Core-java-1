package com.praticeprograms;

/* Write a Java program to print the multiplication table of a number entered by the user.

 Write a Java program to reverse a given number using a loop.

(Example: input = 456 → output = 654)

Write a Java program to check whether a number is a palindrome using loops.
 */
import java.util.Scanner;

public class Task4Loops {

	static void findTable(int a) {
		for (int i = 1; i <= a; i++) {

			System.out.println(a + " X" + i + " = " + i * a);

		}
	}

	static int reverseNum(int a) {
		boolean status=false;
		int rev = 0;
		int r = 0;
		while (a != 0) {
			r = a % 10;// 456%10=6-->45%10=5-->4%10=4
			rev = rev * 10+r;
			a = a / 10;// 456/10=45-->45/10=4--45/10=4-->4/10=0;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int a = sc.nextInt();
		findTable(a);
		int rev=reverseNum( a);
		
		System.out.println(rev+":reverse number");
		
		if(a==rev) {
			System.out.println(rev+": is palindrome");
		}else {
			System.out.println(rev+" is not palindrome");
		}

	}

}
