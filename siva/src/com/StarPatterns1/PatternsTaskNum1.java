package com.StarPatterns1;

/*    1 
 *   1 1
 *  1 2 1
 * 1 3 3 1
 *1 4 6 4 1

 */
public class PatternsTaskNum1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			int n = 1;
			for (int k = 1; k <= i; k++) {
				System.out.print(n + " ");
				n = n * (i - k) / k;
			}
			System.out.println();

		}

	}

}
