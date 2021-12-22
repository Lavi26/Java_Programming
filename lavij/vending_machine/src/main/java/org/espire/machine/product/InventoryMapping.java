package org.espire.machine.product;

import java.util.HashMap;


public class InventoryMapping {

  protected HashMap<Integer, Inventory> inventory = new HashMap<>();

  public Integer length() {
    return inventory.size();
  }

  public HashMap<Integer,Inventory> getInventory() {
    return inventory;
  }

  public void add(Integer productId, Inventory product) {
    this.inventory.put(productId, product);
  }

  public void remove(Integer productId) {
    this.inventory.remove(productId);

  }

  public void get(Integer productId) {
    if (!inventory.containsKey(productId)) {
      return;
    }
    this.inventory.get(productId);

  }
}
