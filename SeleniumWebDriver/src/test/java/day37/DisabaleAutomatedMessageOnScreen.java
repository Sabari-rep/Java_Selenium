package day37;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisabaleAutomatedMessageOnScreen {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demo.nopcommerce.com/");

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
