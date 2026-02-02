package com.arrays;

/*    0 0 0 
      0 1 0 
      0 0 0 
       */

public class Matrix {

	public static void main(String[] args) {
		System.out.println("main method Started");

		int[][] arr = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
		boolean[] status = new boolean[3];
		boolean[] status1 = new boolean[3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					status[i] = true;
					status1[j] = true;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (status[i] || status1[j]) {
					arr[i][j] = 0;
				}

			}
		}
		for (int[] arr1 : arr) {
			for (int arr2 : arr1) {
				System.out.print(arr2 + " ");
			}
			System.out.println();

		}
	}
}
