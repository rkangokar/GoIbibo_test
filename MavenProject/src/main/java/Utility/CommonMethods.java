package Utility;

import org.openqa.selenium.WebElement;

public class CommonMethods {
	
	public void enterText(WebElement element, String value) {
		element.click();
		element.clear();
		element.sendKeys(value);
	}

}
