package org.espire.machine;

import org.espire.machine.bucket.Bucket;
import org.espire.machine.bucket.Item;
import org.espire.machine.inventory.Inventory;
import org.espire.machine.inventory.InventoryManager;
import org.espire.machine.product.Price;
import org.espire.machine.product.Product;
import org.espire.machine.product.ProductManager;

public class VendingMachineMain {

    public static void main(String[] args) {

        /**
         * initialized products
         */
        initializeProduct();
        /**
         * initialized inventory
         */
        initializeInventory();

        /**
         * checkout operation
         */
        Item item = new Item();
        item.setProductId(ProductManager.getInstance().get(1).getId());
        item.setQuantity(2);
        Bucket.getInstance().add(ProductManager.getInstance().get(1).getId(), item);
        Double total = Bucket.getInstance().calculate();
        System.out.println("Total proce {" + total + "}");

        Bucket.getInstance().checkout();
        System.out.println("Updated inventory {" + InventoryManager.getInstance().toString() + "}");
    }

    public static void initializeProduct() {
        Product product1 = new Product(1, "Coke", "Coke Bottle", new Price(35.5, 20.0));
        Product product2 = new Product(2, "Pepsi", "Pepsi Bottle", new Price(35.5, 20.0));
        Product product3 = new Product(3, "Lays", "Chips Packet", new Price(11.0, 10.0));

        ProductManager.getInstance().add(product1.getId(), product1);
        ProductManager.getInstance().add(product2.getId(), product2);
        ProductManager.getInstance().add(product3.getId(), product3);
    }

    public static void initializeInventory() {
        Inventory inventory1 = new Inventory(1, 10);
        InventoryManager.getInstance().add(inventory1.getProductId(), inventory1);
        Inventory inventory2 = new Inventory(2, 10);
        InventoryManager.getInstance().add(inventory2.getProductId(), inventory2);
        Inventory inventory3 = new Inventory(3, 10);
        InventoryManager.getInstance().add(inventory3.getProductId(), inventory3);

    }
}

