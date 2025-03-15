# Write your MySQL query statement below
SELECT DISTINCT l1.Num AS ConsecutiveNums
FROM Logs l1, Logs l2, Logs l3
WHERE l2.Id = l1.Id - 1 AND l3.Id = l1.Id - 2 AND l1.Num = l2.Num AND l3.Num = l1.Num;