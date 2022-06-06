package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Utility.Base;

public class LoginPageTest extends Base {
	
	HomePage home;
	LoginPage login;
	
	public LoginPageTest () {
		super();	
	}
	
	@BeforeTest
	public void setup() {
		initializeDriver();
		login = new LoginPage(driver);
		home = new HomePage(driver);
	}
	
	@Test
	public void verifyIncorrectUsername() {
		home.isHeaderDisplayed();
		home.loginButtonIsDisplayed();
		home.clickLoginButton();
		login.enterUserName("94457");
		login.validateContinueEnable();
		login.clickContinue();
		login.validateError();
		login.close();
	}
	
	@Test
	public void verifyCorrectUsername() {
		home.isHeaderDisplayed();
		home.loginButtonIsDisplayed();
		home.clickLoginButton();
		login.enterUserName("9445673302");
		login.validateContinueEnable();
		login.close();
	}
	
	@AfterTest
	public void teardown() {
		quit(driver);
	}

}
