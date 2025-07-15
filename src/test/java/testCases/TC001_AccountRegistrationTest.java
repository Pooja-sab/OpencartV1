package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

//import org.apache.commons.lang3.RandomStringUtils;


import pageObjects.Account_Registration_Page;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	
	@Test(groups={"Regression","Master"})
	public void verify_account_registration()
	{
		
		logger.info("*********** Starting  TC001_AccountRegistrationTest ********");
		
		
		try {
		HomePage hp=new HomePage(driver);
		hp.clickmyAccount();
		
		logger.info("Clicked into the myAccount link");
		
		hp.clickMyRegistration();
		
		logger.info("clicked into the my registration");
		
		Account_Registration_Page arp=new Account_Registration_Page(driver);
		
		logger.info("Providing customers details ");
		arp.setFirstName(randomString().toUpperCase());
		arp.setLastName(randomString().toUpperCase());
		arp.setEmail(randomString()+"@gmail.com");
		
		arp.setTelephone(randomNumber());
		
		
		String password=randomAlpanumeric();
		
		arp.setPassword(password);
		arp.setConfirmPassword(password);
		arp.setPrivacyPolicy();
		arp.clickContinue();
		
		
		logger.info("Validationg expected message");
		String Confirmation_message=arp.getConfirmationMsg();
		
		
		
		Assert.assertEquals(Confirmation_message,"Your Account Has Been Created!");
		
		}
		catch(Exception e)
		{
			logger.error("Test failed");
			//logger.debug("Debug logs");
			Assert.fail();
		}
		
		logger.info("*********Finished*********");
		
	}
	
	
	
	
	


}
