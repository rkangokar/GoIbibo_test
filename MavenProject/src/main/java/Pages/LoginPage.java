package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.CommonMethods;

public class LoginPage extends CommonMethods{
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='loginCont__input']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@class='loginCont__btn ']")
	private WebElement continuebtn;
	
	@FindBy(xpath = "//input[@class='loginCont__btn ']//preceding-sibling::p")
	private WebElement message;
	
	@FindBy(xpath="//span[@class='logSprite icClose']")
	private WebElement close;
	
	public void enterUserName(String value) {
		enterText(username, value);
	}
	
	public void validateContinueEnable() {
		Assert.assertTrue(continuebtn.isEnabled());
	}
	
	public void clickContinue() {
		continuebtn.click();
	}
	
	public void validateError() {
		Assert.assertEquals("Please enter a 10 digit mobile number", message.getText(), "Text mismatch");
	}

	public void close() {
		close.click();
	}
	
}
