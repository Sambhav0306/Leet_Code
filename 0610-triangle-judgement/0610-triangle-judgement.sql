# Write your MySQL query statement below
select *, CASE When x+y>z And y+z>x and z+x>y then 'Yes' else 'No' END as triangle 
from triangle