package com.exceptionhandiling;


//StackOverFlow,Outof-memory...
public class ExceptionErrors {
	
	{
		System.out.println("instance block !!");
		
//		ExceptionErrors e=new ExceptionErrors();
	}

	public static void main(String[] args) {
		
		
		int[] num= new int[273377756];
		
		ExceptionErrors e=new ExceptionErrors();
	}

}
