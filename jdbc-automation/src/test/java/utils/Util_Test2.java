package utils;

import java.util.List;
import java.util.Map;

public class Util_Test2 {
	public static void main(String[] args) {
		
		DB_Util.createConnection();
		DB_Util.runQuery("Select * from employees");
		
//		DB_Util.displayAllData();
//		System.out.println(DB_Util.getColumnCount());
		
		
	List <String> row	= DB_Util.getRowAsList(1);
	System.out.println(row);
	
	for ( int i = 0; i < DB_Util.getColumnCount() ; i++) {
		//System.out.println(i);
		
		if(i == 3) {
			if (row.get(i).equals("SKING")) {
				System.out.println("Email is correct.");
				break;
			}
		}
	}
		System.out.println("----------");
	
	Map <String, String> map = DB_Util.getRowDataAsMap(7);
	
	String expectedEmail = "VPATABAL";
	String expectedSalary = "4800";
	String expectedManagerID = "103";
	
	
	
	if (map.get("EMAIL").equalsIgnoreCase(expectedEmail)) {
		System.out.println("email is correct");
	}else {
		System.out.println("email is not correct.");
	}
	
      //	assertEquals(expectedEmail , map.get("EMAIL"));
	
	if (map.get("SALARY").equalsIgnoreCase(expectedSalary)) {
		System.out.println("Salary is correct");
	}else {
		System.out.println("Salary is not correct.");
	}
		DB_Util.destroy();
	
	
	if (map.get("MANAGER_ID").equalsIgnoreCase(expectedManagerID)) {
		System.out.println("MANAGER_ID is correct");
	}else {
		System.out.println("MANAGER_ID is not correct.");
	}
}
}