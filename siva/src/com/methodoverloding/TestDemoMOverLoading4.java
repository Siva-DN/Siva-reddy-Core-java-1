package com.methodoverloding;

public class TestDemoMOverLoading4 {

	public void main(String[] args) {

		display("Hello");
		display("Welcome,java");
		display("Java is simple");
		display("In vcube","Srikanth sir","viswa sir","cordinaters");

	}

	void display(String... names) {
		for (String name : names) {
			System.out.println(name);

		}

	}

}
