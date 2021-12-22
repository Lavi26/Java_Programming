package org.espire.machine.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

  private Integer id;
  private String name;
  private String description;
  private Price price;

  private Inventory inventory;
  
  public Product(final Integer id, String name, String description, Price price) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
  }

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Price getPrice() {
    return price;
  }


  public void setPrice(Price price) {
    this.price = price;
  }
}
