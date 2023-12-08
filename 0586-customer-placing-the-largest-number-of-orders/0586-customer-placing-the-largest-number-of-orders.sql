# Write your MySQL query statement below
with cte as 
(
    select customer_number, COUNT(order_number) as NumOrd
    from orders
    group by(customer_number))
    
    select customer_number
    from cte
    where Numord=(Select MAX(NumOrd) from cte);

