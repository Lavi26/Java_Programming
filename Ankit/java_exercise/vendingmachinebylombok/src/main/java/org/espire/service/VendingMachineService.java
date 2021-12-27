package org.espire.service;

import java.util.Scanner;

public class VendingMachineService{
	
	
	public void vendingMachineService() {

		/**
		 * Creating the object of Bucket and Inventory class
		 */
		InventoryService inventoryObj = new InventoryService();
		BucketService bucketService=new BucketService();
		
		/**
		 * Adding some items to inventory
		 */
		inventoryObj.addProductToInventory();

		/**
		 * Option displaying on console
		 */
		System.out.println("1.Inventory\n2.Inventory item list.\n3.Purchase Product\n4.Exit");
		System.out.print("Enter your choice:");

		/**
		 * Creating objcet of scanner class
		 */
		Scanner sc = new Scanner(System.in);
		/**
		 * Customer can enter here there choice according to the options displaying on
		 * console
		 */
		Integer choice = sc.nextInt();

		/**
		 * while loop for displaying the option's on the screen again and again
		 */
		while (choice <= 4 && choice > 0) {
			switch (choice) {

			/**
			 * Case 1 is for add product details to inventory
			 */
			case 1:
				inventoryObj.inventoryChanges();
				break;
			/**
			 * Case 2 is for displaying the item present in the inventory
			 */
			case 2:
				inventoryObj.inventoryList();
				break;

			/**
			 * case 3 is for purchasing the item. it uses the Bucket class for storing the
			 * record of sold item
			 */
			case 3:	
				bucketService.bucketChanges(inventoryObj);
				break;
				
			/**
			 * case 4 is used to display the bucket list and the total amount
			 */
			case 4:
//				if (bucket.length() > 0) {
//					Iterator<Integer> itemBucket = bucket.getBucket().keySet().iterator();
//					System.out.println("Serial Number \t Product Name \t Product Price \t Quantity \t Sum");
//
//					/**
//					 * This loop print list of item present in the bucket for cureent session
//					 */
//					while (itemBucket.hasNext()) {
//						Integer key = itemBucket.next();
//						Product value = bucket.getBucket().get(key);
//						caculate = (int) (value.getItemPrice() * value.getQuantity());
//						total = total + caculate;
//						System.out.println(key + " \t\t " + value.getItemName() + " \t\t " + value.getItemPrice()
//								+ " \t\t " + value.getQuantity() + " \t\t " + caculate);
//						if ((value.getItemName().equals("CHIPS") && value.getQuantity() == 5)
//								|| (value.getItemName().equals("COCK") && value.getQuantity() == 5)) {
//							discountCount++;
//						}
//					}
//					/**
//					 * It checks the chips and pepsi quantity is 5 or not If quantity is 5 the 20%
//					 * discount will be calculated
//					 */
//					if (discountCount == 2) {
//						System.out.println("Congrutulations you will get 20 % discount.");
//						System.out.print("Total amount : " + (total - ((float) total * 0.2)));
//						System.out.print("\nInserted coin value : ");
//						insertedCoin = sc.nextFloat();
//						if (insertedCoin < total) {
//							System.out.println("You have inserted the wrong amount in the machine please try again");
//							System.out.println("Thank You");
//							discountCount = 0;
//							total = 0;
//							caculate = 0;
//							break;
//						}
//						returnedAmount = (float) (insertedCoin - (total - ((float) total * 0.2)));
//					} else {
//						System.out.print("Total amount : " + total);
//						System.out.print("\nInserted coin value : ");
//						insertedCoin = sc.nextFloat();
//						if (insertedCoin < total) {
//							System.out.println("You have inserted the wrong amount in the machine please try again");
//							System.out.println("Thank You");
//							discountCount = 0;
//							total = 0;
//							caculate = 0;
//							break;
//						}
//						returnedAmount = insertedCoin - total;
//					}
//
//					System.out.print("Returned coin after deduction : " + returnedAmount);
//					System.out.println("Thank You");
//					total = 0;
//
//				} else {
//					System.out.println("Thank You");
//				}
				System.exit(0);
				break;
			default:
				break;

			}
			System.out.println("1.Inventory\n2.Inventory item list.\n3.Purchase Product\n4.Exit");
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
		}
	}	
		
}
