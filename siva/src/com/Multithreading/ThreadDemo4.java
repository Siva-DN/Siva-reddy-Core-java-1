package com.Multithreading;

class A {
	// 100 functionalities
}

public class ThreadDemo4 extends A implements Runnable {

	@Override
	public void run() {
		System.out.println("Run method Started ");

		for (int i = 0; i <= 10; i++) {
			System.out.println("main info" + i);
		}

		System.out.println("Run method ended  ");

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		ThreadDemo4 td = new ThreadDemo4();
		Thread t = new Thread(td);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main info" + i);
		}

		System.out.println("main method ended ");
	}

}
