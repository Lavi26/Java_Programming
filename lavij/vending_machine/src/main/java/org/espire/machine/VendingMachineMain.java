package org.espire.machine;

import org.espire.machine.bucket.Bucket;
import org.espire.machine.product.Inventory;
import org.espire.machine.product.InventoryMapping;
import org.espire.machine.product.Price;
import org.espire.machine.product.Product;

import java.util.*;

public class VendingMachineMain {

    InventoryMapping inventoryMap = new InventoryMapping();

    public static void main(String[] args) {

        InventoryMapping inventoryMap = new InventoryMapping();
        Bucket bucket = new Bucket(new HashMap<Integer, Product>());

        List<Product> list = initializeProduct();

        for (Integer i = 0; i < list.size(); i++) {
            inventoryMap.add(i + 1, list.get(i));
        }

        if (inventoryMap.length() > 0) {
            System.out.println("Enter the product name");
        }
        Iterator<Integer> iterator = inventoryMap.getInventory().keySet().iterator();
        Integer key;
        Product value;
        while (iterator.hasNext()) {
            key = iterator.next();
            value = inventoryMap.getInventory().get(key);

            System.out.println(value.toString());

        }


    }
//        public static void removeBucket(){
//            Bucket bucket = new Bucket(new HashMap<Integer, Product>());
//            bucket.remove(1, );
//            }


    public void inventory() {

        //Option displaying on console

        Integer choice, productId;
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "1.Add product to inventory\n2.Update inventory product details.\n3.Remove product from inventory\n4.Exit");
        System.out.print("Enter your choice : ");
        choice = scanner.nextInt();

        //while loop for displaying the option's on the screen again and again

        while (choice < 4 && choice > 0) {
            switch (choice) {

                //add product
                case 1:
                    addProductToInventory();
                    break;


                //Case 2 is for updating the item present in the inventory
                case 2:
                    System.out.print("Enter the productId on which you want to update the details : ");
                    productId = scanner.nextInt();
                    updateInventory(productId);


                    break;


                //case 3 is for remove product from inventory record of sold item

                case 3:
                    System.out.println("Enter the productId you want to remove : ");
                    productId = scanner.nextInt();
                    inventoryMap.remove(productId);

                    break;


                //case 4 is used to exit from inventory

                case 4:
                    break;
                default:
                    break;

            }
            System.out.println(
                    "1.Add product to inventory\n2.Update inventory product details.\n3.Remove product from inventory\n4.Exit");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
        }
    }




    private void addProductToInventory() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product name: ");
        Product product = new Product();
        product.setName(sc.next());
        System.out.println("Enter Product description: ");
        product.setDescription(sc.nextLine());
        System.out.println("Enter Product price: ");
        product.getPrice().setProductPrice(sc.nextDouble());
        System.out.println("Enter Product MRP: ");
        product.getPrice().setMrp(sc.nextDouble());
        System.out.println("Enter Product productId: ");
        product.getInventory().setProductId(sc.nextInt());
        System.out.println("Enter Product quantity: ");
        product.getInventory().setQuantity(sc.nextInt());

        List<Product> list = new ArrayList<>();
        list.add(new Product(inventoryMap.length()+1,product.getName(),product.getDescription(),
                product.getPrice().,product.getPrice().getMrp(),
                product.getInventory().getProductId(),product.getInventory().getQuantity()));

        }
    private void updateInventory(Integer productId) {
    }


    public static List<Product> initializeProduct() {
        List<Product> list = new ArrayList<>();

        //Product product1 = new Product(1, "Coke", "Coke Bottle", new Price(32.5, 30.0), new Inventory(1, 0));
        Product product2 = new Product(2, "Pepsi", "Pepsi Bottle", new Price(35.5, 20.0), new Inventory(2, 10));
        Product product3 = new Product(3, "Lays", "Chips Packet", new Price(11.0, 10.0), new Inventory(3, 20));
        list.add(new Product(1, "Coke", "Coke Bottle", new Price(32.5, 30.0), new Inventory(1, 0)));
        list.add(product2);
        list.add(product3);

//        System.out.println(product1.toString());
//        System.out.println(product2.toString());
//        System.out.println(product3.toString());
        return list;
    }


}

