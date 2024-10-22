package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass 
{
	
	@Test(groups= {"Sanity", "Master"})
	public void verify_Login()
	{
		try
		{
			
		logger.info("******Starting TC002_LoginTest****" );
		
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.email(p.getProperty("email"));
		lp.pwd(p.getProperty("password"));
		lp.login();
		
		//MyAccountPage
		
		MyAccountPage myacc = new MyAccountPage(driver);
		boolean targetPage=myacc.isMyAccountPageExists();
		Assert.assertEquals(targetPage, true);   //Assert.assertTrue(targetPage);
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("******Finished TC002_LoginTest****" );
		
	}

}
