package com.arrays;

public class StringArrayDiffPrint {

	public static void main(String[] args) {
		System.out.println("main method strated !!");

		String[] s1 = { "Tommy", "John", "Tommy", "harry" };

		System.out.println("array duplicate names");
		for (int i = 0; i < s1.length; i++) {
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					System.out.print(s1[i] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Unique elements !!");

		for (int i = 0; i < s1.length; i++) {
			int count = 0;
			for (int j = 0; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					count++;
				}

			}
			if (count == 1) {
				System.out.println(s1[i] + " ");
			}

		}
		
		
	}
}
