package org.espire.vendingmachinemethod2.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price {

  public Price(double d, double e) {
		// TODO Auto-generated constructor stub
	}
private Double mrp;
  private Double productPrice;

}