package day37;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		
		// https://demo.nopcommerce.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		/*
		//1.Taking full page Screenshot
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);   //Copying the source file to target file
		*/
		
		/*
		//2.Capturing the screenshot of specific section
		WebElement news = driver.findElement(By.xpath("//div[@class='news-list-homepage']"));
		File sourcefile = news.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\news.png");
		sourcefile.renameTo(targetfile);
		driver.quit();
		*/
		
		//3.Capturing the screenshot of specific webelement
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile = logo.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		sourcefile.renameTo(targetfile);
		driver.quit();
		
	}

}
