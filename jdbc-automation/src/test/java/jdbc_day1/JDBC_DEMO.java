package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_DEMO {

	public static void main(String[] args) throws SQLException {
		// Establish connection
		String hostName = "34.201.68.2";
		String userName = "hr";
		String password = "hr";
		String query = "Select * from employees";
		String connectionStr = "jdbc:oracle:thin:@"+hostName+":1521:XE";
		
		Connection conn = DriverManager.getConnection(connectionStr, userName, password);
		
		// Create Statement
		Statement stm = conn.createStatement();	
		// Execute Query
		stm.executeQuery(query);
		// Get result set
		ResultSet rs = stm.executeQuery(query);
		// close connection - if you don't database will be very slow 
		rs.close();
		stm.close();
		conn.close();
			
			    
			
	}
}
