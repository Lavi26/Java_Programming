package org.espire.vendingmachinemethod2;

import org.espire.vendingmachinemethod2.bucket.Bucket;
import org.espire.vendingmachinemethod2.bucket.Item;
import org.espire.vendingmachinemethod2.inventory.Inventory;
import org.espire.vendingmachinemethod2.inventory.InventoryManager;
import org.espire.vendingmachinemethod2.product.Price;
import org.espire.vendingmachinemethod2.product.Product;
import org.espire.vendingmachinemethod2.product.ProductManager;

public class VendingMachineMain {
	public static void main(String[] args) {

		initializeProduct();

		initializeInventory();

		Item item = new Item();
		item.setProductId(ProductManager.getInstance().get(1).getId());
		item.setQuantity(2);
		Bucket.getInstance().add(ProductManager.getInstance().get(1).getId(), item);
		Double total = Bucket.getInstance().calculate();
		System.out.println("Total price {" + total + "}");

		Bucket.getInstance().checkout();
		System.out.println("Updated inventory {" + InventoryManager.getInstance().toString() + "}");
	}

//initialize product
	public static void initializeProduct() {
		Product product1 = new Product(1, "Chips", "Chips packet", new Price(35.5, 20.0));
		Product product2 = new Product(2, "Coffee", "Coffee powder", new Price(35.5, 20.0));
		Product product3 = new Product(3, "Pepsi", "Pepsi bottle", new Price(11.0, 10.0));

		ProductManager.getInstance().add(product1.getId(), product1);
		ProductManager.getInstance().add(product2.getId(), product2);
		ProductManager.getInstance().add(product3.getId(), product3);
	}

//initialize inventory
	public static void initializeInventory() {
		Inventory inventory1 = new Inventory(1, 10);
		InventoryManager.getInstance().add(inventory1.getProductId(), inventory1);
		Inventory inventory2 = new Inventory(2, 10);
		InventoryManager.getInstance().add(inventory2.getProductId(), inventory2);
		Inventory inventory3 = new Inventory(3, 10);
		InventoryManager.getInstance().add(inventory3.getProductId(), inventory3);

	}
}
