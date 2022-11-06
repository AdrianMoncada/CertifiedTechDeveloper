# 1. En una base de datos cualquiera, debemos confeccionar un stored procedure que le
# enviemos un entero comprendido entre 0 y 999 inclusive. El segundo parámetro debe
# retornar la cantidad de dígitos que tiene dicho número. Debemos utilizar la sentencia IF.

DELIMITER $$
create procedure usp_1 (in pi_number int, out po_digit int)
BEGIN
SET po_digit = CHAR_LENGTH (pi_number);
END;
$$ 