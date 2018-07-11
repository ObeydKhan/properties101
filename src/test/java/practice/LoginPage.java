package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//a[@class='login']")
	WebElement signIn;

	@FindBy (xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy (xpath="//input[@name='passwd']")
	WebElement password;
}
