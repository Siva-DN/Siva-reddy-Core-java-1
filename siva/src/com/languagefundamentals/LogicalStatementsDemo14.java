package com.languagefundamentals;

import java.util.Scanner;

public class LogicalStatementsDemo14 {

	public static void main(String[] args) {
	System.out.println("main method started");
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter A day:");
	
	int day=sc.nextInt();
	
	System.out.println("Day Descreption:"+LogicalStatementsDemo14.getDayDescreption(day));

	}
	
	static String getDayDescreption(int day) {
		return switch(day){
		case 1->"sundays are always holiday !!";
		case 2->"mondays are always lazy day !!";
		case 3,4,5->"tuesdays,wednesday,thursday are boring days !!";
		case 6->"friday is  are always funday !!";
		case 7->"saturdays are always happy day !!";
		
		default->"Not a valid day";
		};
	}

}
