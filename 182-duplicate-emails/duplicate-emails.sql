# Write your MySQL query statement below
SELECT Email FROM
(SELECT Email, COUNT(Id) AS C
FROM Person
GROUP BY Email
) AS T
WHERE T.C > 1