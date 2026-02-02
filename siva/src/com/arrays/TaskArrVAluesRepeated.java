package com.arrays;

public class TaskArrVAluesRepeated {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arrnum = { 1, 2, 3, 1, 2, 3, 2, 3, 1 };

		boolean[] arrnum1 = new boolean[arrnum.length];
		for (int i = 0; i < arrnum.length; i++) {
			int count = 1;
			if (arrnum1[i] == true) {
				continue;
			}
			for (int j = 0; j < arrnum1.length; j++) {
				if (arrnum[i] == arrnum[j] && i != j) {
					arrnum1[j] = true;
					count++;

				}
			}
			System.out.println(arrnum[i] + " ->" + count);
		}

	}
}
