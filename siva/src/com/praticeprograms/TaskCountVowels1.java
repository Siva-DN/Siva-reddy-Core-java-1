package com.praticeprograms;

//WAP to count the number of vowels in a given String?
//example:input:"hello world"

import java.util.Scanner;

public class TaskCountVowels1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		int count = 0;

		String vowels = sc.nextLine();

		for (int i = 0; i < vowels.length(); i++) {
			char vowels1 = vowels.charAt(i);
			if (vowels1 == 'a' || vowels1 == 'e' || vowels1 == 'i' || vowels1 == 'o' || vowels1 == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
