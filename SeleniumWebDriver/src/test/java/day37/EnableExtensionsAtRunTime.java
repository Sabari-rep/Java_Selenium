package day37;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRunTime {

	public static void main(String[] args) {
		
		// https://text-compare.com/
		
		ChromeOptions option = new ChromeOptions();
		File file = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\Test Files\\CRX Files\\SelectorsHub-Chrome-Web-Store.crx");
		option.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://text-compare.com/");
	}

}
