package org.espire.machine.product;


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
    private Inventory inventory;


//    Double productPrice = price.getProductPrice();
//    Double mrp = price.getMrp();
//
//    Integer productId = inventory.getProductId();
//    Integer quantity = inventory.getQuantity();
//
//
//    public Product(Integer id, String name, String description, Double productPrice, Double mrp, Integer productId, Integer quantity) {
//
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this. productPrice = productPrice;
//        this.mrp = mrp;
//        this.productId = productId;
//        this.quantity = quantity;
//
//    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                '}';
    }
}
