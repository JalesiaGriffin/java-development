USE northwind;

-- Question 1
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName
FROM products p
JOIN categories c
	ON p.CategoryID = c.CategoryID
ORDER BY c.CategoryName, p.ProductName;

-- Question 2
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CompanyName
FROM products p
JOIN suppliers s
	ON p.SupplierID = s.SupplierID
WHERE UnitPrice >= 75
ORDER BY p.ProductName;

-- Question 3
SELECT p.ProductID, p.ProductName, 
	   p.UnitPrice, c.CategoryName, s.CompanyName
FROM products p
JOIN categories c
	ON p.CategoryID = c.CategoryID
JOIN suppliers s
	ON p.SupplierID = p.SupplierID
ORDER BY p.ProductName;

-- Question 4
SELECT p.ProductName, c.CategoryName
FROM products p
JOIN categories c ON p.CategoryID = c.CategoryID
WHERE p.UnitPrice = (SELECT MAX(UnitPrice)
					FROM products);
                    
-- Question 5
SELECT o.OrderID, o.ShipName, o.ShipAddress, s.CompanyName
FROM orders o
JOIN shippers s ON s.ShipperID = o.ShipVia
WHERE o.ShipCountry = "Germany";

-- Question 6
SELECT o.OrderID, o.OrderDate, o.ShipName, o.ShipAddress
FROM orders o
WHERE OrderID IN (SELECT OrderID
				  FROM `order details` od
                  WHERE ProductID = (SELECT ProductID
									FROM northwind.products
                                    WHERE ProductName = "Sasquatch Ale"));

SELECT o.OrderID, o.OrderDate, o.ShipName, o.ShipAddress
FROM orders od
JOIN `order details` od ON o.OrderID = od.OrderID
JOIN products p ON od.ProductID = p.ProductID
WHERE p.ProductName = "Sasquatch Ale";
