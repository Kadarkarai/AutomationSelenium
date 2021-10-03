package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Facebook;

public class WithinSameClass {

	public WebDriver driver;
	public WebDriverWait wait;
	Facebook fb = new Facebook();
	
	@BeforeClass
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,20);
	}
	
	@DataProvider (name = "LoginData")
	public Object [] [] logindata(){
		Object [] [] usercredentials = new Object [3] [2];
		usercredentials [0] [0] = "test@tekvey.com";  usercredentials [0] [1] = "pass_112";    
		usercredentials [1] [0] = "info@tekvey.com";  usercredentials [1] [1] = "valid_pass"; 
		usercredentials [2] [0] = "abcd@tekvey.com";  usercredentials [2] [1] = "InvalidPassword";  		
		return usercredentials;
	}
	
	@Test (dataProvider = "LoginData")
	public void login(String username, String password) {
		driver.get("https://www.facebook.com/");
		wait.until(ExpectedConditions.elementToBeClickable(fb.getUserid())).sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(fb.getPass())).sendKeys(password);
		fb.clicklogin(driver, wait);
	}
}
