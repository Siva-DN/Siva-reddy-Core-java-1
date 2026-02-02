package com.arrays;

// WAP to print given two arrays with combine third array represent..? 
public class TestArrDemo7 {

	public static void main(String[] args) {

		int[] arrnum1 = { 101, 102, 103 };

		int[] arrnum2 = { 104, 105, 106 };

		int[] arrnum3 = new int[arrnum1.length + arrnum2.length];

		for (int i = 0; i < arrnum1.length; i++) {
			arrnum3[i] = arrnum1[i];
		}

		for (int j = 0; j < arrnum2.length; j++) {
			arrnum3[arrnum1.length + j] = arrnum2[j];
		}
		
		for(int array:arrnum3) {
			System.out.print(array+ " ");
		}

	}

}
