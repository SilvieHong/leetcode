-- https://leetcode.com/problems/list-the-products-ordered-in-a-period/?envType=study-plan-v2&envId=top-sql-50
-- ✍️ My challenge
-- SELECT
--     P.product_name ,O.unit
-- FROM Products P
--     LEFT OUTER JOIN Orders O ON P.product_id = O.product_id
-- WHERE YEAR(O.order_date)=2020 AND MONTH(O.order_date)=2
--     GROUP BY O.product_id HAVING SUM(O.unit)>=100

-- ✍️ Problem
-- It doesn't work properly with multiple same id
-- By using 'USING', it is possible to join columns that have the same name

SELECT
    P.product_name
   ,SUM(O.unit) AS unit
FROM Products P
JOIN Orders O USING (product_id)
WHERE YEAR(O.order_date)=2020 AND MONTH(O.order_date)=2
GROUP BY P.product_id HAVING SUM(O.unit)>=100
