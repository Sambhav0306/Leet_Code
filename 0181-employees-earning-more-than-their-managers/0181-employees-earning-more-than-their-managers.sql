# Write your MySQL query statement below
SELECT e.name AS 'Employee' FROM
Employee AS e, Employee as d WHERE e.managerId=d.id AND  d.salary<e.salary;