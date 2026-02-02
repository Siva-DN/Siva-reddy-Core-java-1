package com.arrays;

// 2d array with using for loop and for each loop..?
public class TestArrDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");

		String name[][] = { { "Siva", "Siri", "Sree" }, { "Phani", "Narri", "vamsi" }, { "dhoni", "vamsi", "koti" } };

//		name[0] = new String[2];
//		name[1] = new String[2];

		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.print(name[i][j]+" && ");
			}
			System.out.println();

		}

		for (String[] name1 : name) {
			for (String names : name1) {
				System.out.print(names + "|| ");

			}
			System.out.println();
		}

	}

}
