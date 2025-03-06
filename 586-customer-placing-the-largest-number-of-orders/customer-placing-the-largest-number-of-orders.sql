# Write your MySQL query statement below
SELECT customer_number FROM Orders
GROUP BY 1
ORDER BY COUNT(DISTINCT order_number) DESC LIMIT 1;