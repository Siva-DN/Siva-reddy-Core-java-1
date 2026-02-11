package com.stringhandling;

public class CharacterChangingNum1 {

	public static void main(String[] args) {

		String s1 = "a1b2c3";

		String result = "";

		for (int i = 0; i < s1.length(); i=i+2) {
			char c = s1.charAt(i);

			int j = s1.charAt(i + 1) - '0';

			while (j > 0) {
				result = result + c;
				j--;
			}
			
		}

		System.out.println(result);
	}

}
