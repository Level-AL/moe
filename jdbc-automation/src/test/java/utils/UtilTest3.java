package utils;

import java.util.List;
import java.util.Map;

public class UtilTest3 {
	public static void main(String[] args) {
		
		// What is the query to find out all the information of a specific 
		//employee whose employee_id is 107.
		
		DB_Util.createConnection();
		
		DB_Util.runQuery("Select * from employees where employee_id = 107");
		
		DB_Util.displayAllData();
		
		System.out.println(DB_Util.getRowCount());
		
		// get the whole row as a list of map
		
		Map <String , String > row =  DB_Util.getRowDataAsMap(1);
	
		
		for (Map.Entry<String, String> cellValue : row.entrySet()) {
			System.out.println(cellValue.getKey() + " = " + cellValue.getValue());
		}
		
		
		
		System.out.println("-------------------");
		
		
		
		DB_Util.runQuery("Select * from employees");
		
		List <Map <String, String>> list = DB_Util.getAllDataAsListOfMap();
		
		for (int i = 0; i < list.size(); i++ ) {
			Map <String, String> element = list.get(i);
			
			if(element.get("EMPLOYEE_ID").equals("200")) {
			
				for (Map.Entry<String, String> map : element.entrySet()) {
					
					System.out.println(map.getKey() + " = " + map.getValue());

					
				}
			}
		}
		
		
		DB_Util.destroy();
			}
}
