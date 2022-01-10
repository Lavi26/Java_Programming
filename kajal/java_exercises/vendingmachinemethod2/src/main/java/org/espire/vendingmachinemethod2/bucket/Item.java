package org.espire.vendingmachinemethod2.bucket;


import lombok.Data;

@Data
public class Item {

	private Integer productId;
	private Integer quantity;

	public Item(Integer productId, Integer quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}

	public Item() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Item [productId=" + productId + ", quantity=" + quantity + "]";
	}
}