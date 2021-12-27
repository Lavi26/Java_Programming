package org.espire.machine.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  private Integer id;
  private String name;
  private String description;
  private Price price;

  private Inventory inventory;
  /*
   * public Product(final Integer id, String name, String description, Price price, Inventory
   * inventory) { super(); this.id = id; this.name = name; this.description = description;
   * this.price = price; this.inventory = inventory; }
   */
  


//  public String getDescription() {
//    return description;
//  }
//
//  public void setDescription(String description) {
//    this.description = description;
//  }
//
////  public Inventory getInventory() {
////    return inventory;
////  }
////
////  public void setInventory(Inventory inventory) {
////    this.inventory = inventory;
////  }
//
//  public Integer getId() {
//    return id;
//  }
//
//
//  public void setId(Integer id) {
//    this.id = id;
//  }
//
//
//  public String getName() {
//    return name;
//  }
//
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//
//  public Price getPrice() {
//    return price;
//  }
//
//
//  public void setPrice(Price price) {
//    this.price = price;
//  }
}
