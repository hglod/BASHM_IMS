package bash;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
 
public class BASH {
    
    public static void main(String[] args) {
       
    try {
        String host = "jdbc:derby://localhost:1527/Parts";
        String uName = "parts";
        String uPass= "password";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        
        Statement stmt = con.createStatement( );
        String SQL = "SELECT * FROM INVENTORY";
        ResultSet rs = stmt.executeQuery(SQL);
        
        rs.next( );
        int id_col = rs.getInt("ID");
        String price = rs.getString("Price");
        String quant = rs.getString("Quantity");
        String date = rs.getString("Purchase_Date");
        String des = rs.getString("Description");
        
        System.out.println( id_col + " " + price + " " + quant + " " + date + " " 
        + des);
    }
    
    catch ( SQLException err ) {
        System.out.println( err.getMessage( ) );
    }
    }
    
}