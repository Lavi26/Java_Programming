package org.espire.vendingmachinemethod2.inventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    public Integer productId = 0;
    public Integer quantity = 0;

    public Inventory(int productId, int quantity) {
		// TODO Auto-generated constructor stub
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
    }

	public Integer getProductId() {
		// TODO Auto-generated method stub
		return productId;
	}

	public Integer getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

	
}