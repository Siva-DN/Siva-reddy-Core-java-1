package com.oppsinheritance;

public class SmartDevice extends Device {

	public void useDevice() {
		if (IsisPowerOn()) {
			System.out.println("device is working");
		} else {
			System.out.println("Device is working when power is turnOn");
		}
	}

}
