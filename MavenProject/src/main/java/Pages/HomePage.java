package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='header-sprite logo']")
	private WebElement header;
	
	@FindBy(id = "get_sign_in")
	private WebElement loginButton;
	
	public void clickLoginButton() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		loginButton.click();
	}
	
	public boolean isHeaderDisplayed() {
		return header.isDisplayed();
	}
	
	
	public boolean loginButtonIsDisplayed() {
		return loginButton.isDisplayed();
	}

}
