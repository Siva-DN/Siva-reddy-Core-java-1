package com.VcubeCaseStudiesPrograms;

public class Hostel1 {

	public static void main(String[] args) {

		OppsHotelBooking1 h1 = new OppsHotelBooking1();
		h1.setRoomNumber(101);
		h1.setGuestName("laxsman");
		h1.setRoomType("Deluxe");

		System.out.println("RoomNumber:" + h1.getRoomNumber());
		System.out.println("GuestName:" + h1.getGuestName());
		System.out.println("RoomType:" + h1.getRoomType());
	}

}
