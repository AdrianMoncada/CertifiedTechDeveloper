import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestLog {
    public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:"+
                "./Database/my", "root", "myPassword");

        Statement stmt = con.createStatement();

        String createSql = "DROP TABLE IF EXISTS EMPLEADO;\n" +
                "CREATE TABLE EMPLEADO(ID INT PRIMARY KEY, NAME VARCHAR(255), LASTNAME VARCHAR(255), COMPANY VARCHAR(255));\n" +
                "INSERT INTO EMPLEADO VALUES(1, 'Adrian', 'Moncada', 'Google');\n" +
                "INSERT INTO EMPLEADO VALUES(2, 'Juan', 'Abraham', 'Digital');\n" +
                "INSERT INTO EMPLEADO VALUES(3, 'Federico', 'Melt', 'Facebook');\n";

        stmt.execute(createSql);

        String sql = "select * from EMPLEADO";

        ResultSet rd = stmt.executeQuery(sql);

        while(rd.next()) {
            // pasamos por parametro el índice de la columna
            System.out.println(rd.getInt(1) + " " + rd.getString(2) + " " + rd.getString(3) + " " + rd.getString(4));
        }
    }
}