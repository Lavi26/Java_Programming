package ore.espire.entity;

import lombok.Getter;
import lombok.Setter;

public class Product {

	/**
	 * Getter and Setter annotation is for creating the getter and setter method
	 */
	@Getter 
	@Setter
	private String itemName;
	
	@Getter 
	@Setter
	private long itemPrice;
	
	@Getter 
	@Setter
	private long quantity;

	//Parimeterized constructor
	public Product(String itemName, long itemPrice, long quantity) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;

	}

}
