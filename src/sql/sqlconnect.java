/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author utiae
 */
public class sqlconnect {

    private Connection con;
	private PreparedStatement ghysql;
	private ResultSet res;  //返回的Result
	
	public static void main(String[] args){
		sqlconnect sql=new sqlconnect();
		sql.getConnection();
	}
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ffc","root", "3377"); 
            return con;
        } catch( Exception e ) {
            return null;
        }
    }
    
    public void sqlclose(){
		//在处理完结果集的时候再关闭连接，关掉连接后处理结果集会发生此错误。
		if(ghysql !=null){
			try{
				ghysql.close();
				System.out.println("释放并关闭了sql空间");
			}catch(SQLException e){
				System.err.println(e.getMessage());
			}
			ghysql=null;
		}
	}
}
