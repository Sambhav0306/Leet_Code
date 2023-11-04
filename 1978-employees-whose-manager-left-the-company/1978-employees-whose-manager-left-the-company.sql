# Write your MySQL query statement below
SELECT employee_id
FROM employees 
WHERE manager_id NOT IN
(SELECT employee_id FROM employees)
AND salary < 30000
order by employee_id;