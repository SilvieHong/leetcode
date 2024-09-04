SELECT MAX(SALARY) AS SecondHighestSalary
    FROM EMPLOYEE
WHERE SALARY < (SELECT MAX(SALARY) FROM EMPLOYEE);

-- If there is no second highest salary, return null
-- SELECT SALARY AS 'SecondHighestSalary' 
-- FROM EMPLOYEE ORDER BY SALARY DESC LIMIT 1,1;
