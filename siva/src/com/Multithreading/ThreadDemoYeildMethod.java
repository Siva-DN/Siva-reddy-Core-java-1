package com.Multithreading;

public class ThreadDemoYeildMethod extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		

		for (int i = 0; i <= 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread.yield();
			System.out.println("run" + i);
		}
	}

	public static void main(String[] args) {

		ThreadDemoYeildMethod ty = new ThreadDemoYeildMethod();
		ty.start();
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 100; i++) {
			System.out.println("main" + i);
		}

	}

}
