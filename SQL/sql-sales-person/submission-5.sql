select sp.name
from sales_person sp 
where sales_id not in (
    select o.sales_id 
    from orders o 
    inner join company c on o.com_id = c.com_id
    WHERE c.name = 'CRIMSON');