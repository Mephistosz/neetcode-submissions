-- Write your query below
select c.customer_id, c.customer_name 
from customers c 
where exists (select 1
              from orders o 
              where o.customer_id = c.customer_id 
              and o.product_name in ('A','B')
group by o.customer_id
having count (distinct o.product_name) = 2) 
and not exists (select 1 from orders o where o.product_name = 'C' and o.customer_id = c.customer_id )
order by 2 asc;
