# Write your MySQL query statement below
with cte as (
    select v.visit_id, v.customer_id
    from visits as v
    left join transactions as t
    on v.visit_id=t.visit_id
    where t.transaction_id is null
)

select customer_id, Count(visit_id) as count_no_trans
from cte
group by(customer_id);