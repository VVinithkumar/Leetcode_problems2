# Write your MySQL query statement below
select product.product_name,sales.year,sales.price from sales INNER JOIN product on sales.product_id=product.product_id