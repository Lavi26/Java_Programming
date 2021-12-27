package org.espire.machine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.espire.machine.bucket.Bucket;
import org.espire.machine.bucket.Coin;
import org.espire.machine.product.Inventory;
import org.espire.machine.product.InventoryMapping;
import org.espire.machine.product.Product;

public class VendingMachineMain {

  Product product = new Product();
  Bucket bucket = new Bucket(new HashMap<Integer,Product>());
  InventoryMapping inventory = new InventoryMapping();



}

