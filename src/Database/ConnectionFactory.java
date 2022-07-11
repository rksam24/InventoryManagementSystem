/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import com.ibatis.common.jdbc.ScriptRunner;
import java.util.Properties;

public class ConnectionFactory {

    static String Driver = "com.mysql.cj.jdbc.Driver";
    static String url;
    static String Database = "InventoryDB";
    static String host;
    static String port;
    static String username;
    static String password;

    
    Connection conn = null;
    
    private boolean checkDatabase(){
        updateConfig();
        try {
            Class.forName(Driver);

            Connection Con = DriverManager.getConnection(url, username, password);
            ResultSet Rs = Con.getMetaData().getCatalogs();
            while (Rs.next()) {
                String catalogs = Rs.getString(1);
                if (Database.equalsIgnoreCase(catalogs)) {
                    Con.close();
                    return true;
                }
            }
        } 
        catch (SQLException e) {
            visible();
            return checkDatabase();
        }
         catch (ClassNotFoundException e) {
             e.printStackTrace();
        }
        return false;
    }
    
     public void CreateDatabase(){
        updateConfig();
        Connection Con;
        //check if database exists
        if(checkDatabase())
            return;
        
        //if database not exist
        try{
            Class.forName(Driver);

            Con = DriverManager.getConnection(url, username, password);
            ResultSet Rs = Con.getMetaData().getCatalogs();
            while (Rs.next()) {
                String catalogs = Rs.getString(1);
                if (Database.equalsIgnoreCase(catalogs)) {
                    Con.close();
                    return;
                }
            }
            
            //if database not exists
            ScriptRunner sr = new ScriptRunner(Con,false,true);
            FileReader fr = new FileReader(new File("lib/InventoryDB.sql"));
            Reader reader = new BufferedReader(fr);
            sr.runScript(reader);
            Con.close();
        }
        catch(SQLException | IOException | ClassNotFoundException e){
            e.printStackTrace();
                                
        }
    }
     
     private void updateConfig() {
        url = "jdbc:mysql://";
        Properties prop;

        prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("lib/DatabaseConfig.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        host = prop.getProperty("host","localhost") + ":";
        port = prop.getProperty("port","3306") + "/";
        username = prop.getProperty("username","root");
        password = prop.getProperty("password","root");

        url = url + host + port;
    }

    public Connection getConn() {
        updateConfig();
        try {
            Class.forName(Driver);

            conn = DriverManager.getConnection(url+Database, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    private void visible(){
            SQLServer sql = new SQLServer();
            sql.setVisible(true);
            while(sql.isDisplayable()){}
    }
}
