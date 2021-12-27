package org.espire.machine.product;

import java.util.HashMap;

public class InventoryMapping {

    HashMap<Integer, Inventory> inventory = new HashMap<>();

    private static InventoryMapping instance;

    private InventoryMapping() {
    }

    public static InventoryMapping getInstance() {
        if (instance == null) {
            instance = new InventoryMapping();
        }
        return instance;
    }

    public void add(Integer productId, Inventory inventory) {
        this.inventory.put(productId, inventory);
    }

    public void remove(Integer productId) {
        this.inventory.remove(productId);
    }

    public Inventory get(Integer productId) {
        return this.inventory.get(productId);
    }
}
