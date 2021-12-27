package org.espire.machine.product;

import lombok.Data;

public class Price {
  
  private Double mrp;
  private Double price;

  public Double getMrp() {
    return mrp;
  }
  public void setMrp(Double mrp) {
    this.mrp = mrp;
  }
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }
 

}
