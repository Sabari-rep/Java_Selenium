package day39;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
	
	//Excel File ---> Workbook--->Sheets--->Rows---->Cells

	public static void main(String[] args) throws IOException {
		
		// Reading the data from Excel
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		System.out.println("Number of rows is: " + rows);
		
		int cells = sheet.getRow(1).getLastCellNum();
		System.out.println("Number of cells is: " + cells);
		
		for(int r=0; r<=rows; r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0; c<cells; c++)
			{
				String currentCell=currentRow.getCell(c).toString();
				System.out.print(currentCell+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
		

	}

}
