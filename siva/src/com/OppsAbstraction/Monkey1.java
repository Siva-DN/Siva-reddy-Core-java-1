package com.OppsAbstraction;

public class Monkey1 implements AnimalInterface1 {

	@Override
	public void eat() {
		System.out.println("monkey can eat every thing !!");
	}

	@Override
	public void sleep() {
		System.out.println("Monkey can sleep any time !! ");
	}

	@Override
	public void walk() {
		System.out.println("monkey can walk like a human");
	}

	@Override
	public void sound() {
		System.out.println("monkey can sound like kich kitch");
	}

	@Override
	public void run() {
		System.out.println("monkey can also run and also jumps like anything !!");
	}

}
