package day39;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataInExcel {

	public static void main(String[] args) throws IOException {
		
		// Creating a excel file and Writing Data in that Excel File
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\myfile_dynamic.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows?");
		int rows=sc.nextInt();		
		
		System.out.println("How many cells");
		int cells = sc.nextInt();
		
		for(int r=0; r<=rows; r++)
		{
			XSSFRow currentRow =sheet.createRow(r);
			
			for(int c=0; c<cells; c++)
			{
				
				XSSFCell currentCell =currentRow.createCell(c);
				currentCell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
	

	}

}
