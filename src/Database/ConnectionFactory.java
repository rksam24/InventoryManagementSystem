/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.ibatis.common.jdbc.ScriptRunner;

/**
 *
 * @author asjad
 */

//Class to retrieve connection for database and login verfication.
public class ConnectionFactory {

    static String Driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/";
    static String Database = "InventoryDB";
    static String username ="root";
    static String password="rohit";

    
    Connection conn = null;

    public Connection getConn() {
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection(url+Database, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    public void CreateDatabase(){
        try{
            Connection Con = DriverManager.getConnection(url, username, password);
            ScriptRunner sr = new ScriptRunner(Con,false,true);
            FileReader fr = new FileReader(new File("src/Database/InventoryDB.sql"));
            Reader reader = new BufferedReader(fr);
            sr.runScript(reader);
            Con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }
}
