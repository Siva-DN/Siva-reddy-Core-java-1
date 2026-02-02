package com.StarPatterns1;

public class StarPatternsDemo5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
//				for (int j = 5; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

