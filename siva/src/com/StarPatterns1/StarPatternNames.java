package com.StarPatterns1;

//StarPatterns using Strings printing the names based on chatAt()...? 
public class StarPatternNames {

	public static void main(String[] args) throws InterruptedException {

		char ch = 'a';
		String s = "DHONI";

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j || i + j == 4) {
					Thread.sleep(1000);
					System.out.print(s.charAt(i)+" ");
				} else {
					System.out.print(ch++ + " ");
				}

			}
			System.out.println();

		}

	}

}
