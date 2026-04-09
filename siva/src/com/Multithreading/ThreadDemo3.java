package com.Multithreading;

//EXAMPLE:VLC media player :Audio+video+Timer

class AudioThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Audio Info:" + i);
		}

	}
}

class VideoThread extends Thread {

	@Override
	public void run() {
		for (int i = 10; i <= 20; i++) {
			System.out.println("Video Info:" + i);
		}
	}
}

class TimerThread extends Thread {

	@Override
	public void run() {
		for (int i = 20; i <= 30; i++) {
			System.out.println("Timer Info:" + i);
		}

	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {

		System.out.println("main method started !!");
		AudioThread at = new AudioThread();
		VideoThread vt = new VideoThread();
		TimerThread tt = new TimerThread();

		at.start();
		vt.start();
		tt.start();

	}

}
