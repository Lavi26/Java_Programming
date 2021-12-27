package org.espire.machine.product;

import lombok.Data;

@Data
public class Inventory {

  public Integer productId = 0;
  public Integer quantity = 0;

  public Inventory(Integer productId, Integer quantity) {
    super();
    this.productId = productId;
    this.quantity = quantity;
  }

  public void add(Integer productId, Integer quantity) {
    this.productId = productId;
    this.quantity += quantity;

  }

  public void update(Integer productId, Integer quantity) {
    this.productId = productId;
    this.quantity = quantity;
  }

  public void deduct(Integer productId, Integer quantity) {
    this.productId = productId;
    this.quantity -= quantity;
  }


  @Override
  public String toString() {
    return "product id [" + productId + "] quantity [" + quantity + "]";
  }

//  public static void main(String[] args) {
//    Inventory inventory = new Inventory(productId, quantity);
//    inventory.add(1, 10);
//    inventory.add(2, 30);
////    inventory.update(1, 35);
////    inventory.deduct(1, 15);
//
//    System.out.println(inventory.toString());
//  }
}
