package org.espire.machine.product;


import java.util.Arrays;
import lombok.Data;


@Data
public class Inventory {

  private static Integer productId = 0;
  private static Integer quantity = 0;
  
  private static Product product;

  public Inventory(Product product,Integer productId, Integer quantity) {
    super();
    this.product= product;
    this.productId = productId;
    this.quantity = quantity;
  }

  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
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

  public static void main(String[] args) {
    Inventory inventory = new Inventory(product, productId, quantity);
    inventory.add(1, 10);
    inventory.update(1, 35);
    inventory.deduct(1, 15);
    
    Product product = new Product();
   

    System.out.println(inventory.toString());
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
