# Write your MySQL query statement below
select email as Email
From Person
Group By Email
Having COUNT(Email) >1