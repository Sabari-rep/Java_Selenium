package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		// https://demo.nopcommerce.com/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/*
		//Scrolling the page using pixel
		js.executeScript("window.scrollBy(0,1000)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));   ---> used to print the pixel value
		*/
		
		/*
		//Scrolling the page till the element is visible
		WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='News']"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		//Scrolling the page till the end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		//Scrolling back to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));

	}

}
