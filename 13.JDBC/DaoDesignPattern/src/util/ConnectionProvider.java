package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionProvider 
{
    private static final String URL="jdbc:mysql://localhost:3306/";
    private static final String USERNAME="root";
    private static final String PASSWORD="1234";
    private static final String DATABASE="ducatERP?createDatabaseIfNotExist=true";

    private static Connection con=null;
    public static final Connection getMySQLConnection()
    {
        // JDBC -> Java Database Connectivity

        // load a type 4 JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(URL+DATABASE, USERNAME, PASSWORD);
            // System.out.println("connected to mysql succesfully!");
        } 
        catch (ClassNotFoundException  e) 
        {
            System.out.println("driver not loaded ..");
        }
        catch(SQLException s)
        {
            System.out.println("unable to connect with mysql");
            s.printStackTrace();
        }

        return con;
    }
}
