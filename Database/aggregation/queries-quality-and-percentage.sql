-- ✍️ My challenge
-- SELECT
-- 	query_name
--     , ROUND(SUM(rating/position) / COUNT(query_name), 2) AS quality
--     , ROUND((SELECT COUNT(query_name) FROM Queries WHERE rating < 3) * 100 / COUNT(query_name), 2) AS 'poor_query_percentage'
-- FROM Queries
-- GROUP BY query_name;

-- ✍️The results of each subqueries below are correct. BUT!!
-- SELECT COUNT(query_name) FROM Queries WHERE rating < 3 GROUP BY query_name;
-- SELECT COUNT(query_name) FROM Queries GROUP BY query_name;

-- ✍️ This part is about whole DB, which is not required.
-- SELECT COUNT(query_name) FROM Queries WHERE rating < 3;



SELECT 
    query_name
    , ROUND(AVG(rating/position), 2) AS quality
    , ROUND(SUM(IF(rating < 3, 1, 0)) / COUNT(*) * 100, 2) AS poor_query_percentage
FROM Queries
GROUP BY query_name
HAVING query_name IS NOT NULL;
