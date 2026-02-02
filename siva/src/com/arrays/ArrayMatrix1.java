package com.arrays;

public class ArrayMatrix1 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, 
				        { 5, 6, 7, 8 }, 
				        { 9, 10, 11, 12 },
				        { 13, 14, 15, 16 } };

//		for (int[] array1 : arr) {
//			for (int array2 : array1) {
//				System.out.print(array2 + "  ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length-1; j>=0; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println( );
		}
		
//		for(i=)
	

	}

}
