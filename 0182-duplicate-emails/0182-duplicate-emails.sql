# Write your MySQL query statement below
SELECT Email
FROM Person
Group by Email
Having Count(Email)>1