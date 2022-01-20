package org.espire.vendingmachine;

/*
 * Factory class to create instance of Vending Machine, this can be extended to create instance of
 * different types of vending machines.
 */
public class VendingMachineFactory {
	public static void main(String[] args) {
		VendingMachineImpl vendingMachineImpl = new VendingMachineImpl();
		vendingMachineImpl.vendingMachineImpl();

	}
}