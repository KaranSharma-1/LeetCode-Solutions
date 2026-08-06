-- SELECT Product.product_name,year ,price 
-- FROM Sales
-- JOIN Product ON Product.product_id = Sales.product_id;
SELECT product_name , year , price from Sales join Product using (product_id );
