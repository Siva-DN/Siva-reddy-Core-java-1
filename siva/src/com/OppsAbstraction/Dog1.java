package com.OppsAbstraction;

public class Dog1 implements AnimalInterface1 {

	@Override
	public void eat() {
		System.out.println("Dog eat Biscits !!");
	}

	@Override
	public void sleep() {
		System.out.println("Dog Will sleep at morning time !!");
	}

	@Override
	public void walk() {
		System.out.println("Dog can walk like a Dog walk !!");
	}

	@Override
	public void sound() {
		System.out.println("Dog can sound like Bow Bow !!");
	}


	static void breath() {
		System.out.println("Dog will also breath");
	}

}
