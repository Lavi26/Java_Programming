package org.espire.machine.bucket;


import lombok.Data;
import org.espire.machine.product.InventoryMapping;
import org.espire.machine.product.Product;

import java.util.HashMap;

@Data
public class Bucket {

    private HashMap<Integer, Product> bucket = new HashMap<>();

    private static Bucket object;
    public Bucket() {
    }

    public static Bucket getObject() {
        if(object==null){
          object= new Bucket();
        }
        return object;
    }
//    public HashMap<Integer, Product> getBucket() {
//        return bucket;
//    }

    public void add(Integer productId, Product product) {
        this.bucket.put(productId, product);
    }

    public void remove(Integer productId, Product product) {
        this.bucket.remove(productId, product);
    }

    public Double calculate() {
        Double total = 0.00;
        return total;
    }

    public void checkout() {
        System.out.println(InventoryMapping.getInstance().get(1).quantity);
    }
}
