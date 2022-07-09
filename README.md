# InventoryMangementSystem

This is an Inventory Management System built in the form of a GUI desktop application developed in Java using MySQL as its database. The GUI was designed using Swing and the database connectivity was managed using JDBC.

This application maintain and manage-

- Products
- Customers
- Users
- Transactions

# Features of the Application

- Users can manage inventory and stock of all the products available in their store.

- Users can manage all sales and purchase transactions made by the store.

- User can manage list of customer who purchase product from the store

- Any transaction made automatically handles the stock availability in the inventory.

- User only need to enter order id to see view order 

- User only need to enter product id/customer id to delete from database

- Login feature also added

- User can see how many order a customer made and total cost those order

# How to download and run the software

Minimum Requirements:
- JDK or JRE version 16
- MySQL            

1. Download and unzip the ZIP folder: InventoryManagement.zip
2. Then extract the ZIP file
3. Run the JAR file (InventoryMangementSystem) in InventoryMangementSystem\dist
4. Default credentials for the connection to MySQL database is:
- Username: root
- Password: root
Incase your database uses a different username and password to connect
change the userName and password in ConnectionFactory.java file

# Technologies Used
The following are the technologies that have been used in the development of this project. All of them are free to use.

- Apache NetBeans IDE (for the GUI designer)
- MySQL Server and Workbench
- JDK 17
