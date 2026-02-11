package com.stringhandling;

public class WordsOrderSequence {

	public static void main(String[] args) {

		System.out.println("main method Started !!");

		String s1 = "am2 i1 going3 to4 town6 home5";

		String[] arr = s1.split("");
		String[] res = new String[arr.length];

		for (int i = 0; i <= arr.length; i++) {
			String s = arr[i];
			int words = 0;
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);

				if (Character.isDigit(ch)) {
					words = Integer.parseInt(ch + "");
					break;

				}
			}

			res[words - 1] = s;

		}
		for (String cw : res) {
			System.out.print(cw);
		}
	}
}
