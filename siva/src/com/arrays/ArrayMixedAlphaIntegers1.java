package com.arrays;

/* 1 A A A A 
   1 2 B B B 
   1 2 3 C C 
   1 2 3 4 D 
   1 2 3 4 5 
*/

public class ArrayMixedAlphaIntegers1 {

	public static void main(String[] args) {

//		int i,j=5;
		char c = 'A';

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print(j + " ");
				} else {
					System.out.print(c + " ");
				}
			}
			System.out.println();
			c++;
		}

	}

}
