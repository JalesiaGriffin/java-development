-- Question 1
SELECT COUNT(*) AS num_of_suppliers
FROM northwind.suppliers;

-- Question 2
SELECT SUM(salary) AS employee_salaries_sum
FROM northwind.employees;

-- Question 3
SELECT MIN(unitprice) AS cheapest_product
FROM northwind.products;

-- Question 4
SELECT AVG(unitprice) AS price_average
FROM northwind.products;

-- Question 5
SELECT MAX(unitprice) AS most_expensive_price
FROM northwind.products;

-- Question 6
SELECT SupplierID, COUNT(*) AS item_count
FROM northwind.products
GROUP BY SupplierID;
 
 -- Question 7
 SELECT CategoryID, AVG(UnitPrice) AS price_avergae
 FROM northwind.products
 GROUP BY CategoryID;
 
 -- Question 8
SELECT SupplierID, COUNT(*) AS supplier_products
FROM northwind.products
GROUP BY SupplierID
HAVING supplier_products >= 5;

-- Question 9
SELECT ProductID, ProductName, (UnitsInStock * UnitPrice) AS inventory_value
FROM northwind.products
ORDER BY inventory_value DESC, ProductName;  
 