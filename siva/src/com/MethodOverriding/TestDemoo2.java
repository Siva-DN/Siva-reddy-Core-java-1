package com.MethodOverriding;

abstract class TestA {
	abstract void method1();

	abstract void hey();

}

abstract class TestB extends TestA {

	@Override
	void method1() {

	}

	@Override
	abstract void hey();

	abstract class TestC extends TestB {

		@Override
		abstract void method1();

	}

	public class TestDemoo2 {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
