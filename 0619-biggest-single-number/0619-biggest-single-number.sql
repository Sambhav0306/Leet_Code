# Write your MySQL query statement below
with cte as
(select num, count(num) as c
from MyNumbers
group by(num)) 

select MAX(num)  as num
from cte
where c=1