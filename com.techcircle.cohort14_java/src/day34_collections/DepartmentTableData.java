package day34_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentTableData {
	public static void main(String[] args) {
		
		Map<String , String> row1 = new HashMap <>();
		
		row1.put("DEPARTMENT_ID", "10");
		row1.put("DEPARTMENT_Name", "Administration");
		row1.put("MANAGER_ID", "200");
		row1.put("LOCATION_ID", "1700");
		
		
		Map<String , String> row2 = new HashMap <>();
		
		row2.put("DEPARTMENT_ID", "20");
		row2.put("DEPARTMENT_Name", "Marketing");
		row2.put("MANAGER_ID", "201");
		row2.put("LOCATION_ID", "1800");
		
		
		Map<String , String> row3 = new HashMap <>();
		
		row3.put("DEPARTMENT_ID", "30");
		row2.put("DEPARTMENT_Name", "Purchasing");
		row3.put("MANAGER_ID", "114");
		row3.put("LOCATION_ID", "1700");
		
		
		
		for (Map.Entry<String, String> rowData : row1.entrySet()) {
			System.out.println(rowData.getKey()+ " = " + rowData.getValue());
		}
		System.out.println("*****************************");
		
		for (Map.Entry<String, String> rowData : row2.entrySet()) {
			System.out.println(rowData.getKey()+ " = " + rowData.getValue());
		}
		System.out.println("*****************************");
		
		for (Map.Entry<String, String> rowData : row3.entrySet()) {
			System.out.println(rowData.getKey()+ " = " + rowData.getValue());
		}
		System.out.println("*****************************");
		
		
		System.out.println("+++++++++++++");
		
	//	List <String> list = new ArrayList<>();
		
		List <Map<String , String>> list = new ArrayList<>();
		
		list.add(row1);
		list.addAll(Arrays.asList(row2,row3));
		
		
		for ( int i = 0; i < list.size(); i++) {
			System.out.println("Row #" + i + "----------------");
			for (Map.Entry<String,String> row : list.get(i).entrySet()) {
				
				System.out.println(row.getKey()+ " = " + row.getValue());
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
