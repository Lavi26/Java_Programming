package org.espire.vendingmachinemethod2.inventory;


import java.util.HashMap;

import org.espire.vendingmachinemethod2.product.Product;
import org.espire.vendingmachinemethod2.product.ProductManager;

public class InventoryManager {

    private HashMap<Integer, Inventory> map = new HashMap<>();
    private String s = "";
    private static InventoryManager instance;

    private InventoryManager() {
    }

    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void add(Integer productId, Inventory inventory) {
        this.map.put(productId, inventory);
    }

    public void remove(Integer productId) {
        this.map.remove(productId);
    }

    public Inventory get(Integer productId) {
        return this.map.get(productId);
    }

    @Override
    public String toString() {
        map.forEach((integer, inventory) -> {
		    Product product = ProductManager.getInstance().get(integer);
		    s += "Product {" + product.getName() + "} inventory {" + inventory.getQuantity() + "} ";
		});
        return "InventoryManager{" +
                "" + s +
                '}';
    }
}