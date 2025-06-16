SELECT e.dno, d.dname, e.salary
FROM employee e
JOIN department d ON e.dno = d.dno
WHERE e.dno IN (10, 30)
  AND e.salary >= 3000;