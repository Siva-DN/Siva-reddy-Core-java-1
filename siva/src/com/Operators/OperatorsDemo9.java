package com.Operators;
//bitwise operators--->&,|,^,~.
public class OperatorsDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println(true &true);//true
		System.out.println(true &false);//false
		System.out.println(false &true);//false
		System.out.println(false&false);//false

		System.out.println(20&40);
		System.out.println(50 &40);
		System.out.println(100 &150);
		System.out.println(30 &30);
		
		System.out.println("Bitwise | Info");
		System.out.println(true |true);//true
		System.out.println(true |false);//true
		System.out.println(false |true);//true
		System.out.println(false |false);//false
		
		
		System.out.println(" Bitwise ^  Info");
		System.out.println(true ^true);//false
		System.out.println(true ^false);//true
		System.out.println(false^true);//true
		System.out.println(false ^false);//false
		
		System.out.println(~50);//(n+1)


	}

}
