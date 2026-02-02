package com.arrays;

// 3d array with values using array Representation..?
public class Test3DArrDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[][][] arr = { { { 101, 102, 103 }, { 104, 105, 106 }, { 107, 108, 109 } },
				{ { 100, 200, 300 }, { 400, 500, 600 }, { 700, 800, 900 } },
				{ { 11, 12, 13, }, { 14, 15, 16 }, { 17, 18, 19 } } };

		for (int[][] arr2 : arr) {
			for (int[] arr1 : arr2) {
				for (int arrnum : arr1) {
					System.out.print(arrnum + " ");
				}
				System.out.println();

			}

		}
	}

}
