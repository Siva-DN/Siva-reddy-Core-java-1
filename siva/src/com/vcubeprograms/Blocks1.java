package com.vcubeprograms;

public class Blocks1 {
	{
		System.out.println("instance block");
	}
	{
		System.out.println("instance block1");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Blocks1 b1 = new Blocks1();
		Blocks1 b2 = new Blocks1();

	}

	static {
		System.out.println("static block");

	}
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
}
