package org.espire.machine;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.espire.machine.bucket.Bucket;
import org.espire.machine.bucket.Coin;
import org.espire.machine.product.Product;

public class VendingMachineMain {

  public static void main(String[] args) {
    
    VendingMachineImpl vendingMachine = new VendingMachineImpl();
    
    
    Product product =new Product(1, "COKE", (long) 40);
    
    int itemPrice = vendingMachine.selectItemGetPrice(product);
    
    System.out.println("Selected Item:"+ product.getName());
    
    System.out.println("Selected Item Price:"+ itemPrice);
    
    if(itemPrice != 0){
      
    Coin insertedCoin []=new Coin[1];
    
    insertedCoin[0]=Coin.HUNDREDRUPEE;
    insertedCoin[1]=Coin.TENRUPEE;
    insertedCoin[2]=Coin.TWENTYRUPEE;
    insertedCoin[3]=Coin.FIFTYRUPEE;
    insertedCoin[4]=Coin.Coine;
    
    }
  }

  public static void displayInsertedCoinValue(List<Coin> list) {

  }
}

