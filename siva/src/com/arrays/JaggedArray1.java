package com.arrays;

import java.util.Scanner;

public class JaggedArray1 {

	// Jagged-Array using Scanner class
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);


		
		System.out.println("enter the values based on size");
		//for (int i = 0; i < size1; i++) {
//	     	int[][] arr = new int[size1][size2];
			System.out.println("enter a 1st column size:");
			int size1 = sc.nextInt();
			System.out.println("enter a 2nd column size:");
			int size2 = sc.nextInt();
			int[][] arr = new int[size1][size2];

		

		for (int[] arr1 : arr) {
			for (int arrnum : arr1) {
				System.out.print(arrnum + " ");
			}
			System.out.println();

		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[j][i] + " ");
//			}
//			System.out.println();
//
//		}

	}

}
