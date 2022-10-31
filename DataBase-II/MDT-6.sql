#1. Vamos a crear un store procedure llamado facturacion_cliente() que dadas 2 fechas
#como parámetros de entrada, nos devuelva los datos de todos los clientes y un campo donde
#mostremos el monto total de facturas creadas entre las fechas recibidas por parámetro para
#cada cliente. Recordemos que puede haber más de 1 factura por cliente. Para realizar ese
#cálculo, vamos a crear una función llamada facturas_por_cliente() donde le vamos a pasar
#como parámetro el id del cliente, las fechas desde y hasta y nos va a devolver la suma total
#de las facturas por cada uno de ellos. Por último, si este campo nos devuelve null o 0
#debemos mostrar la palabra ‘Sin Datos’ en ese cálculo. Ejecutar el store para las fechas
#'2010-02-01' hasta '2010-02-11' y luego para '2010-02-01' hasta '2010-02-12'.

DELIMITER $$
CREATE FUNCTION facturas_por_cliente(cliente_id smallint,fecha_A date, fecha_B date) RETURNS varchar(50)  DETERMINISTIC
BEGIN
# Nos va a devolver la suma total de las facturas por cada uno de ellos.
	DECLARE suma_total TINYINT;
    DECLARE respuesta varchar(50);
    SET suma_total = (SELECT SUM(total)
    FROM facturas
    WHERE id_cliente = cliente_id
    AND (fecha_factura BETWEEN fecha_A AND fecha_B));
	CASE WHEN suma_total is null or suma_total = 0 THEN SET respuesta = 'SIN DATOS';
    ELSE SET respuesta = CAST(suma_total as nchar);
    END CASE;
    RETURN respuesta;
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE usp_facturacion_cliente(in fecha_A date, in fecha_B date) 
BEGIN 
	SELECT c.*, facturas_por_cliente(fecha_A, fecha_B, c.id) as total from clientes c inner join facturas f on c.id = f.id_cliente group by c.id;
END;
$$ 

call usp_facturacion_cliente('2010-02-01', '2010-02-11');

#2. Vamos a generar un SP llamado calcular_impuesto(), donde vamos a pasarle un primer
#parámetro de un valor de un producto y, como segundo parámetro, el impuesto que vamos a
#calcularle a dicho valor. Una vez que realizamos el cálculo del impuesto, vamos a devolver en
#el primer parámetro que teníamos, el valor del nuevo precio del producto con el impuesto
#agregado. Probar el SSP con los siguientes valores: para el importe vamos a poner el valor
#de 5000 y para el impuesto, vamos a ingresar el 21.

DELIMITER $$
CREATE PROCEDURE calcular_impuesto(
inout valor_producto DOUBLE,
in impuesto tinyint
)
BEGIN
    SET valor_producto = ((100+impuesto) * valor_producto) / 100;
END;
$$

SET @producto = 50.50;
SET @impuesto = 10;
CALL calcular_impuesto(@producto, @impuesto);
SELECT @producto;