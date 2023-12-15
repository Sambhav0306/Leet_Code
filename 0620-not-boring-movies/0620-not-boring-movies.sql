# Write your MySQL query statement below
select *
from Cinema
where description<>'boring' And id%2<>0
order by rating DESC