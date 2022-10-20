/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;
import java.sql.*;
/**
 *
 * @author utiae
 */
public class sqlconnect {
    Connection con = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ffc","root", "root"); 
            return con;
        } catch( Exception e ) {
            return null;
        }
    }
    
    public void sqlclose() throws SQLException {
        con.close();
    }
}
