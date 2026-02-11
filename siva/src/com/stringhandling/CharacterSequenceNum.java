package com.stringhandling;

public class CharacterSequenceNum {

	public static void main(String[] args) {

		String s = "aabbbcccc";

		String result = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count = 1;

			result = result + ch;

			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;

			}
			result = result + count;
		}
		System.out.println(result+" ");
	}

}
