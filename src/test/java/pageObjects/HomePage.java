package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{



public HomePage(WebDriver driver)
{
	super(driver);
	
}



@FindBy(xpath="//i[@class='fa fa-user']")
WebElement lnkMyAccount;



@FindBy(xpath="//a[normalize-space()='Register'][1]")

WebElement lnkRegistration;

@FindBy(xpath="//a[normalize-space()='Login']")
WebElement lnkLogin;

public void clickmyAccount()
{
	lnkMyAccount.click();
}

public void clickMyRegistration()
{
	lnkRegistration.click();
}

public void clickMyLogin()
{
	lnkLogin.click();
}


}