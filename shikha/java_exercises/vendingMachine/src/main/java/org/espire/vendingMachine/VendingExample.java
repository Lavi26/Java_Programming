package org.espire.vendingMachine;

public class VendingExample {
	public int drop(String coins, int total) {

		if (coins.equals("NICKLE")) {
			total = total + Coin.NICKLE.getDenom();
		} else if (coins.equals("DIME")) {
			total = total + Coin.DIME.getDenom();
		} else if (coins.equals("QUARTER")) {
			total = total + Coin.QUARTER.getDenom();
		} else if (coins.equals("DOLLAR")) {
			total = total + Coin.DOLLAR.getDenom();
		} else {
			System.out.println("Wrong Input Coin");
		}

		return total;
	}

	// select items
	public int choose(String sample, int total) {
		if (sample.equals("DRINK")) {
			System.out.println("You have selected " + Item.DRINK.getName());
			if (total >= Item.DRINK.getPrice()) {
				total = total - Item.DRINK.getPrice();
				System.out.println("Thank you for your purchase!! ");
				System.out.println("Your balance is " + total);
			} else {
				System.out.println("Insert more coins ");
				return 2;
			}

		} else if (sample.equals("COOKIES")) {
			System.out.println("You have selected " + Item.COOKIES.getName());
			if (total >= Item.COOKIES.getPrice()) {
				total = total - Item.COOKIES.getPrice();
				System.out.println("Thank you for your purchase!! ");
				System.out.println("Your balance is " + total);
			} else {
				System.out.println("Insert more coins ");
				return 2;
			}
		} else if (sample.equals("BISCUITS")) {
			System.out.println("You have selected " + Item.BISCUITS.getName());
			if (total >= Item.BISCUITS.getPrice()) {
				total = total - Item.BISCUITS.getPrice();
				System.out.println("Thank you for your purchase!! ");
				System.out.println("Your balance is " + total);
			} else {
				System.out.println("Insert more coins ");
				return 2;
			}
		} else if (sample.equals("RETURN")) {
			System.out.println("Your balance is " + total + " and is returned.");
			return 1;
		} else if (sample.equals("CANCEL")) {
			return -1;
		} else {
			System.out.println("Wrong choice: Your balance is " + total);
			return 1;
		}

		return total;
	}
}
