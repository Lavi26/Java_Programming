package org.espire.vendingmachine;

public class InsufficientCreditException extends RuntimeException {

	public InsufficientCreditException(int credit, Product product) {
		super(String.format("Credit of %d is insufficient to purchase %s. Insert more coins!", credit, product));
	}

}