package com.Operators;

//Assignment(or)compound  operators....--> =,+=,-=,*=,/=,%=
public class OperatorsDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		double a=10;
		double result=0;
		
		result=result+10;
		System.out.println(result);
		result=result+9;
		
		System.out.println(result);
		
		result +=4.0;
		System.out.println(result);
		
		result-=5;
		System.out.println("result:"+result);
		
		result*=5;
		System.out.println(result);
		
		result/=5;
		System.out.println(result);
		
		result%=5;
		System.out.println(result);
		
		char b=50;
		int result1=0;
		
		result1-=b;
		System.out.println(result1);
		
		result1+=5;
		System.out.println(result1);
		
	}

}
