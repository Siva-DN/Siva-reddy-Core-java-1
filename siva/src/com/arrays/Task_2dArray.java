package com.arrays;

public class Task_2dArray {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int [][]arr1= {{},{},{}};
		
		
		
//		System.out.println("Before Representation..!");
//		for (int[] arr1 : arr) {
//			for (int arr2 : arr1) {
//				System.out.print(arr2 + " ");
//
//			}
//			System.out.println();
//	}
		System.out.println("After Representation..!");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i]);

			}
			System.out.println();
		}

	}
}
