package day35;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		
		// https://demo.nopcommerce.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement reg_link=driver.findElement(By.xpath("//a[text()='Register']"));
		act.keyDown(Keys.CONTROL).click(reg_link).keyUp(Keys.CONTROL).perform();
		
		Set<String> windowIds= driver.getWindowHandles();
		List<String> Ids= new ArrayList(windowIds);
		String parentid = Ids.get(0);
		String childid = Ids.get(1);
		
		driver.switchTo().window(childid);
		driver.findElement(By.id("FirstName")).sendKeys("Sabari");
		
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("desktop");
		
		//Available in Selenium 4.x version
		//driver.switchTo().newWindow(WindowType.TAB)  --------> Used to open the another URL in new browser tab
		//driver.switchTo().newWindow(WindowType.WINDOW)  --------> Used to open the another URL in new window 

	}

}
