# Write your MySQL query statement below
SELECT a.name AS Employee
FROM Employee AS a
JOIN employee AS b
ON a.managerId = b.id AND a.salary > b.salary;