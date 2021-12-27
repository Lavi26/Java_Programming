package org.espire.machine.bucket;


import lombok.Data;
import org.espire.machine.product.Product;

import java.util.HashMap;

@Data


public class Bucket {

  private HashMap<Integer, Product> bucket = new HashMap<>();

  public Bucket(HashMap<Integer, Product> bucket) {

    this.bucket = bucket;
  }

  public HashMap<Integer, Product> getBucket() {

    return bucket;
  }

  public void add(Integer productId, Product product) {

    this.bucket.put(productId, product);
  }

  public void remove(Integer productId, Product product) {

    this.bucket.remove(productId, product);
  }

  public void removeAll(Integer productId, Product product) {

    this.bucket.clear();
  }

  public Double calculate() {
    Double total = 0.00;

    return total;
  }



}
