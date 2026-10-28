-- Write your query below
select 
u.name, 
case when sum(r.distance) is null then 0 
else sum(r.distance) end as "travelled_distance"
from users u 
left join rides r on r.user_id = u.id 
group by u.name
order by 2 desc;