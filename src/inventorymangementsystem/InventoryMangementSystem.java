package inventorymangementsystem;

import Database.ConnectionFactory;
import java.sql.Connection;

public class InventoryMangementSystem {
   
    public static void main(String[] args) {       
            try{
                Connection conn = new ConnectionFactory().getConn();
                conn.close();
            }
            catch(Exception e){
                new ConnectionFactory().CreateDatabase();
            }
            new splash().main(null);
    }
}
