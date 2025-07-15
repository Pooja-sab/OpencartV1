package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;	
/*
 * Data is valid => Login => successful => testcase is pass => logout
 * Data is valid => login => failed => testcase is failed
 * 
 * Data is invalid => login => failed=> testcase is passed
 * Data is invalid 	=> login => sucess=> testcase failed  => logout
 */
import testBase.BaseClass;
import utilities.DataProviders;
	
public class TC003_LoginDataDrivenTest extends BaseClass {
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriven")
public void verify_loginDDT(String email,String pswd,String exp)
{
		logger.info("**********Staring TC003_LoginDDT**********");
		
		try {
		
	// home page
			HomePage hp=new HomePage(driver);
			hp.clickmyAccount();
			hp.clickMyLogin();
			
			
			
			// login page
			LoginPage lp=new LoginPage(driver);
			lp.Pass_email(email);
			lp.Pass_password(pswd);
			lp.clickLogin();
					
			//myAccount
			
			MyAccountPage map=new MyAccountPage(driver);
			boolean targetPage=map.isMyAccountPageExists();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					map.Logout();
					Assert.assertTrue(true);
					
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			if(exp.equalsIgnoreCase("invalid"))
			{
				if(targetPage==true)
				{
					map.Logout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***********Completed the Test Successfully*******");	
}
	

}
