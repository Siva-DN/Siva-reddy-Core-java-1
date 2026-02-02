package com.vcubeprograms;

public class vcubeexample {
	int a = 201;
	String name = "hey_siva";

	static {
		System.out.println("static block");
		display();
	}
	{
		System.out.println("instance block");
		hello();
		display();
	}

	static void display() {
		System.out.println("static methoth1");
		System.out.println("hello welcome to my world");
	}

	void hello() {
		System.out.println("instance method");
		System.out.println("this this my program");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		vcubeexample v1 = new vcubeexample();
		v1.hello();
		display();
		System.out.println(v1.a);
		System.out.println(v1.name);

		vcubeexample v2 = new vcubeexample();
		vcubeexample v3 = new vcubeexample();
		vcubeexample v4 = new vcubeexample();

		System.out.println(v2.name);
		System.out.println(v3.a);
		System.out.println(v4.name);
	}

}
