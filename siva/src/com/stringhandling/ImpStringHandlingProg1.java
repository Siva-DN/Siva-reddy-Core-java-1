package com.stringhandling;

import java.util.Scanner;
//WAP to count the charCount,vowelsCount,ConsCount,SpaceCount,MislineousCount..?

public class ImpStringHandlingProg1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String:");
		String s1 = sc.nextLine();// Hello GoodAfterNoon.

		s1 = s1.toLowerCase();
		int charcount = 0;
		int vowelcount = 0;
		int conscount = 0;
		int spacecount = 0;
		int miscount = 0;
		int digitcount = 0;

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (Character.isAlphabetic(ch)) {
				charcount++;

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelcount++;
				} else {
					conscount++;
				}

			} else if (Character.isDigit(ch)) {
				digitcount++;
			} else if (Character.isSpace(ch)) {
				spacecount++;
			} else {
				miscount++;
			}
		}

		System.out.println("charcount is:" + charcount);
		System.out.println("digitcount:" + digitcount);
		System.out.println("spacecount:" + spacecount);
		System.out.println("vowelcount:" + vowelcount);
		System.out.println("consonantcount:" + conscount);
		System.out.println("mislinueoscount:" + miscount);

	}

}
