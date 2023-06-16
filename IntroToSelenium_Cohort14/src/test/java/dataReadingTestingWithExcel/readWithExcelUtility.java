package dataReadingTestingWithExcel;

import Utilities.Constants;
import Utilities.excelUtility;

public class readWithExcelUtility {

	public static void main(String[] args) {
		
		excelUtility.excelIntoArray(Constants.excelData, "Sheet1");
	
	}
	
	
}
