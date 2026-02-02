package com.conditionalstatementsprograms;

//WAP to print the reverse number of a given number..?
//WAP to find the palin-drome number of a given number..?
import java.util.Scanner;

public class ConditionalStatReverseNumDemo16 {

	static int reverseNum(int a) {
		int rev = 0;
		int r = 0;

		// 546
		while (a != 0) {
			r = a % 10;// 546%10-->r=6 54%10-->4
			rev = rev * 10 + r;//6 4
			a = a / 10;// 546/10-->54--54/10-->5
			
		}
		return rev;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = sc.nextInt();

		int rev = reverseNum(a);
		System.out.println("reversenumber:" + rev);
		
		if(rev==a) {
			System.out.println("is palindrome:"+rev);
		}else {
			System.out.println("not a panidrome:"+rev);
		}
	}

}
