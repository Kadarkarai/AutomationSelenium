package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Facebook;

public class InSomeOtherClass {

	public WebDriver driver;
	public WebDriverWait wait;
	Facebook fb = new Facebook();
	
	@BeforeClass
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,20);
	}
		
	@Test (dataProviderClass = WithinSameClass.class,dataProvider = "LoginData")
	public void login(String username, String password) {
		driver.get("https://www.facebook.com/");
		wait.until(ExpectedConditions.elementToBeClickable(fb.getUserid())).sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(fb.getPass())).sendKeys(password);
		fb.clicklogin(driver, wait);
	}
}
