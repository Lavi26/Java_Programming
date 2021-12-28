package org.espire.machine;

import org.espire.machine.bucket.Bucket;
import org.espire.machine.product.Inventory;
import org.espire.machine.product.InventoryMapping;
import org.espire.machine.product.Price;
import org.espire.machine.product.Product;

import java.util.*;
import java.util.function.Consumer;

public class VendingMachineMain {

    public static void main(String[] args) {

        List<Product> list = initializeProduct();
        HashMap<Integer, Product> products = new HashMap<>();

        list.forEach(new Consumer<Product>() {
            @Override
            public void accept(Product product) {
                products.put(product.getId(), product);
            }
        });

        System.out.println(products.get(1).toString());

        InventoryMapping.getInstance().add(1, new Inventory(1, 10));
        InventoryMapping.getInstance().add(2, new Inventory(2, 10));
        InventoryMapping.getInstance().add(3, new Inventory(3, 10));


        Bucket bucket = new Bucket();
        bucket.getObject().add(1, new Product());
        bucket.getObject().add(2, new Product());
        bucket.getObject().add(3, new Product());

        System.out.println(bucket.toString());

        bucket.calculate();
        bucket.checkout();


    }


    public static List<Product> initializeProduct() {

        List<Product> list = new ArrayList<>();
        Product product1 = new Product(1, "Coke", "Coke Bottle", new Price(35.5, 20.0));
        Product product2 = new Product(2, "Pepsi", "Pepsi Bottle", new Price(35.5, 20.0));
        Product product3 = new Product(3, "Lays", "Chips Packet", new Price(11.0, 10.0));
        list.add(product1);
        list.add(product2);
        list.add(product3);
        System.out.println(Arrays.toString(list.toArray()));
        return list;

    }

    public static HashMap<Integer, Inventory> initializeInventory() {
        HashMap<Integer, Inventory> inventory = new HashMap<>();
        inventory.put(1, new Inventory(1, 10));
        inventory.put(2, new Inventory(2, 10));
        inventory.put(3, new Inventory(3, 10));
        return inventory;
    }

}

