# Write your MySQL query statement below
SELECT t.Request_at AS Day, round(sum(CASE WHEN t.Status != 'completed' THEN 1 ELSE 0 end)/count(*),2)
AS 'Cancellation Rate'
FROM Trips t
WHERE t.Client_Id IN (SELECT Users_Id FROM Users WHERE Banned ='No')
AND t.Driver_Id IN (SELECT Users_Id FROM Users WHERE Banned = 'No')
AND t.Request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY t.Request_at;