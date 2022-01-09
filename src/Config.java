import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config 
{
    private static Connection con;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost/rentalmobil"; 
            String user="root"; 
            String pass=""; 
            //koneksi driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //koneksi database
            con=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); 
        }
        return con;
    }    
}