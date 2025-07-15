package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage (WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	public void Pass_email(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void Pass_password(String pass )
	{
		txtpassword.sendKeys(pass);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}
	
	

}
