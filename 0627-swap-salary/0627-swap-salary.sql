# Write your MySQL query statement below
update salary 
set sex= CASE When sex='f' then 'm' 
WHEN sex='m' then 'f'
end