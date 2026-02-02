package com.OppsAbstraction;

public class Cat1 implements AnimalInterface1 {

	@Override
	public void eat() {
		System.out.println("cat can eat rats");
	}

	@Override
	public void sleep() {
		System.out.println("cat can sleep at nights !!");
	}

	@Override
	public void walk() {
		System.out.println("cat can walk like cat cat walk !!");
	}

	@Override
	public void sound() {
		System.out.println("cat can sound like mieo mieo !!");
	}
	@Override
	public void run() {
		System.out.println("cat can also run and also catch like rats !!");
	}
	
	@Override
	public void swim() {
		System.out.println("cat can't swim okay !!!");
	}

}
