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

- Database automatically when open first time. user don't have to create database manually

- It also have feature to ask username and password for SQL server

# Minimum Requirements:
- JDK or JRE version 16
- <a href="https://www.mysql.com/downloads/">MySQL</a>

# How to download and run the software
          

1. Download and unzip the ZIP folder: InventoryManagement.zip
2. Then extract the ZIP file
3. Run the JAR file (InventoryMangementSystem) in InventoryMangementSystem\dist
4. Default credentials for the connection to MySQL database is:
- Username: root
- Password: root

Incase your database uses a different username and password to connect no need to worry.
It automatically ask for username and password for database


# Technologies Used
The following are the technologies that have been used in the development of this project. All of them are free to use.

- <a href="https://netbeans.apache.org/download/index.html">Apache NetBeans IDE (for the GUI designer)</a>
- <a href="https://www.mysql.com/downloads/">MySQL Server and Workbench</a>
- JDK 17

# Application Preview

## SQL Server Property

This page is used to enter the username and password for mysql server

<img src="https://github.com/rksam24/InventoryManagementSystem/blob/master/image/sql.PNG" >

## Login Page

The login page takes in the credentials entered by the user and verifies with the database.

<img src="https://github.com/rksam24/InventoryManagementSystem/blob/master/image/login.PNG">

## Home Page
The landing page of the application after a successful login.

<img src="https://github.com/rksam24/InventoryManagementSystem/blob/master/image/Home.PNG" >

## Products

The products section allows the user to add, edit and delete products from the store's inventory.

<img src="https://github.com/rksam24/InventoryManagementSystem/blob/master/image/product.PNG">

## Customers

Allows user to add new customers or update/delete existing customers in the database. It also how many order a customer make and cost of that order

<img src="https://github.com/rksam24/InventoryManagementSystem/blob/master/image/customer.PNG" >

# Order
This section is where users can sell a product and manage all the sales transactions. The user only needs to selectr the customer and product code and order id the software will handle the rest, showing all the necessary details like available stock and selling price of the product.

<img src="https://github.com/rksam24/InventoryManagementSystem/blob/master/image/order.PNG" >

# Users

This section is used view, add and delete any users.

<img src="https://github.com/rksam24/InventoryManagementSystem/blob/master/image/user.PNG">

## Category

This section used to add the category/type of product

<img src="https://github.com/rksam24/InventoryManagementSystem/blob/master/image/category.PNG">
