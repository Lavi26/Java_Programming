package org.espire.vendingmachinemethod2.bucket;

import lombok.Data;
import java.util.HashMap;
import java.util.function.BiConsumer;

import org.espire.vendingmachinemethod2.inventory.Inventory;
import org.espire.vendingmachinemethod2.inventory.InventoryManager;
import org.espire.vendingmachinemethod2.product.Product;
import org.espire.vendingmachinemethod2.product.ProductManager;

@Data
public class Bucket {

    private HashMap<Integer, Item> map = new HashMap<>();
    private Double total = 0.00;

    private static Bucket instance;

    private Bucket() {
    }

    public static Bucket getInstance() {
        if (instance == null) {
            instance = new Bucket();
        }
        return instance;
    }

    public void add(Integer productId, Item item) {
        map.put(productId, item);
    }

    public Boolean remove(Integer productId, Item item) {
        Boolean status = false;
        if (!map.isEmpty()) {
            map.remove(productId);
            status = true;
        }
        return status;
    }

    public Double calculate() {
        map.forEach(new BiConsumer<Integer, Item>() {
            @Override
            public void accept(Integer productId, Item item) {
                Product product = ProductManager.getInstance().get(productId);
                if (product != null) {
                    total += item.getQuantity();
                }
            }
        });
        return total;
    }

    public void checkout() {
        map.forEach(new BiConsumer<Integer, Item>() {
            @Override
            public void accept(Integer productId, Item item) {
                Product product = ProductManager.getInstance().get(productId);
                if (product != null) {
                    Inventory inventory = InventoryManager.getInstance().get(productId);
                    inventory.deduct(productId, item.getQuantity());
                    InventoryManager.getInstance().add(productId, inventory);
                }
            }
        });
    }
}