package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSet {
	public static void main(String[] args) throws SQLException {
		
		// Establish connection
        String hostName = "34.201.68.2";
        String userName = "hr";
        String password = "hr";
//        String query = "Select * from departments ";
        String query = "Select * from employees ";

        String connectionStr = "jdbc:oracle:thin:@"+hostName+":1521:XE";
        Connection conn = DriverManager.getConnection(connectionStr, userName, password);
        
        Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs = stm.executeQuery(query);
        
        rs.absolute(5);
        System.out.println(rs.getString("employee_id") + "\t" + rs.getString("first_name"));
        
        rs.absolute(100);
        System.out.println(rs.getString("employee_id") + "\t" + rs.getString("first_name"));
        
        rs.previous();
        System.out.println(rs.getString("employee_id") + "\t" + rs.getString("first_name"));
        
        
        // Clean up code
        
        rs.close();
        stm.close();
        conn.close();
		
		
	}
	
}
