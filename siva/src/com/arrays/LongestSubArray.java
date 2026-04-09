package com.arrays;

public class LongestSubArray {

	public static void main(String[] args) {

		System.out.println("main method Started !!");

		int[] arr = { 1, 0, 1, 0, 1, 1, 0 };
		int maxlength = 0;
		int startindex = -1;
		int endindex = -1;

		for (int i = 0; i < arr.length; i++) {
			int zero = 0;
			int ones = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == 0) {
					zero++;
				} else {
					ones++;
				}
				if (zero == ones) {
					if (j - i + 1 > maxlength) {
						maxlength = j - i + 1;
						startindex = i;
						endindex = j;
					}
				}
			}
		}

		System.out.println("Longest Subarray Length: " + maxlength);

		for (int k = startindex; k <= endindex; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}