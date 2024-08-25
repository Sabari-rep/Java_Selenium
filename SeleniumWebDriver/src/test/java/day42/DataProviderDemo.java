package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

//https://tutorialsninja.com/demo/index.php?route=account/login
//pavanol123@gmail.com
//test@123


public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void login(String email, String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		boolean status=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		
		//Thread.sleep(3000);
		
		if(status=true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
			
		}
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	
	
	@DataProvider(name="dp", indices= {0,1})
	Object[][] logindata()
	{
		Object[][] data = {

				{ "abc@gmail.com", "test123" }, { "xyz@gmail.com", "test012" }, { "john@gmail.com", "test@123" },
				{ "pavanol123@gmail.com", "test@123" }, { "johncanedy@gmail.com", "test" },

		};
		
		return data;
	}

}
