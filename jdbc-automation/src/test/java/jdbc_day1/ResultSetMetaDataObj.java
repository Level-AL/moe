package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataObj {
	public static void main(String[] args) throws SQLException {

		// Establish connection
		String hostName = "34.201.68.2";
		String userName = "hr";
		String password = "hr";
//        String query = "Select * from departments ";
		String query = "Select * from locations ";

		String connectionStr = "jdbc:oracle:thin:@" + hostName + ":1521:XE";
		Connection conn = DriverManager.getConnection(connectionStr, userName, password);

		Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		ResultSet rs = stm.executeQuery(query);

		ResultSetMetaData md = rs.getMetaData();
		
		System.out.println(md.getColumnCount());
		
//		rs.next();
//		
//		for (int i = 1; i <= md.getColumnCount(); i++) {
//			System.out.print(rs.getString(i) + "\t");
//			
//		}
		
		while (rs.next()) {
			for (int i = 1; i <= md.getColumnCount(); i++) {
				System.out.print(rs.getString(i) + "\t");
				
			}
			System.out.println();
		}
		
		
		// Clean up code

		rs.close();
		stm.close();
		conn.close();

	}
}
