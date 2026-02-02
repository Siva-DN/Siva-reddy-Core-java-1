package com.methodoverloding;

// method OverLoading Rules :
// 1) Method signature must not be same.
// 2) Method return type no need to be same .
public class TestDemoMOverLoading {

	void main(String[] args) {
		addition();
		addition(10);
		addition('A');
		addition(20, 30);
		float a = addition(20, 30);

	}

	void addition(char a) {
		System.out.println("addition method with char args called !!");
	}

	void addition() {
		System.out.println("addition method with no args called !!");
	}

	void addition(int a) {
		System.out.println("addition method with one int args called !!" + a);
	}

	void addition(float a) {
		System.out.println("addition method with one float args called !!" + a);
	}

	int addition(int a, int b) {
		System.out.println("addition method with two int args called !!" + a + "," + b);
		return a + b;
	}

	float addition(float a, float b) {
		System.out.println("addition method with one float,one float args called !!" + a + "," + b);

		return a + b;
	}

//
// The method addition(int, float) is ambiguous for the type TestDemoMOverLoading
	void addition(int a, float b) {
		System.out.println("addition method with one int,one float args called !!" + a + "," + b);

	}

	void addition(float a, int b) {
		System.out.println("addition method with one float,one int args called !!" + a + "," + b);

	}
}
