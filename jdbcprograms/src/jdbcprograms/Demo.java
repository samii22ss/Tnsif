package jdbcprograms;
import java.sql.*;
import javax.sql.*;

public class Demo {
    
	public static void main(String[] args) throws Exception {
		
		String URL = "jdbc:mysql://localhost:3306/azlansami";
		String USER = "root";
		String PASSWORD = "Sami@1403";
				
		
		//step-1 : load and register the driver
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    System.out.println("The driver is loades successfully.......");
	    
	    //step-2 : Establishing the connection
	    Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
	    System.out.println("Connection Established.......");
	    
	    //step-3 : statement creation
	    Statement st = con.createStatement();
	    
	  //step-4 : execute a query
	    st.executeUpdate("CREATE TABLE student(sid int,sname varchar(20))");
	    System.out.println("Table created.......");
	     
	    st.close();
	    con.close();
	    
	}
}
