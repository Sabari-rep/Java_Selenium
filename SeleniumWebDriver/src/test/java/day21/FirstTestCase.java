package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

/*
 *Test Case:
 *-----------
 1.Launch the browser(Chrome)
 2.Open URL https://demo.opencart.com/
 3.Validate title should be "Your Store"
 4.Close the browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
		//1.Launch the browser(Chrome)
		
		//ChromeDriver driver = new ChromeDriver(); //Specifically used for Chrome browser
		//WebDriver driver = new ChromeDriver(); //Always use this one, because we can launch any browser using this
		WebDriver driver = new EdgeDriver();
		
		//2.Open URL https://demo.opencart.com/
		
		driver.get("https://demo.opencart.com/");
		
		//3.Validate title should be "Your Store"
		
		String actual_title = driver.getTitle();
		
		if(actual_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		
		else {
			System.out.println("Test Failed");
		}
		
		//4.Close the browser
		//driver.close();
		//driver.quit();
		
	}

}
