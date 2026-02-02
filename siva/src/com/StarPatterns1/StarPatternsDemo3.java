package com.StarPatterns1;
//Right rombhus with stars printing using nested for loops(for loop inside for loop)..?

public class StarPatternsDemo3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
