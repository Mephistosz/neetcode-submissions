-- Write your query below
SELECT
    c.customer_id,
    c.customer_name
FROM customers AS c
WHERE EXISTS (
    SELECT 1
    FROM orders AS o
    WHERE o.customer_id = c.customer_id
      AND o.product_name IN ('A', 'B')
    GROUP BY o.customer_id
    HAVING COUNT(DISTINCT o.product_name) = 2
)
AND NOT EXISTS (
    SELECT 1
    FROM orders AS orders_with_c
    WHERE orders_with_c.customer_id = c.customer_id
      AND orders_with_c.product_name = 'C'
)
ORDER BY c.customer_name;