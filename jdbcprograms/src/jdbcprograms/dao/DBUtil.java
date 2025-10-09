package jdbcprograms.dao;

import java.sql.*;
import javax.sql.*;
public class DBUtil {
 
	 private Connection con;
	 private static final String Driver="com.mysql.cj.jdbc.Driver" ;
	 private static final String USERNAME = "root";
	 private static final String PASSWORD = "Sami@1403";
	 private static final String URL = "jdbc:mysql://localhost:3006/azlansami";
	 
	 public static Connection getConnection()
	 {
		try {
			Class.forName(Driver);
			System.out.println("Driver Loaded Successfully");
			
			con.DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("Connection Established");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	 }
	 

	 


}
