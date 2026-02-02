package com.oppsinheritance;
/*Write java program to demonstrate Encapsulation and inheritance using Device and smartDevice Classes .

Parent Class: Device

power – boolean field that stores the power status of the device.

turnOn() – method that turns the device power ON.

turnOff() – method that turns the device power OFF.

isPowerOn() – method that returns whether the device power is ON or OFF.

Child Class: SmartDevice

useDevice() – method that allows the device to work only when the power is ON

Driver Class

main() – creates a SmartDevice object and calls useDevice(), turnOn() and turnOff() methods.
 */
public class Device {

	public  boolean power;

	public void turnOn() {
		power = true;
		System.out.println("Device power is on");
	}

	public void turnOff() {
		power = false;
		System.out.println("Device power is off");

	}

	public boolean IsisPowerOn() {
		return power;

	}

	public static void main(String[] args) {
		SmartDevice s1 = new SmartDevice();
		s1.useDevice();
		s1.turnOn();
		s1.turnOff();
	}
}
