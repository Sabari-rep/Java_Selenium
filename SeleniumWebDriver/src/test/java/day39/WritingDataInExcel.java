package day39;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInExcel {

	public static void main(String[] args) throws IOException {
		
		// Creating a excel file and Writing Data in that Excel File
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Language");
		row1.createCell(1).setCellValue("Version");
		row1.createCell(2).setCellValue("Platform");

		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Java");
		row2.createCell(1).setCellValue("19");
		row2.createCell(2).setCellValue("Automation");

		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("Python");
		row3.createCell(1).setCellValue("3");
		row3.createCell(2).setCellValue("Automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
	

	}

}
