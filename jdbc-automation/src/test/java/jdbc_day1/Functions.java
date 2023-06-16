package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Functions {
	private Connection conn = null;
	private Statement stm = null;
	private ResultSet rs = null;
	private String hostName = "34.201.68.2";
	private String userName = "hr";
	private String password = "hr";
	private String connectionStr = "jdbc:oracle:thin:@" + hostName + ":1521:XE";

    public void displayTableDataByTableName(String tableName) {
     

        String query = "Select * from "+tableName;

       
        String connectionStr = "jdbc:oracle:thin:@" + hostName + ":1521:XE";
        try {
            conn = DriverManager.getConnection(connectionStr, userName, password);

            stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            rs = stm.executeQuery(query);

            ResultSetMetaData md = rs.getMetaData();

            System.out.println(md.getColumnCount());

//        rs.next();
//        
//        for (int i = 1 ; i <= md.getColumnCount() ; i++) {
//            System.out.print(rs.getString(i)+"\t");
//            
//        }

            while (rs.next()) {
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + "\t");

                }
                System.out.println();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // Clean up code
            try {
                rs.close();

                stm.close();
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
	
	
	
	
	
	
	
	
	
public List<String> getColumnDataAsList(String query , String column){
        
        List<String> list = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionStr, userName, password);

            stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            rs = stm.executeQuery(query);

            ResultSetMetaData md = rs.getMetaData();

            while (rs.next()) {
                list.add(rs.getString(column));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // Clean up code
            try {
                rs.close();

                stm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


	
	
	 public ResultSet executeQuery(String query ){
	        try {
	            conn = DriverManager.getConnection(connectionStr, userName, password);

	            stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

	            rs = stm.executeQuery(query);

	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally {
	            // Clean up code
//	            try {
//	                rs.close();
	//
//	                stm.close();
//	                conn.close();
//	            } catch (SQLException e) {
//	                e.printStackTrace();
//	            }
	        }
	        return rs;
	    }







}
