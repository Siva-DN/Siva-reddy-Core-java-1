package com.arrays;

//WAP to write 3d array in the given array..?

public class TestArrDemo3dArray {

	public static void main(String[] args) {
		

		int[][][] arr = new int[3][3][3];
		arr[0][0][0] = 101;
		arr[1][1][1] = 102;
		arr[2][2][2] = 101;

		for (int[][] arr2 : arr) {
			for (int[] arr1 : arr2) {
				for (int array : arr1) {
					System.out.print(array + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
