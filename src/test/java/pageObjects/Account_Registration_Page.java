package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Account_Registration_Page extends BasePage{

	
	
	public Account_Registration_Page(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String telephone)
	{
		txtTelephone.sendKeys(telephone);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String password)
	{
		txtConfirmPassword.sendKeys(password);
	}
	
	public void setPrivacyPolicy()
	{
		chkdPolicy.click();
	}
	
	public void clickContinue()
	{
		//solution 1
		btnContinue.click();
		
		
		// solution 2 
		//btnContinue.submit();
		
		//solution 3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
		
		// solution 4
		
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", btnContinue);
		
		
		// solution 5
		
		//btnContinue.sendKeys(Keys.RETURN);
		
		// solution 6
		
		//WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		
		}
	
	public String getConfirmationMsg()
	{
		try
		{
			return (msgConfirmation.getText());
		}
		catch(Exception e)
		
		{
			return (e.getMessage());
			
		}
	}
	
	
}
