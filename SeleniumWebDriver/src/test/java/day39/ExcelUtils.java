package day39;

//Excel File ---> Workbook--->Sheets--->Rows---->Cells

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;

	public static int getRowCount(String xlfile, String xlsheet) throws IOException 
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(xlsheet);
		int rowCount = sh.getLastRowNum();
		wb.close();
		fi.close();
		return rowCount;

	}

	public static int getCellCount(String xlfile, String xlsheet,int rownum) throws IOException 
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(xlsheet);
		row=sh.getRow(rownum);
		int cellCount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellCount;
	}
	
	//Put the data reading method in try catch block, since in excel sometimes data is not present in any of the cell.
	
	public static String getCellData(String xlfile, String xlsheet,int rownum, int coloumn) throws IOException 
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(xlsheet);
		row=sh.getRow(rownum);
		cell=row.getCell(coloumn);
		
		String data;
		try 
		{
			//data=cell.toString();
			DataFormatter formatter = new DataFormatter();
			data=formatter.formatCellValue(cell); //Returns the formated value of a cell as a string regardless of the cell type
			
		}
		catch(Exception e)
		{
			data="";
		}
		
		wb.close();
		fi.close();
		return data;
	
	}
	
	//For both reading and writing the data in excel
	
	public static void setCellData(String xlfile, String xlsheet,int rownum, int coloumn, String data) throws IOException 
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		row=sh.getRow(rownum);
		
		cell=row.createCell(coloumn);
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillGreenColor(String xlfile, String xlsheet,int rownum, int coloumn) throws IOException 
	{ 
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		row=sh.getRow(rownum);
		cell=row.getCell(coloumn);
		
		style= wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillRedColor(String xlfile, String xlsheet,int rownum, int coloumn) throws IOException 
	{ 
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		row=sh.getRow(rownum);
		cell=row.getCell(coloumn);
		
		style= wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	
	
	}
		
		
		
	


