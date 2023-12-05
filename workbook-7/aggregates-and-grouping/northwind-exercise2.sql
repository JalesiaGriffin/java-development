-- Question 1
SELECT COUNT(*)
FROM northwind.suppliers;

-- Question 2
SELECT SUM(salary)
FROM northwind.employees;

-- Question 3
SELECT MIN(unitprice) AS cheapest_product
FROM northwind.products;

-- Question 4
SELECT AVG(unitprice) AS price_average
FROM northwind.products;

-- Question 5
SELECT MAX(unitprice) AS most_expensive_product
FROM northwind.products;