package practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Login extends TestBase{
	
	@Test (description="Go to website, signin, and verify page title")
	public void loginTest() {
		
		driver.get(Utility.getMyValue("URL"));
		
		loginPage.signIn.click();
		loginPage.username.sendKeys(Utility.getMyValue("User"));
		loginPage.password.sendKeys(Utility.getMyValue("Password")+Keys.ENTER);
		
		assertEquals(driver.getTitle(),"My account - My Store");
		
	}
	

}
