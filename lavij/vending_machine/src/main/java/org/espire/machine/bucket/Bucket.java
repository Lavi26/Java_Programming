package org.espire.machine.bucket;


import java.util.HashMap;
import java.util.List;
import org.espire.machine.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Bucket {

  private HashMap<Integer, Product> inventory = new HashMap<>();
  
  public Bucket() {
    
  }
  
  public void add(Integer productId, Product product) {
    
  }
  
  public void remove(Integer productId, Product product) {
    
  }
  
  public Double calculate() {
    Double total = 0.00;
    
    return total;
  }
}
