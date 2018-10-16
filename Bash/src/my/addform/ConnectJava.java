/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.addform;

/**
 *
 * @author steph
 */

import java.sql.*;
import javax.swing.*;


public class ConnectJava {
    
    Connection conn=null;
    
    public static Connection ConnectDB() {
      
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Parts", "parts", "password");
            
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}