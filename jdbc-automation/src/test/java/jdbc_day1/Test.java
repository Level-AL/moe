package jdbc_day1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test {
	public static void main(String[] args) throws SQLException {

		Functions f = new Functions();

//		f.displayTableDataByTableName("Employee_id");
//		f.displayTableDataByTableName("countries");
//		

//	List <String> list = 	f.getColumnDataAsList("Select * from regions" , "REGION_NAME");
		List<String> list = f.getColumnDataAsList("Select * from employees", "salary");
		System.out.println(list);

		int maxSalary = Integer.parseInt(list.get(0));

		for (String s : list) {
			if (Integer.parseInt(s) > maxSalary) {
				maxSalary = Integer.parseInt(s);
			}
		}
		
		int minSalary = Integer.parseInt(list.get(0));
		

		for (String s : list) {
			if (Integer.parseInt(s) < minSalary) {
				minSalary = Integer.parseInt(s);
			}
		}
		
		
		System.out.println(maxSalary);
		System.out.println(minSalary);
		
		ResultSet rs = f.executeQuery("select salary from employees where salary = (select max(salary) from employees)");
		rs.next();
		System.out.println("Max Salary is " + rs.getString("Salary")  );

	}

}
