package day44_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//Using PageFactory

public class LoginPage2 {
	
	WebDriver driver;
	
	//Constructor
	
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);   //Mandatory*****
	}

	//Locators
	
	//@FindBy(xpath=("//input[@placeholder='Username']"))
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Username']") //Another way of locating the WebElement in PageFactory
	WebElement txt_username;
	
	@FindBy(xpath=("//input[@placeholder='Password']"))
	WebElement txt_password;
	
	@FindBy(xpath=("//button[normalize-space()='Login']"))
	WebElement btn_login;
	

	//Action Methods
	
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}

}
