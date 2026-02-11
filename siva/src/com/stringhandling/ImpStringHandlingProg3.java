package com.stringhandling;

import java.util.Scanner;

//WAP to find the max occurances in a given String..? 
//Like: input:abbccc
//      output: c
public class ImpStringHandlingProg3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a string:");// a b b c c c
		String s1 = sc.nextLine();

		// To convert each string into array of numbers we take like below..
		int[] arr = new int[127];

		for (int i = 0; i < s1.length(); i++) {
			arr[s1.charAt(i)] = arr[s1.charAt(i)] + 1;
		}
		int max = -1;
		char ch = ' ';

		for (int i = 0; i < s1.length(); i++) {
			if (arr[s1.charAt(i)] > max) {
				max = arr[s1.charAt(i)];
				ch = s1.charAt(i);
			}
		}
		System.out.println("The max occurance is:" + ch);

	}

}
