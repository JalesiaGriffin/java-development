-- Question 1
-- products

-- Question 2
SELECT ProductID, ProductName, UnitPrice
FROM northwind.products;

-- Question 3
SELECT ProductID, ProductName, UnitPrice
FROM northwind.products
ORDER BY UnitPrice;

-- Question 4
SELECT ProductName, UnitPrice
FROM northwind.products
WHERE UnitPrice <= 7.50;

-- Question 5
SELECT * FROM northwind.products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;

-- Question 6
SELECT ProductName, UnitsInStock, UnitPrice
FROM northwind.products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice, ProductName;

-- Question 7
SELECT ProductName, UnitsInStock, UnitPrice
FROM northwind.products
WHERE UnitsInStock = 0 AND UnitsOnOrder <= 1
ORDER BY ProductName;

-- Question 8
-- categories

-- Question 9
SELECT * FROM northwind.categories;
-- 8

-- Question 10
SELECT ProductName, CategoryID
FROM northwind.products
WHERE CategoryID = 8;

-- Question 11
SELECT FirstName, LastName
FROM northwind.employees;

-- Question 12
SELECT FirstName, LastName, Title
FROM northwind.employees
WHERE Title LIKE "%Manager%";

-- Question 13
SELECT DISTINCT(Title)
FROM northwind.employees;

-- Question 14
SELECT FirstName, LastName, Salary
FROM northwind.employees
WHERE Salary BETWEEN 2000 AND 2500;

-- Question 15
SELECT * FROM northwind.suppliers;

-- Question 16
SELECT ProductName, SupplierID
FROM northwind.products
WHERE SupplierID = 4;
