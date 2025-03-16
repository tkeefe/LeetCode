# Write your MySQL query statement below
SELECT d.Name as Department, e.Name AS Employee, Salary FROM
Department d
JOIN Employee e
ON e.DepartmentId = d.Id
WHERE (e.Salary, e.DepartmentId) IN (SELECT max(e.Salary),
e.DepartmentId
FROM Employee e GROUP BY e.DepartmentId);