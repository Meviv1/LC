# Write your MySQL query statement below
select p.product_id, ifnull(ROUND((SUM(U.units*P.price)/(SUM(U.units))),2),0) as average_price 
from Prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id
AND purchase_date <=end_date and purchase_date>=start_date
Group by p.product_id;