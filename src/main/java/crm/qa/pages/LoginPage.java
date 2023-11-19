package crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(css="input[id='user-name']")
	WebElement username;
	
	@FindBy(css="input[id='password']")
	WebElement password;
	
	@FindBy(css="input[id='login-button']")
	WebElement loginBtn;
	
	//Initializing the page objects:
			public LoginPage() {
				PageFactory.initElements(driver, this);
			}
			
			public static String validateLoginPageTitle() {
				return driver.getTitle();
			}
			
			public String validateLogin() {
				username.sendKeys("standard_user");
				password.sendKeys("secret_sauce");
				loginBtn.click();
				return driver.getTitle();
			}
}
