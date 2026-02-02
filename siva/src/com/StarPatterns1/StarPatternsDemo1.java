package com.StarPatterns1;

//left rombhus with stars printing using nested for loops(for loop inside for loop)..?
public class StarPatternsDemo1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
