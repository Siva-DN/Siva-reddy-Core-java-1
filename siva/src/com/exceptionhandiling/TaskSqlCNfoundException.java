package com.exceptionhandiling;

import java.util.Scanner;

public class TaskSqlCNfoundException {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started !!");
		
		Scanner sc =new Scanner(System.in);
		Class.forName("com.exceptionhandiling.TaskArrayInputMisExceptions");
		System.out.println("class loaded successfully !!");
		
		
		System.out.println("");
	}

}
