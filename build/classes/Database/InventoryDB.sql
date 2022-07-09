/* create database */
CREATE DATABASE IF NOT EXISTS InventoryDB;

USE InventoryDB;

/* create product table */
CREATE TABLE IF NOT EXISTS ProductTable (
ProdId INTEGER NOT NULL PRIMARY KEY ,
ProdName  VARCHAR(30) NOT NULL,
ProdQty INTEGER NOT NULL,
ProdDesc VARCHAR(30) NOT NULL,
ProdCat VARCHAR(30) NOT NULL,
ProPrice DOUBLE NOT NULL 
);

/* create Category table */
CREATE TABLE IF NOT EXISTS CategoryTBL (
CatId INTEGER NOT NULL PRIMARY KEY ,
CatName  VARCHAR(30) NOT NULL 
);

/* create customer table */
CREATE TABLE IF NOT EXISTS CustomerTBL (
CustId INTEGER NOT NULL PRIMARY KEY ,
CustName  VARCHAR(30) NOT NULL,
CustPh VARCHAR(10) NOT NULL,
CustEmail VARCHAR(50) NOT NULL 
);

/* create user table */
CREATE TABLE IF NOT EXISTS UserTBL (
UName VarCHAR(20) NOT NULL PRIMARY KEY ,
UPassword  VARCHAR(30) NOT NULL,
UPhone VARCHAR(10) NOT NULL,
UEmail VARCHAR(50) NOT NULL 
);


/* create order table */
CREATE TABLE IF NOT EXISTS OrderTBL (
OrderId INTEGER NOT NULL PRIMARY KEY ,
CustId INTEGER NOT NULL,
CustName  VARCHAR(30) NOT NULL,
Date VARCHAR(20) NOT NULL,
Amount Double NOT NULL,
Bill VARCHAR(6000) NOT NULL, 
FOREIGN  KEY( CustId ) REFERENCES CustomerTBL(CustID) 
 );
 
 
/* insert data in user table */
INSERT INTO UserTBL(UName, UPassword, UPhone, UEmail) 
VALUES
('root', 'root', 'NAN', 'NAN'),
('admin', 'admin', 'NAN', 'NAN');
 
/* insert data in category table */
INSERT INTO CategoryTBL(CatId, CatName) 
VALUES
(1, 'Laptop'),
(2, 'Mobile');
