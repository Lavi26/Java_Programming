package org.espire.machine;

import java.util.List;
import org.espire.machine.bucket.Bucket;
import org.espire.machine.bucket.Coin;
import org.espire.machine.product.Product;

public interface VendingMachine {

  public long selectProductAndGetPrice(Product product);

  public void insertCoin(Coin coin);

  public List<Coin> refund();

  public Bucket collectItemAndChange(int coinValue);

  public void reset();

  Bucket getItemsAndChange(int coinValue);


}
