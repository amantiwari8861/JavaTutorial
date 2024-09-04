
package ducaterp.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    private static String url="jdbc:mysql://localhost:3306/";
    private static String userName="root";
    private static String password="1234";
    private static String databaseName="ducat?createDatabaseIfNotExist=true";

    private static Connection con=null;
    public static Connection getMySQLConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection(url+databaseName,userName,password);
            System.out.println("Connected to MySQL Successfully!");
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver not found!"+ex.getMessage());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
        
        
    
        return con;
    }
}
