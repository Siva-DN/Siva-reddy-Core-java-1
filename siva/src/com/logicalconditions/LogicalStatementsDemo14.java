package com.logicalconditions;

//WAP to signal lights int the road
import java.util.Scanner;

public class LogicalStatementsDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a color:");
		String color =sc.next();
		
		switch(color) {
		case "red"->System.out.println("Stop");
		case "yellow"->System.out.println("READY");
		case "green" ->System.out.println("YOU CAN GO");
		default ->System.out.println("NOT IN OPTION");
		
		}

	}

}
