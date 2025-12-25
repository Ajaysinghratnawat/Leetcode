# Write your MySQL query statement below
select emp.name as Employee
from Employee as emp join Employee as man
where emp.managerId=man.id and emp.salary>man.salary;