package org.espire.vendingmachine;

public class DispensingFailureException extends RuntimeException {
	public DispensingFailureException() {
		super();
	}

	public DispensingFailureException(String message) {
		super(message);
	}
}