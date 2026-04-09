package com.Multithreading;

public class ThreadDemo1  extends Thread{
	
	
	@Override
	public void run() {
		System.out.println("Show methd called");
		System.out.println(Thread.currentThread());
		
		for(int i=0;i<10;i++) {
			System.out.println("main"+i);
		}
		
		System.out.println("statement 5 !!");
		System.out.println("statement 6 !!");
		System.out.println("statement 7 !!");
		System.out.println("statement 8 !!");
		
		System.out.println("Show method ended");
	
	}
	

	public static void main(String[] args) {
		System.out.println("Main method started !!");
		
		System.out.println(Thread.currentThread());
		
		ThreadDemo1 td=new ThreadDemo1();
		
		td.start();
		
		System.out.println("statement 1 !!");
		System.out.println("statement 2 !!");
		System.out.println("statement 3 !!");
		System.out.println("statement 4 !!");
		
		for(int i=0;i<10;i++) {
			System.out.println("main"+i);
		}

		
		System.out.println("Main method ended !!");

		
		
		
	}

}
