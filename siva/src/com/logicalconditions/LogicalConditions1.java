package com.logicalconditions;

//Logical conditions-->if,else conditions
public class LogicalConditions1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		/*
		 * Syntax:1 if(Condition true) { System.out.println("1");
		 * System.out.println("1"); ... System.out.println("n"); }
		 */

		/*
		 * Syntax:2 only first statement will execute if(Condition true)
		 * System.out.println("1");
		 */

		/*
		 * Syntax:3 condition is false then go for else block execute if(Condition
		 * false) { System.out.println("1"); System.out.println("1"); ...
		 * System.out.println("n");
		 * 
		 * 
		 * }else{ System.out.println("statement 1"); System.out.println("statement 2");
		 * System.out.println("statement n"); }
		 * 
		 * /*Syntax:4 condition false without bracket then else condition if(Condition
		 * false) System.out.println("1"); else System.out.println("statement 1");
		 * System.out.println("statement 2"); .... system.out.println("statement n);
		 * 
		 */
		int a=100;
		if(a!=100) {
		System.out.println("hi good morning");
		System.out.println("Have a great day");
		System.out.println("welcome to kphp");
		}else {
			System.out.println("your badluck");
		}
		System.out.println("main method ended");
		
		

	}

}
