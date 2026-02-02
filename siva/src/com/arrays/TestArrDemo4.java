package com.arrays;

//2d array demo 
public class TestArrDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[][][][]arr = new int[4][4][4][4];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9,8 } };
		for (int[] n : arr1) {
			for (int n1 : n) {
			System.out.print(n1 + " ");
			}
			System.out.println();

		}

		String[][] arrname = { { "siva" }, { "reddy" }, { "Battula" } };

		for (int i = 0; i < arrname.length; i++) {
			for (int j = 0; j < arrname[i].length; j++)
				System.out.print(arrname[i][j] + " ||");

		}
		System.out.println();

		for (String[] name : arrname) {
			for (String name1 : name) {
				System.out.print(name1 + " ||");
			}
			System.out.println();
		}

	}

}
