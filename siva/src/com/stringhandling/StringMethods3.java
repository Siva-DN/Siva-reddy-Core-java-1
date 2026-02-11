package com.stringhandling;

public class StringMethods3 {

	public static void main(String[] args) {

		String[] heros = { "Babu", "Ntr", "charan", "prabhas", "Ranvir" };

		for (String h : heros) {
			if (h.endsWith("u") || h.contains("N") || h.startsWith("R")) {
				System.out.println(h);
			}
		}

	}

}
