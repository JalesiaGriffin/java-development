USE northwind;

-- Question 1
INSERT INTO suppliers (SupplierID, CompanyName, ContactName, ContactTitle)
VALUES (30, "Jalesia's Company", "Jalesia Griffin", "Founder/CEO");
        
-- Question 2
INSERT INTO products (ProductID, ProductName, SupplierID)
VALUES (78, "Jalesia's Product", 30);

-- Question 3
SELECT p.ProductName, s.CompanyName FROM products p
JOIN suppliers s ON p.SupplierID = s.SupplierID;

-- Question 4
UPDATE products
SET UnitPrice = UnitPrice * 1.15 
WHERE ProductID = 78;

-- Question 5
SELECT p.ProductName, s.CompanyName FROM products p
JOIN suppliers s ON p.SupplierID = s.SupplierID
WHERE s.SupplierID = 30;

-- Question 6
DELETE FROM suppliers
WHERE SupplierID = 30;

-- Question 7
DELETE FROM products p
WHERE p.ProductID = 78;

-- Question 8
SELECT * FROM products;

-- Question 9
SELECT * FROM suppliers;