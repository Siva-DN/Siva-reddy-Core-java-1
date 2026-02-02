package com.arrays;

// WAP to print sum and avg values using array index..?
public class TestArrayDemo3 {

	public static void main(String[] ARGS) {
		System.out.println("main method started");

		long[] num = new long[4];

		byte[] numb = new byte[4];

		short[] number = new short[4];

		char[] name = new char[4];

		double[] numbers = new double[4];

		String[] names = new String[4];
		

		//initialization
		long[] n1 = { 1101l, 1102, 1103, 1104l };

		int[] n4 = { 101, 102, 103, 104 };

		byte[] n2 = { 10, 20, 30, 40 };

		short[] n3 = { 1, 2, 3, 4 };

		char[] name1 = { 's', 'i', 'v', 'a' };

		double[] n5 = { 2000.0, 3000.0d, 4000.0d, 5000.0d };

		String[] names1 = { "siva", "sree", "abhi", "siri" };

		for (int i = 0; i < name1.length; i++) {
			System.out.print(name1[i]);

		}
		System.out.println();

		for (int i = 0; i < n1.length; i++) {
			System.out.println(n1[i]);
		}
		for (int i = 0; i < n5.length; i++) {
			System.out.println(n5[i]);

		}
		for (int i = 0; i < names1.length; i++) {
			System.out.println(names1[i]);

		}
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n2[i]);
		}

		int sum = 0;
		int avg = 0;

		for (int i = 0; i < n2.length; i++) {
			sum = sum += n2[i];
			avg = sum / n2[3];

		System.out.println("sum of the byte values:" + sum);
		}
		System.out.println("average of the values:" + avg);
	
	
	for(int n:n4) {
		System.out.println(n+" ");
		
	}
}
}
