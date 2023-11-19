package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
LoginPage loginPage	;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = LoginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"Account Login");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
