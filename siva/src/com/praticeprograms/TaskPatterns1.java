package com.praticeprograms;

import java.util.Scanner;

public class TaskPatterns1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("enter a character:");
//		String a=sc.next();
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		char k='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println( );
			
		}
	}

}
