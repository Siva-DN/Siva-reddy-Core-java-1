package com.arrays;

import java.util.Arrays;

public class ArrayMiddleElementOrdering {

	public static void main(String[] args) {

		int[] array = { 17, 16, 15, 19, 1, 1, 2, 3, 4, 5, 6 };

		int temp = 0;
		System.out.println(array.length/2);

		for (int i = 0; i < array.length/2; i++) {
			for (int j = i+1; j < array.length/2; j++) {
				if (array[i] > array[j ]) {
					temp = array[j];
					array[j] = array[j ];
					array[j ] = temp;
				}
			}
		}
		for (int i = array.length/2+1; i < array.length; i++) {
			for (int j = i+1; j < array.length ; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j ] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
