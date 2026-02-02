package com.arrays;

public class Addition_Element_At_End {
	
	
	public  int count(int a) {
		int count=0;
		
		while(a!=0) {
			count++;
	        a/=10;
	       
		}
		return count;
		
	}
	
	

	public static void main(String[] args) {

//		int[] arr = { 25, 2, 226, 1, 8, 46 };
//
//		for (int i = 0; i < arr.length; i++) {
//			int length = String.valueOf(arr[i]).length();
//			arr[i] = arr[i] * 10 + length;
//			System.out.print(arr[i]+" ");
//		}
//
	}
}
