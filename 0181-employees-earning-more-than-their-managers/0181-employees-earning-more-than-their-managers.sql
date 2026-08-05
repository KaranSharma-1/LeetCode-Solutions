-- SELECT e1.name As Employee
-- FROM Employee e1,Employee e2 
-- WHERE e1.salary > e2.salary and e1.managerId = e2.id;
SELECT e1.name AS Employee
FROM Employee e1
JOIN Employee e2 ON e1.managerId = e2.id
WHERE e1.salary > e2.salary;
