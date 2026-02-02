package com.methodoverloding;

class A {
	public int method1() {
		return 10;
	}
}

class B extends A {
	void method1(int a) {
	}
}

public class TestDemoMOverLoading3 {
	void main(String... args) {
		addition("");
		addition("hello",10);
		addition("hello",10, 20);
		addition("hii",11, 12, 13);
		addition("hey",10, 20, 30, 40);

	}

	//var-arg method
	//The variable argument type int of the method addition must be the last parameter
	void addition(String s ,int... num) {
		int sum = 0;
		for (int n : num) {
			sum = sum + n;

		}
		System.out.println("sum:"+sum);
	}

}
