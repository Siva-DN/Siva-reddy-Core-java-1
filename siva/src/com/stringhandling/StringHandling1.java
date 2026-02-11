package com.stringhandling;

public class StringHandling1 {

	public static void main(String[] args) {
		System.out.println("main method started !!!");

		String s1 = "Dhoni";// 1-object
		String s2 = "Dhoni";// 0-object

		String s3 = new String("Rohit");// heap-2 objects one is scp,one is heap area
		String s4 = new String("Rohit");// Heap-1 object in heap

		String s5 = new String("Dhoni");// object in heap because already have kohili is present

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s5);
		
		System.out.println(s1.equals(s5));
		
		

	}

}
