package com.stringhandling;

public class TaskMixNumandCharseperate {

	public static void main(String[] args) {
		System.out.println("main method started !!!");
		String s1 = "s12iv3a1";
		StringBuilder name = new StringBuilder();
		String num = "";
		int sum = 0;

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (Character.isDigit(ch)) {
				num += ch;
			} else {
				name.append(ch);
				if (!num.isEmpty()) {
					sum += Integer.parseInt(num);
					num = "";
				}
			}

		}

		System.out.println(name);
		System.out.println(sum);
	}

}
