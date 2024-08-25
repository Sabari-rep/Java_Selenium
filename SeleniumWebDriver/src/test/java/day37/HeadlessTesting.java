package day37;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");      //----> Setting for headless mode of execution

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demo.opencart.com/");

		String actual_title = driver.getTitle();

		if (actual_title.equals("Your Store")) {
			System.out.println("Test Passed");
		}

		else {
			System.out.println("Test Failed");
		}

		// driver.quit();

	}

}
