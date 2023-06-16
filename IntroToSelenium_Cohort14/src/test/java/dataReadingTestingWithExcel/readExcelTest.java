package dataReadingTestingWithExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import Utilities.Constants;

public class readExcelTest {
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream(Constants.excelData);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// both starting index of 0
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(0);
//		System.out.println(cell);
		
//		System.out.println(sheet.getRow(1).getCell(0));
		
		for (Row row : sheet) {
			
			for (Cell cell : row) {
			
				switch(cell.getCellType()) {
				
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.print(cell.getRichStringCellValue());
					break;
				case FORMULA:
					System.out.print(cell.getNumericCellValue());
					break;
					
				}
				System.out.print(" "+"|");
			}
			System.out.println(" ");
			

			workbook.close();
		}
		
		
		
		
	}
}
