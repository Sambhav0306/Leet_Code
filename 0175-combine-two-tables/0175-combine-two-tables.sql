# Write your MySQL query statement below
select firstName, lastName, city, state
from Person
Left join  Address
On Person.personId=Address.personId