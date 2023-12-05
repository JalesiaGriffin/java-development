-- Question 1
-- products

-- Question 2
SELECT ProductID, ProductName, UnitPrice
FROM products;

-- Question 3
SELECT ProductID, ProductName, UnitPrice
FROM products
ORDER BY UnitPrice;

-- Question 4
SELECT ProductName, UnitPrice
FROM products
WHERE UnitPrice BETWEEN 7.5 AND 0;

-- Question 5
SELECT ProductName, UnitsInStock, UnitPrice
FROM products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;

-- Question 6
SELECT ProductName, UnitsInStock, UnitPrice
FROM products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice, ProductName;

-- Question 7
SELECT ProductName, UnitsInStock, UnitPrice
FROM products
WHERE UnitsInStock = 0 AND UnitsOnOrder <= 1
ORDER BY ProductName;

-- Question 8
-- categories

-- Question 9
SELECT * FROM categories;
-- 8

-- Question 10
SELECT ProductName, CategoryID
FROM products
WHERE CategoryID = 8;

-- Question 11
SELECT FirstName, LastName
FROM employees;

-- Question 12
SELECT FirstName, LastName, Title
FROM employees
WHERE Title LIKE "%Manager%";

-- Question 13
SELECT DISTINCT Title
FROM employees;

-- Question 14
SELECT FirstName, LastName, Salary
FROM employees
WHERE Salary BETWEEN 2000 AND 2500;

-- Question 15
SELECT * FROM suppliers;

-- Question 16
SELECT ProductName, SupplierID
FROM products
WHERE SupplierID = 4;
