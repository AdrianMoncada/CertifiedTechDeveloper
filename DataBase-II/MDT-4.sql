#1) Empleados
#a) Crear un SP que liste los apellidos, nombres y edad de los empleados ordenados
#alfabéticamente.
#Tip: Para la edad, crear una función que tenga como parámetro de entrada la fecha de
#nacimiento y devuelva la edad.
#b) Invocar el SP para verificar el resultado

DELIMITER $$
CREATE FUNCTION udf_Employee_Age(pi_date datetime) returns tinyint  
DETERMINISTIC
BEGIN 
DECLARE result TINYINT;
SET result = (SELECT TIMESTAMPDIFF(YEAR,pi_date,CURDATE()));

RETURN result;
END;
$$ 

SELECT * FROM udf_Employee_Age(1948-12-08 00:00:00);

DELIMITER $$
CREATE PROCEDURE usp_Employee_Age_Insert()
BEGIN 

SELECT 
	e.Nombre as 'Nombre'
	, e.Apellido as 'Apellido'
    , e.FechaNacimiento
    , udf_Employee_Age(e.FechaNacimiento)
FROM  Empleados e;
END;
$$ 

CALL usp_Employee_Age_Insert();

#2) Empleados por ciudad
#a) Crear un SP que reciba el nombre de una ciudad y liste los empleados de esa ciudad que
#sean mayores a 25 años.
#Tip: Utilizar la función creada en punto 1.
#b) Invocar al SP para listar los empleados de London.

DELIMITER $$
CREATE PROCEDURE usp_Employee_By_City(param_ciudad varchar(15))
BEGIN 

SELECT 
	e.Nombre as 'Nombre'
	, e.Apellido as 'Apellido'
    , e.FechaNacimiento
    , udf_Employee_Age(e.FechaNacimiento)
    , e.Ciudad
FROM  Empleados e
WHERE udf_Employee_Age(e.FechaNacimiento) > 25 AND e.Ciudad like param_ciudad;
END;
$$ 

CALL usp_Employee_By_City("Kirkland");

#3) Empleados por país
#a) Crear un SP que liste los apellidos, nombres, edad y la diferencia en años de edad con el
#valor máximo de edad que tiene la tabla de Empleados
#Tip: Utilizar la función creada en punto 1. Crear una función que devuelva la fecha de
#nacimiento mínima de la tabla Empleados.

DELIMITER $$
CREATE FUNCTION udf_Employee_Minimum_Birthdate() returns tinyint 
DETERMINISTIC
BEGIN 
DECLARE result TINYINT;
SET result = 22;

RETURN result;
END;
$$

SELECT 
	e.Nombre as 'Nombre'
	, e.Apellido as 'Apellido'
    , udf_Employee_Age(e.FechaNacimiento) as 'Edad'
    , e.Pais
    , udf_Employee_Minimum_Birthdate() as 'Diferencia Edad'
FROM  Empleados e

