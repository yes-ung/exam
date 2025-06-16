SELECT e.dno, d.dname, MAX(salary) AS 최고급여
FROM employee e
JOIN department d ON e.dno = d.dno
WHERE e.dno IN (10, 30)
GROUP BY e.dno, d.dname
HAVING MAX(salary) >= 3000;