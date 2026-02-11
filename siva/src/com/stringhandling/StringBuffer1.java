package com.stringhandling;

public class StringBuffer1 {

	public static void main(String[] args) {
		System.out.println("main method started!!");

		// Type mismatch: cannot convert from String to StringBuffer
//		StringBuffer s1="Sivareddy";
//		System.out.println(s1);

		
		//String is immutable.
		String s1="Sivareddy";
		s1.concat("battula");
		System.out.println(s1);
		
		
		
		//StringBuffer is mutable.
		StringBuffer s2 = new StringBuffer("Sivareddy");
		s2.append("battula");
		System.out.println(s2);
		
		
		//Capacity();
		StringBuffer s3 = new StringBuffer("Siva");
		System.out.println(s3.capacity());
		
		System.out.println("*******************");
		
		StringBuffer s4 = new StringBuffer();
		s4.append("battulasivareddyy");//16*2+2=34
		System.out.println(s4.capacity());
		
		StringBuffer s5 = new StringBuffer();
		s5.append("battulasivareddybattulasivareddyy");
		System.out.println(s5.capacity());
		
		StringBuffer s6 = new StringBuffer();
		s6.append("battulasivareddybattulasivareddyybattulasivareddy");
		System.out.println(s6.capacity());
		
		
		//ensureCapacity();
		
		StringBuffer s7 = new StringBuffer();
		s7.ensureCapacity(120);
		System.out.println(s7.capacity());
		

	}

}
