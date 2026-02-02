package com.arrays;

public class TestArrayDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		// Deceleration
		int i1;
		int i2;
		int i3;
		int i4;

		//creation
		int[] num = new int[4];

		String[] name = new String[4];
		String name1;
		String name2;
		String name3;
		String name4;

		name[0] = "siva";
		name[1] = "siri";
		name[2] = "sree";
		name[3] = "phani";

		//Initialization
		num[0] = 101;
		num[1] = 102;
		num[2] = 103;
		num[3] = 104;

		//looping the array index of the elements.
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}

		for (int a = 0; a < name.length; a++) {
			System.out.println(name[a] + " ");
		}
	}

}
