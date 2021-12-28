package org.espire.machine.inventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    public Integer productId = 0;
    public Integer quantity = 0;

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
}
