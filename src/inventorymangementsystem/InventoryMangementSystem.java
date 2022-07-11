package inventorymangementsystem;

import Database.ConnectionFactory;

public class InventoryMangementSystem {
   
    public static void main(String[] args) { 
        new ConnectionFactory().CreateDatabase();
        new splash().main(null);
    }
}
