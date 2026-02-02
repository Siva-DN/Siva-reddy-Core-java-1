package com.methodoverloding;

//String related program for method overloading !!
public class TestDemoMOverLoading2 {

	void main(String[] args) {
		System.out.println("main method started !!");
		display("Hello");
		display("null");

	}

	void display(String s) {
		System.out.println("String method called !" + s);
	}

	void display(Object o) {
		System.out.println("Object method called !" + o);
	}

}
