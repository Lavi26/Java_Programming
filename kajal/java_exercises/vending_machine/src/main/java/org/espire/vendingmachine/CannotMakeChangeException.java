package org.espire.vendingmachine;


	public class CannotMakeChangeException extends RuntimeException {

		public CannotMakeChangeException(int credit) {
			super(String.format("Insufficient change to return %d", credit));
		}

	}
