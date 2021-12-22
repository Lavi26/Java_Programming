package org.espire.machine;


import java.util.List;
import org.espire.machine.bucket.Bucket;
import org.espire.machine.bucket.Coin;
import org.espire.machine.product.InventoryMapping;
import org.espire.machine.product.Product;


public class VendingMachineImpl implements VendingMachine {

  private InventoryMapping inventory = new InventoryMapping();
 



  @Override
  public Bucket getItemsAndChange(int coinValue) {
    // TODO Auto-generated method stub
    return null;
  }



  @Override
  public long selectProductAndGetPrice(Product product) {
    // TODO Auto-generated method stub
    return 0;
  }



  @Override
  public void insertCoin(Coin coin) {
    // TODO Auto-generated method stub
    
  }



  @Override
  public List<Coin> refund() {
    // TODO Auto-generated method stub
    return null;
  }



  @Override
  public Bucket collectItemAndChange(int coinValue) {
    // TODO Auto-generated method stub
    return null;
  }



  @Override
  public void reset() {
    // TODO Auto-generated method stub
    
  }

 

}
