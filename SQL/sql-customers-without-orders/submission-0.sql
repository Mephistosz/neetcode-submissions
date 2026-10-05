-- Write your query below
select name from customers c where not exists (select 1 from orders o where c.id = o.customer_id);