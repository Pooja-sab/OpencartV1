package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	
	@Test(groups={"Sanity","Master"})
	public void verify_Login()
	{
		logger.info("**********Starting TC_002 test case *********");
		
		
		try {
		// home page
		HomePage hp=new HomePage(driver);
		hp.clickmyAccount();
		hp.clickMyLogin();
		
		
		
		// login page
		LoginPage lp=new LoginPage(driver);
		lp.Pass_email(p.getProperty("email"));
		lp.Pass_password(p.getProperty("password"));
		lp.clickLogin();
				
		//myAccount
		
		MyAccountPage map=new MyAccountPage(driver);
		boolean targetPage=map.isMyAccountPageExists();
		
		Assert.assertEquals(targetPage, true,"Login failed");
		//OR
		//Assert.assertTrue(targetPage);
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("*********TC_002 test case finished*********");
		
		
		
	}

}
