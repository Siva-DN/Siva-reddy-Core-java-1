package com.languagefundamentals;

public class SwitchProgram1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		char ch = 'e';

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonant");
		}
		

		
		//compile time error because cannot convert boolean into int type because it is if condition 
//		int a=5;
		
//		if(a=5) {
//			System.out.println("equals to 5");
//			
//		}
		
		int n=5;
		int result=-n++ + ++n - -n;
		System.out.println(result);

	}

}
