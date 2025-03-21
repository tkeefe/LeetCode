# Write your MySQL query statement below
select employee.name from employee join 
(select *, count(*)as num from employee group by managerid) as selftable 
on employee.id = selftable.managerid where num>=5;