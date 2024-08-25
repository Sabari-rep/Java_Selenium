package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		WebDriver driver = new ChromeDriver();
		
		//Explicit Wait Declaration
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Explicit wait Use
		WebElement textusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		textusername.sendKeys("Admin");
		
		WebElement textpwd = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password']")));
		textpwd.sendKeys("admin123");
		
		WebElement login = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		login.click();
		
		

		



	}

}
