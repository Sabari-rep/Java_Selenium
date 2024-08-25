package day39;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws IOException, InterruptedException {

		// https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();

		String filepath = System.getProperty("user.dir") + "\\Testdata\\DataDrivenTesting.xlsx";
		int rows = ExcelUtils.getRowCount(filepath, "Sheet2");

		WebElement inideposit = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		WebElement length = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		WebElement apr = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
		WebElement calbutton = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")); // 'Lets run the numbers' button
																								

		for (int i = 1; i <= rows; i++) {
			
			// 1.Read data from file
			String inidepo = ExcelUtils.getCellData(filepath, "Sheet2", i, 0); // file,sheet,row #, col zero for initial deposit					
			String interestrate = ExcelUtils.getCellData(filepath, "Sheet2", i, 1); // interest rate
			String monthlength = ExcelUtils.getCellData(filepath, "Sheet2", i, 2); // length
			String compoundingmonths = ExcelUtils.getCellData(filepath, "Sheet2", i, 3); // compounding
			String exptotal = ExcelUtils.getCellData(filepath, "Sheet2", i, 4); // expected total , will be compared with actual total
																			

			// 2.Pass the data to application
			inideposit.clear();
			length.clear();
			apr.clear();

			Thread.sleep(3000);

			// using webelement and passing the values from xl cell data

			inideposit.sendKeys(inidepo);
			length.sendKeys(interestrate);
			apr.sendKeys(monthlength);

			// Dropdown (Boostrap) - Not having Select Tag
			WebElement compoundrp = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']")); // select class object compoundrp will find element by id
																									
			compoundrp.click();

			List<WebElement> options = driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));

			for (WebElement option : options) {
				if (option.getText().equals(compoundingmonths))
					option.click();
			}

			calbutton.click(); /// click on button to calculate cd calculation based on xl cell data
			String acttotal = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();

			System.out.println("act total is: " + acttotal);
			System.out.println("exp total is: " + exptotal);

			if (exptotal.equals(acttotal)) // if expected total = actual total then
			{ 

				ExcelUtils.setCellData(filepath, "Sheet2", i, 6, "passed"); // setting passed in 6th column (index start
																			// with zero)
				ExcelUtils.fillGreenColor(filepath, "Sheet2", i, 6); // filling the color in 6th column if passed then
																		// green or failed then red.
			} 
			
			else 
			{
				ExcelUtils.setCellData(filepath, "Sheet2", i, 6, "passed");
				ExcelUtils.fillGreenColor(filepath, "Sheet2", i, 6);
			}
		}
		
		System.out.println("calculation has been completed");
		driver.close();
	}

}
