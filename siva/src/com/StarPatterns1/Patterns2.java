package com.StarPatterns1;

public class Patterns2 {

	public static void main(String[] args) {
		int n= 5;
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
		
        // Lower Part
		for (int l= n-1; l >= 1; l--) {
		for (int ls = 1; ls <= n -l; ls++) {
			System.out.print(" ");
		}
			for (int k= 1; k <= 2 * l - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	  }
	}


