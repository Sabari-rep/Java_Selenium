package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticTable {

	public static void main(String[] args) {
		// https://testautomationpractice.blogspot.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Finding total number of rows in table
		int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //Use if you have a Multiple table in webpage
		
		//int rows =driver.findElements(By.tagName("tr")).size();  //Use if you have a Single table in webpage
		
		System.out.println("Number of rows is: " + rows);
		
		//Finding total number of columns in table
		int columns = driver.findElements(By.xpath("//*[@name='BookTable']//tr[1]//th")).size();
		System.out.println("Number of columns is: " + columns);
		
		//Read data from specific row and column
		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[1]")).getText();
		System.out.println(bookname);
		
		//Reading all the data's from table
		/*
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=columns; c++)
			{
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+ " ");
			}
			
			System.out.println();
		}
		*/
		
		//Printing random data's
		
		for(int r=2; r<=rows;r++)
		{
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			//System.out.println(bookname1);
			
			if(price.equals("300"))
			{
				String bookname1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(price + " " + bookname1);
			}
		}
		
		//Find total price of the books
		int total=0;
		for(int r=2; r<=rows;r++)
		{
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total = total+Integer.parseInt(price);
			
		}
		System.out.println("Total amount of the books is: " + total);

	}

}
