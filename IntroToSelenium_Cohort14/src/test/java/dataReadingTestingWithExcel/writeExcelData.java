package dataReadingTestingWithExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilities.Constants;

public class writeExcelData {

	public static void main(String[] args) throws IOException {

		
		// open connection to the file 
		FileInputStream fs = new FileInputStream(Constants.excelData);
		
		// workbook connection
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		// get sheet index
		Sheet sh = wb.getSheet("Sheet1");
		
		// get row number 
		int lastRowNum = sh.getLastRowNum();
		System.out.println(lastRowNum);
		
		for (int i = 1; i < lastRowNum; i++) {
			
			Row row = sh.getRow(i);
			Cell cell = row.createCell(1);
			cell.setCellValue("Cohort14");
			
		}
		
		
		FileOutputStream fos = new FileOutputStream(Constants.excelData);
		
		wb.write(fos);
		fos.close();
		
		
		
		
		
		
		
		
		
	}

}
