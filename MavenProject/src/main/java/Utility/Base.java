package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public Base() {
	}
	
	public static WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/vineethvm/Documents/selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
	
	public void quit(WebDriver driver) {
		driver.quit();
	}

}
