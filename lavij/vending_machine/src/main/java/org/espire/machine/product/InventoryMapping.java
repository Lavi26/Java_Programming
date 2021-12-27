package org.espire.machine.product;

import java.util.HashMap;

public class InventoryMapping {

    HashMap<Integer, Product> inventory = new HashMap<>();

    public HashMap<Integer, Product> getInventory() {

        return inventory;
    }

    public int length() {
        return inventory.size();
    }

    public void add(Integer productId, Product product) {

        this.inventory.put(productId, product);
    }

    public void remove(Integer productId) {

        this.inventory.remove(productId);
    }
}
