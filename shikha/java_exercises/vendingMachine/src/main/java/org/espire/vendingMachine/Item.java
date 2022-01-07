package org.espire.vendingMachine;

public enum Item {
	DRINK("DRINK", 100), COOKIES("COOKIES", 65), BISCUITS("BISCUITS", 50);

	private String name;
	private int price;

	private Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
