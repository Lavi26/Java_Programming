package org.espire.service;

import java.util.Iterator;
import java.util.Scanner;

import ore.espire.entity.Bucket;
import ore.espire.entity.Inventory;
import ore.espire.entity.Product;

public class BucketService extends Bucket {
	/**
	 * Declaring variables
	 */
	String selectedItem = "";
	Integer quantity = 0, selectedItemPrice = 0, count = 0;
	
	/**
	 * Creating the object of scanner class
	 */
	Scanner sc = new Scanner(System.in);
	
	/**
	 * Creating the objcet of Inventory and Bucket class
	 */
	//InventoryService inventory = new InventoryService();
	Bucket bucket = new Bucket();

	/**
	 * Method to add product in the bucket list if customer choses the option 3
	 */
	public void addProductToBucketFromInventory() {
		System.out.print("Enter the item name : ");
		selectedItem = sc.next();
		Iterator<Integer> itemIterator1 = getInventory().keySet().iterator();
		while (itemIterator1.hasNext()) {
			Integer key = itemIterator1.next();
			Product value = getInventory().get(key);
			if (selectedItem.toUpperCase().equals(value.getItemName())) {
				selectedItemPrice = (int) value.getItemPrice();
				System.out.print("Enter the quantity : ");
				quantity = sc.nextInt();
				count = count + 1;
				//bucket.addItemToBucket(count, new Product(selectedItem.toUpperCase(), selectedItemPrice, quantity));
				bucket.addItemToBucket(count, new Product(selectedItem.toUpperCase(), selectedItemPrice, quantity));
				System.out.println("Entered item price is : " + selectedItemPrice);
			}
		}
	}
	
	
	/**
	 * Method print the bucket list product and print calculated amount that customer has to pay
	 */
	public void printDetailsOfBucketListAndTotal() {
		
	}
}
