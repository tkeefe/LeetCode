# Write your MySQL query statement below
SELECT id,
CASE WHEN p_id IS NULL THEN 'Root'
WHEN p_id IS NOT NULL AND id IN (SELECT DISTINCT p_id FROM tree) THEN 'Inner'
ELSE 'Leaf' end AS Type
FROM tree;