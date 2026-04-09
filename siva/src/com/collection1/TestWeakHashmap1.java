package com.collection1;

import java.util.Map;
import java.util.WeakHashMap;

class Temp {
	@Override
	public String toString() {
		return "Sree";

	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("finalize method called");
	}

}

public class TestWeakHashmap1 {

	public static void main(String[] args) throws InterruptedException {

		Map<Object, String> map = new WeakHashMap<>();

		Temp t = new Temp();
		System.out.println(t);

		map.put(t, "Java");
		System.out.println(map);

		t = null;
		System.gc();
		
		Thread.sleep(5000);
		System.out.println(map);

	}

}
