package org.espire.vendingmachine;

public class OutOfStockException extends RuntimeException {

	public OutOfStockException(Product product) {
		super(String.format("Out of stock of %s", product));
	}

}