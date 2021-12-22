package org.espire.service;

import java.io.Console;
import java.security.DrbgParameters.NextBytes;
import java.util.Iterator;
import java.util.Scanner;

import ore.espire.entity.Bucket;
import ore.espire.entity.Inventory;
import ore.espire.entity.Product;

public class InventoryService extends Inventory {

	Product product = new Product();

	/**
	 * method is for displaying the item present in the inventory
	 */
	public void inventoryList() {
		Iterator<Integer> itemIterator = getInventory().keySet().iterator();
		System.out.println("Serial Number \t Product Name \t Product Price \t Quantity");
		while (itemIterator.hasNext()) {
			Integer key = itemIterator.next();
			Product value = getInventory().get(key);
			System.out.println(key + " \t\t " + value.getItemName() + " \t\t " + value.getItemPrice() + " \t\t "
					+ value.getQuantity());
		}
	}

	/**
	 * By default these items are present in inventory. This method is called when
	 * program statrs
	 */
	public void addProductToInventory() {
		addItemToInventory(1, new Product("COCK", 50, 20));
		addItemToInventory(2, new Product("PEPSI", 90, 20));
		addItemToInventory(3, new Product("CHIPS", 20, 20));
		addItemToInventory(4, new Product("5STAR", 10, 20));
	}

	/**
	 * When choice entered 1 then it will add product details to inventory
	 */
	public void addInventoryProductByOption() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the product name : ");
		product.setItemName(sc.next());
		System.out.print("Enter the item price : ");
		product.setItemPrice(sc.nextLong());
		System.out.print("Enter the quantity :");
		product.setQuantity(sc.nextLong());
		addItemToInventory(length() + 1,
				new Product(product.getItemName(), product.getItemPrice(), product.getQuantity()));

	}

	/**
	 * Method to madeChnges in inventory
	 */
	public void inventoryChanges() {
		/**
		 * Option displaying on console
		 */
		Integer choice, productId;
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"1.Add product to inventory\n2.Update inventory product details.\n3.Remove product from inventory\n4.Exit");
		System.out.print("Enter your choice : ");
		choice = scanner.nextInt();
		/**
		 * while loop for displaying the option's on the screen again and again
		 */
		while (choice < 4 && choice > 0) {
			switch (choice) {

			case 1:
				addInventoryProductByOption();
				break;
			/**
			 * Case 2 is for updating the item present in the inventory
			 */
			case 2:
				System.out.print("Enter the productId on which you want to update the details : ");
				productId = scanner.nextInt();

				updateItemToInventory(productId, product);
				break;

			/**
			 * case 3 is for remove product from inventory record of sold item
			 */
			case 3:
				System.out.println("Enter the productId you want to remove : ");
				productId = scanner.nextInt();
				removeItemToInventory(productId);
				break;

			/**
			 * case 4 is used to exit from inventory
			 */
			case 4:
				break;
			default:
				break;

			}
			System.out.println(
					"1.Add product to inventory\n2.Update inventory product details.\n3.Remove product from inventory\n4.Exit");
			System.out.print("Enter your choice : ");
			choice = scanner.nextInt();
		}
	}

	/**
	 * 
	 */
	public void updateInventory() {
		/**
		 * while loop for displaying the option's on the screen again and again
		 */
		Integer choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"1.Add product to inventory\n2.Update inventory product details.\n3.Remove product from inventory\n4.Exit");
		System.out.print("Enter your choice : ");
		choice = scanner.nextInt();
		while (choice <= 4 && choice > 0) {
			switch (choice) {

			case 1:
				break;
			/**
			 * Case 2 is for displaying the item present in the inventory
			 */
			case 2:
				break;

			/**
			 * case 3 is for purchasing the item. it uses the Bucket class for storing the
			 * record of sold item
			 */
			case 3:
				break;
				
			/**
			 * case 4 is used to display the bucket list and the total amount
			 */
			case 4:

				break;
			default:
				break;

			}
			System.out.println("1.Inventory\n2.Inventory item list.\n3.Purchase\n4.Exit");
			System.out.print("Enter your choice:");
			choice = scanner.nextInt();
		}
	}
//	/**
//	 * Declaring variables
//	 */
//	String selectedItem = "";
//	Integer quantity = 0, selectedItemPrice = 0, count = 0;
//	
//	/**
//	 * Creating the object of scanner class
//	 */
//	Scanner sc = new Scanner(System.in);
//	Bucket bucket = new Bucket();
//	
//	
//	/**
//	 * Method to add product in the bucket list if customer choses the option 3
//	 */
//	public void addProductToBucketFromInventory() {
//		System.out.print("Enter the item name : ");
//		selectedItem = sc.next();
//		Iterator<Integer> itemIterator1 = getInventory().keySet().iterator();
//		while (itemIterator1.hasNext()) {
//			Integer key = itemIterator1.next();
//			Product value = getInventory().get(key);
//			if (selectedItem.toUpperCase().equals(value.getItemName())) {
//				selectedItemPrice = (int) value.getItemPrice();
//				System.out.print("Enter the quantity : ");
//				quantity = sc.nextInt();
//				count = count + 1;
//				//bucket.addItemToBucket(count, new Product(selectedItem.toUpperCase(), selectedItemPrice, quantity));
//				bucket.addItemToBucket(count, new Product(selectedItem.toUpperCase(), selectedItemPrice, quantity));
//				System.out.println("Entered item price is : " + selectedItemPrice);
//			}
//		}
//	}

}
