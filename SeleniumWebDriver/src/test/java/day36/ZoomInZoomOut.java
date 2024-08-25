package day36;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		
		// https://demo.nopcommerce.com/
		
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://demo.nopcommerce.com/");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
				JavascriptExecutor js =(JavascriptExecutor)driver;
				
				js.executeScript("document.body.style.zoom='50%'");
				Thread.sleep(5000);
				
				js.executeScript("document.body.style.zoom='75%'");
				Thread.sleep(5000);
				
				
				
	}

}
