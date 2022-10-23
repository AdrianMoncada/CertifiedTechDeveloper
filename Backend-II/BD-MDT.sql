WH3R

1.

SELECT ContactID, FirstName, LastName FROM contact
where LastName like '_a%';

2.

SELECT CONCAT(Title, FirstName, " ", LastName) AS FIRSTNAME FROM contact
WHERE Title = "Mr." OR Title = "Ms.";

3.

SELECT Name, ProductNumber
FROM product
WHERE (ProductNumber LIKE "AR%"
    OR ProductNumber LIKE 'BE%'
    OR ProductNumber LIKE 'DC%');
    
4.

SELECT FirstName
FROM contact
WHERE (FirstName NOT LIKE "_O%"
	OR FirstName NOT LIKE "_E%");
    
5.

SELECT Name, ListPrice
FROM product
WHERE ListPrice BETWEEN 400 AND 500;

6.

SELECT EmployeeID, YEAR(birthDate)
FROM employee
WHERE (birthDate BETWEEN '1960-01-01 00:00:00' AND '1980-12-31 00:00:00')
AND YEAR(birthDate) % 2 != 0;

Operadores & joins

1.

SELECT FirstName, LastName, EmployeeID, YEAR(HireDate), VacationHours
FROM employee LEFT JOIN
contact ON employee.ContactId = contact.ContactId
WHERE YEAR(HireDate) >= 2000;

