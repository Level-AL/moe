package utils;

public class UtilTest {
	public static void main(String[] args) {
		
		DB_Util.createConnection();
		
		
		DB_Util.runQuery("Select * from employees");
		DB_Util.displayAllData();
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println(DB_Util.getRowCount());		
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");

		
		
		DB_Util.runQuery("Select * from departments");
		DB_Util.displayAllData();
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println(DB_Util.getRowCount());		
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		
		
		DB_Util.runQuery("Select * from countries");
		DB_Util.displayAllData();
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println(DB_Util.getRowCount());		
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		System.out.println("____________________________");
		
		DB_Util.destroy();
		
		
		
		
	}
}
