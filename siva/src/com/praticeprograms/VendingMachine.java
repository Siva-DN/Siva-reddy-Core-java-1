package com.praticeprograms;

public class VendingMachine extends Item {

	public VendingMachine(String item_Name, int price, String code) {
		super(item_Name, price, code);
	}

	int coins = 0;

	void insertCoin(int coin) {
		this.coins = coins;

	}

	void buyItem() {
		if(isFree()) {
			
		}else if{
			
		}
		
	}

}
