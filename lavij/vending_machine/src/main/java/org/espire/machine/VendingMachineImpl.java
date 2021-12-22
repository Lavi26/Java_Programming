package org.espire.machine;


import java.util.Arrays;
import java.util.Optional;
import org.espire.machine.bucket.Bucket;
import org.espire.machine.bucket.Coin;
import org.espire.machine.product.Inventory;
import org.espire.machine.product.Product;


public class VendingMachineImpl implements VendingMachine {

  private Inventory inventory = new Inventory();
  

  private void initialize() {
    inventory.putInventory(20, new Product(1, "COKE", (long) 40.0));
    inventory.putInventory(30, new Product(2, "PEPSI", (long) 30));
    inventory.putInventory(20, new Product(3, "CHIPS",(long) 10));
    inventory.putInventory(40, new Product(4, "CHOCO",(long) 20));
  }



  @Override
  public int selectItemGetPrice(Product product) {
   
    return 0;
  }
  
  public void displayInsertedCoinValue(Coin coins) {
    
  }



  @Override
  public Optional<Bucket> insertCoin(Coin coins) {
    // TODO Auto-generated method stub
    return null;
  }



  @Override
  public Bucket getItemsAndChange(int coinValue) {
    // TODO Auto-generated method stub
    return null;
  }

 

}
