package com.Multithreading;

public class ThreadDemo2 extends Thread {

	@Override
	public void run() {
		System.out.println("display method called !!");
		System.out.println("display thread info" + Thread.currentThread());

		for (int i = 0; i <= 10; i++) {
			System.out.println("display:" + i);

		}
		System.out.println("display method ended !!");

	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("main thread info"+Thread.currentThread());

		ThreadDemo2 td = new ThreadDemo2();
		td.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main:" + i);
		}
		System.out.println("main method ended !!");
	}

}
