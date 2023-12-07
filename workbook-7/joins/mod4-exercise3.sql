USE northwind;

-- Question 1
SELECT products.ProductID, products.ProductName, 
	   products.UnitPrice, CategoryName
FROM northwind.products
JOIN categories
	ON products.CategoryID = categories.CategoryID
ORDER BY CategoryName, ProductName;

-- Question 2
SELECT products.ProductID, products.ProductName, 
	   products.UnitPrice, CompanyName
FROM northwind.products
JOIN suppliers
	ON products.SupplierID = suppliers.SupplierID
WHERE UnitPrice >= 75
ORDER BY ProductName;

-- Question 3
SELECT products.ProductID, products.ProductName, 
	   products.UnitPrice, CategoryName, CompanyName
FROM northwind.products
JOIN categories
	ON products.CategoryID = categories.CategoryID
JOIN suppliers
	ON products.SupplierID = suppliers.SupplierID
ORDER BY ProductName;

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
SELECT orders.OrderID, orders.OrderDate, orders.ShipName, orders.ShipAddress
FROM northwind.orders
WHERE OrderID IN (SELECT OrderID
				  FROM northwind.`order details`
                  WHERE ProductID = (SELECT ProductID
									FROM northwind.products
                                    WHERE ProductName = "Sasquatch Ale"));
                                    
SELECT `Order Details`.OrderID, OrderDate, ShipName, ShipAddress 
FROM `Order Details`
JOIN Orders
	ON `Order Details`.OrderID = Orders.OrderID
JOIN Products
	ON `Order Details`.ProductID = Products.ProductID
WHERE ProductName LIKE "Sasquatch Ale";
