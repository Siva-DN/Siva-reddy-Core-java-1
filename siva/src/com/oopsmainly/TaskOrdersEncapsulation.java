package com.oopsmainly;

public class TaskOrdersEncapsulation {

	private int orderId;
	private String itemName;
	private int quantity;
	private String orderStatus;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName+"-biriyani"+"150";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void getOrderDetails() {
		System.out.println(orderId);
		System.out.println(itemName);
		System.out.println(quantity);
		System.out.println(orderStatus);

		if (orderStatus.equalsIgnoreCase("placed")) {
			System.out.println("fully placed");
		} else {
			System.out.println("cancel order");
		}

	}

}
