package vending_machine;

import java.util.Scanner;

import bucket.Bucket;
import bucket.Item;
import inventory.Inventory;
import inventory.InventoryManager;
import product.Price;
import product.Product;
import product.ProductManager;

public class VendingMachineMain {

    public static void main(String[] args) {
        initializeProduct();
        initializeInventory();

        
        /**
         * Calculating Price
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Coke");
        System.out.println("2. Sprite");
        System.out.println("3. Pepsi");
        System.out.println("4. Red Bull");
        
        System.out.println("Select Item ");
        Integer it = sc.nextInt();
        
       System.out.println("Enter Quantity");
        Integer qn = sc.nextInt();
        
        Item item = new Item();
        item.setProductId(ProductManager.getInstance().get(it).getId());
        item.setQuantity(qn);
        
        Bucket.getInstance().add(ProductManager.getInstance().get(it).getId(), item);
        Double total = Bucket.getInstance().calculate();
        System.out.println("Total price {" + total + "}");
        
        /**
         * checkout operation
         */

        Bucket.getInstance().checkout();
        System.out.println("Updated inventory {" + InventoryManager.getInstance().toString() +  "}");
        
        
        
        
        // * remove Operation
        
        System.out.print("Do you want to remove an item y/n");
        String ch = sc.nextLine();
        
        if(ch == "y")
        {
        	Bucket.getInstance().remove(qn, item);
        }
        	
        
    }
    
    /**
     * initialized products
     */
    public static void initializeProduct() {
        Product product1 = new Product(1, "Coke", "Coke Bottle", new Price(30.0, 25.0));
        Product product2 = new Product(2, "Sprite", "Sprite Bottle", new Price(30.0, 25.0));
        Product product3 = new Product(3, "Pepsi", "Pepsi Bottle", new Price(30.0, 25.0));
        Product product4 = new Product(4, "Red Bull", "Red Bull Can", new Price(115.0, 105.0));

        ProductManager.getInstance().add(product1.getId(), product1);
        ProductManager.getInstance().add(product2.getId(), product2);
        ProductManager.getInstance().add(product3.getId(), product3);
        ProductManager.getInstance().add(product4.getId(), product4);
    }
    
    /**
     * initialized inventory
     */

    public static void initializeInventory() {
        Inventory inventory1 = new Inventory(1, 10);
        InventoryManager.getInstance().add(inventory1.getProductId(), inventory1);
        Inventory inventory2 = new Inventory(2, 10);
        InventoryManager.getInstance().add(inventory2.getProductId(), inventory2);
        Inventory inventory3 = new Inventory(3, 10);
        InventoryManager.getInstance().add(inventory3.getProductId(), inventory3);
        Inventory inventory4 = new Inventory(4, 10);
        InventoryManager.getInstance().add(inventory4.getProductId(), inventory4);
      
        


    }
}