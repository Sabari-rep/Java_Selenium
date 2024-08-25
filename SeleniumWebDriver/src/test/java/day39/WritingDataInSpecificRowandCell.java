package day39;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInSpecificRowandCell {

	public static void main(String[] args) throws IOException {
		
		// Creating a excel file and Writing Data in that Excel File
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\myfile_Random.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row = sheet.createRow(3);
		XSSFCell cell = row.createCell(2);
		cell.setCellValue("Sabari");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
	

	}

}
