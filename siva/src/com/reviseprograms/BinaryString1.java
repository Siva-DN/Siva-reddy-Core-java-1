package com.reviseprograms;

public class BinaryString1 {

	public static void main(String[] args) {
		
		String s1="1001011011";
		
		int count=0;
		
	while(s1.contains("10")) {
			s1=s1.replace("10", "01");
			count++;
		}
		
		System.out.println(s1);
		System.out.println(count);
	}

}
