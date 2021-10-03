package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	private static By userid = By.xpath("//input[@id='email']");
	private static By pass = By.xpath("//input[@id='pass']");
	private static By login = By.xpath("//button[@name='login']");
	
	public static By getUserid() {
		return userid;
	}
	public static By getPass() {
		return pass;
	}
	
	public void clicklogin(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	}
	
}
