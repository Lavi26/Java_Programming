package org.espire.vendingmachinemethod2.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private Integer id;
	private String name;
	private String description;
	private Price price;

	public Product(int id, String name, String description, Price price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", price="
				+ price + '}';
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Price getPrice() {
		return price;
	}


	public void setPrice(Price price) {
		this.price = price;
	}

}