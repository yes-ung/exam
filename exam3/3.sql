SELECT e.dno, d.dname, e.salary as 최고급여
FROM employee e
JOIN department d ON e.dno = d.dno
WHERE e.dno IN (10, 30)
  AND e.salary >= 3000;