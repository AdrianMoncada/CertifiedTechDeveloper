import java.sql.*;

public class Main {
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE VARCHAR(100) NOT NULL, "
            + " EMAIL VARCHAR(100) NOT NULL, "
            + " SUELDO numeric(15, 2) NOT NULL "
            + " );";

    private static final String SQL_INSERT = "INSERT INTO USUARIO (ID, NOMBRE, EMAIL, SUELDO) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE USUARIO SET SUELDO=? WHERE EMAIL=?";

    public static void main(String[] args) throws Exception{
        Usuario usuario = new Usuario("Adrián","adrian@gmail.com",10.0);

        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
            psInsert.setInt(1,1);
            psInsert.setString(2,usuario.getNombre());
            psInsert.setString(3, usuario.getEmail());
            psInsert.setDouble(4,usuario.getSueldo());

            psInsert.execute();
            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            psUpdate.setDouble(1,usuario.subirSueldo(10.0));
            psUpdate.setString(2,usuario.getEmail());

            psUpdate.execute();
            int a = 4 / 0;
            connection.commit();

            connection.setAutoCommit(true);

            String sql = "SELECT * FROM USUARIO";
            Statement statement2 = connection.createStatement();
            ResultSet rd = statement2.executeQuery(sql);
            while(rd.next()){
                System.out.println(rd.getInt(1) + rd.getString(2) + rd.getString(3) + rd.getInt(4));
            }

        } catch(Exception e){
        e.printStackTrace();
        connection.rollback();
        } finally {

        }

    }

    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:" +
                "~/test", "sa", "");
    }
}