# Write your MySQL query statement below
select name
from Customer
where not referee_id=2 || referee_id is null;