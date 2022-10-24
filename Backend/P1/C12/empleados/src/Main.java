import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*UPDATE EMPLEADO
        SET COUNTRY = 'Alemania'
        WHERE ID=1;*/
public class Main {
    private final static Logger logger = Logger.getLogger(Main.class);
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS EMPLEADO; CREATE TABLE EMPLEADO "
            + "("
            + " ID INT PRIMARY KEY,"
            + " EMAIL VARCHAR(50) NOT NULL, "
            + " NAME VARCHAR(50) NOT NULL, "
            + " COUNTRY VARCHAR(50) NOT NULL, "
            + " LASTNAME VARCHAR(50) NOT NULL "
            + " );";

    private static final String SQL_INSERT = "INSERT INTO EMPLEADO (ID, EMAIL, NAME, COUNTRY, LASTNAME) VALUES (1,'federicodiaz@gmail.com','Federico','Argentina','Diaz')";
    private static final String SQL_INSERT2 = "INSERT INTO EMPLEADO (ID, EMAIL, NAME, COUNTRY, LASTNAME) VALUES (2,'agustinapodesta@gmail.com','Agustina','Brasil','Podesta')";
    private static final String SQL_INSERT3 = "INSERT INTO EMPLEADO (ID, EMAIL, NAME, COUNTRY, LASTNAME) VALUES (3,'pedroalonso@gmail.com','Pedro','Argentina','Alonso')";
    private static final String SQL_INSERT4 = "UPDATE EMPLEADO\n" +
            "SET COUNTRY = 'Argelia'\n" +
            "WHERE ID=3;";

    private static final String SQL_INSERT5 = "DELETE FROM EMPLEADO\n" +
            "WHERE ID=1;";

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:" +
                "~/test", "sa", "");
    }


    public static void main(String[] args) throws Exception {
        File log4jfile = new File("./src/logging/config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());
        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            statement.execute(SQL_INSERT);
            statement.execute(SQL_INSERT2);
            statement.execute(SQL_INSERT3);
            statement.execute(SQL_INSERT4); /*actualizar a uno de los empleados con un nuevo valor*/
            statement.execute(SQL_INSERT5);


            String sql = "SELECT * FROM EMPLEADO\n" +
                    "WHERE ID = 1;\n";

            ResultSet rd = statement.executeQuery(sql);

            while (rd.next()) {
                logger.debug("ID: " + rd.getInt(1) + " MAIL: " + rd.getString(2) +
                        " NAME: " + rd.getString(3) + " COUNTRY: " + rd.getString(4) +
                        " LASTNAME: " + rd.getString(5));
            }

            /*String sql2 = "SELECT * FROM EMPLEADO\n" +
                    "WHERE ID = 3;\n";


             //*eliminar un empleado según el ID*/

        } catch (Exception e) {
            logger.error("error: ", e);
            /*e.printStackTrace();*/
        } finally {
            connection.close();
        }

    }
}