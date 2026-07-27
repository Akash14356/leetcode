select
    e.employee_id,
    e.name,
    count(*) as reports_count,
    round(avg(s.age)) as average_age
from employees e
join employees s
    on e.employee_id = s.reports_to
group by e.employee_id, e.name
order by e.employee_id;