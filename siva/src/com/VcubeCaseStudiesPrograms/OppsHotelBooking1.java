package com.VcubeCaseStudiesPrograms;

import java.util.Scanner;

public class OppsHotelBooking1 {

	private int roomNumber;
	private String guestName;
	private String roomType;
	private double roomPrice;
	private boolean isBooked;

	static Scanner sc = new Scanner(System.in);

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		System.out.println("enter the roomNumber: ");
		roomNumber = sc.nextInt();
		if (roomNumber > 0) {
			this.roomNumber = roomNumber;
		} else {
			System.out.println("invalid room");
		}
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		System.out.println("enter the GuestName: ");
		guestName = sc.next();
		if (guestName != null && !guestName.isEmpty()) {
			this.guestName = guestName;
		} else {
			System.out.println("invalid name");
		}
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		System.out.println("enter the roomType: ");
		roomType = sc.next();
		if (roomType.equalsIgnoreCase("Standard")) {
			this.roomType = roomType;
			roomPrice = 2000;
		} else if (roomType.equalsIgnoreCase("Deluxe")) {
			this.roomType = roomType;
			roomPrice = 3000;

		} else {
			System.out.println("invalid room type");
		}
	}

	public void isBooked() {
		if (!isBooked) {
			isBooked = true;
			System.out.println("Room booked SuccessFully");
		} else {
			isBooked = false;
			System.out.println("Room Already Booked");
		}

	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public static void main(String[] args) {

	}
}
