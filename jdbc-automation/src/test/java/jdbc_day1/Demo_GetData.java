package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_GetData {
	public static void main(String[] args) throws SQLException {
		// Establish connection
        String hostName = "34.201.68.2";
        String userName = "hr";
        String password = "hr";
        String query = "Select * from employees order by salary asc ";
        String connectionStr = "jdbc:oracle:thin:@"+hostName+":1521:XE";
        Connection conn = DriverManager.getConnection(connectionStr, userName, password);
        // Create Statement
        Statement stm = conn.createStatement();
        // Execute Query      // Get result set
        ResultSet rs = stm.executeQuery(query);
        
        //read data
       rs.next();
       rs.next();
        System.out.println(rs.getString("employee_id"));
        System.out.println(rs.getString("first_name"));
        System.out.println(rs.getString("last_name"));
        System.out.println(rs.getString("salary"));
        // close connection
        rs.close();
        stm.close();
        conn.close();

	}
}
