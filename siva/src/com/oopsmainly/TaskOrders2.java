package com.oopsmainly;

public class TaskOrders2 {

	public static void main(String[] args) {

		TaskOrdersEncapsulation t1 = new TaskOrdersEncapsulation();

		t1.setOrderId(101);
		t1.setItemName("pizza");
		t1.setQuantity(2);
		t1.setOrderStatus("Placed");

		System.out.println(t1.getOrderId());
		System.out.println(t1.getItemName());
		System.out.println(t1.getQuantity());
		System.out.println(t1.getOrderStatus());
		t1.getOrderDetails();
		

	}

}
