package com.vcubeprograms;

public class TestDemo {
	static TestDemo t1 = new TestDemo();// long term objects -->old generation

	public static void main(String[] args) {

		TestDemo t2 = new TestDemo();// short term objects --> young generation

	}

}
