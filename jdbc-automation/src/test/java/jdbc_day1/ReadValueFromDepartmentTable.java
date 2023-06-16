package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadValueFromDepartmentTable {
	public static void main(String[] args) throws SQLException {
		
		// Establish connection
        String hostName = "34.201.68.2";
        String userName = "hr";
        String password = "hr";
//        String query = "Select * from departments ";
        String query = "Select * from employees ";

        String connectionStr = "jdbc:oracle:thin:@"+hostName+":1521:XE";
        Connection conn = DriverManager.getConnection(connectionStr, userName, password);
        // Create Statement
        Statement stm = conn.createStatement();
        // Execute Query      // Get result set
        ResultSet rs = stm.executeQuery(query);
        
        //read data
       rs.next();
       rs.next();
       rs.next();
       rs.next();
       rs.next();
       rs.next();
       
       
//        System.out.println(rs.getString("department_id"));
//        System.out.println(rs.getString("department_name"));
//        System.out.println(rs.getString("manager_id"));
//        System.out.println(rs.getString("location_id"));
        
//        System.out.println(rs.getString(1));
//        System.out.println(rs.getString(2));
//        System.out.println(rs.getString(3));
//        System.out.println(rs.getString(4));
       
        
        
        while (rs.next()) {
        	System.out.println(rs.getString(1) + "\t" + rs.getString(2)
        	+ "\t" + rs.getString(3) + "\t" + rs.getString(4) 
        	+ "\t" + rs.getString(5) + "\t" + rs.getString(6) 
        	+ "\t" + rs.getString(7) + "\t" + rs.getString(8));
        }
        
        rs.first();
        System.out.println(rs.getString(1));
        
        // close connection
        rs.close();
        stm.close();
        conn.close();
	}
}
