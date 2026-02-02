package com.logicalconditions;

import java.util.Scanner;

public class LogicalStatementsDemo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         System.out.println("Display the Items");
		int size = sc.nextInt();
	
		switch (size) {
		case 36 -> {
			System.out.println("xtra-large");
			System.out.println("price:600");
			System.out.println("color:Red");
		}
		case 38 -> System.out.println("large");
		case 40 -> System.out.println("small");
		case 44 -> System.out.println("xtra-small");

		default -> System.out.println("There is any item");
		
		}
		sc.close();

	}

}
