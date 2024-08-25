package day39;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		String filepath=System.getProperty("user.dir")+"\\Testdata\\DataDrivenTesting.xlsx";
		
		int rows=ExcelUtils.getRowCount(filepath, "Sheet1");
		
		for(int i=1; i<=rows; i++)
		{
            //1.Read data from excel
			String prin=ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
			String RI=ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
			String per1=ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
			String per2=ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
			String freq=ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
			String exp_matValue=ExcelUtils.getCellData(filepath, "Sheet1", i, 5);
			
			//2.Pass the data to application
			
			driver.findElement(By.id("principal")).sendKeys(prin);
			driver.findElement(By.id("interest")).sendKeys(RI);
			driver.findElement(By.id("tenure")).sendKeys(per1);
			
			Select peridropdown= new Select(driver.findElement(By.id("tenurePeriod")));
			peridropdown.selectByVisibleText(per2);
			
			Select frqdropdown= new Select(driver.findElement(By.id("frequency")));
			frqdropdown.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]")).click();
			
			//3.Validation
			String act_matValue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_matValue)==Double.parseDouble(act_matValue))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filepath, "Sheet1",i,7, "Passed");
				ExcelUtils.fillGreenColor(filepath, "Sheet1",i,7);
				
			}
			
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filepath, "Sheet1",i,7, "Failed");
				ExcelUtils.fillRedColor(filepath, "Sheet1",i,7);
			}
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		
		}
		
		driver.quit();
		
	}	
			

}
	
