-- Write your query below

select s.seller_name from seller s 
WHERE s.seller_id not in (select o.seller_id from orders o where EXTRACT(YEAR FROM o.sale_date) = 2020)
group by s.seller_name
order by seller_name asc;