package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapTablePractice {

	public static void main(String[] args) {
		
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		//rows count
		int rows=driver.findElements(By.xpath("//div[@role='table']//div[@class='oxd-table-body']//div[@class='oxd-table-card']")).size();
		System.out.println("the Number rows is: " + rows);
		
		//Columns Counts
		int columns=driver.findElements(By.xpath("//div[@role='table']//div[@class='oxd-table-header']//div[@role='row']//div[@role='columnheader']")).size();
		System.out.println("The number of columns is: " + columns);
		
		//Printing the data
		
		for(int r=1; r<=rows;r++) 
		{
			
			String name=driver.findElement(By.xpath("//div[@role='table']//div[@class='oxd-table-body']//div["+r+"]//div[2]")).getText();
			String role=driver.findElement(By.xpath("//div[@role='table']//div[@class='oxd-table-body']//div["+r+"]//div[3]")).getText();
				
			System.out.println(name+" "+role);

		}


	}

}
