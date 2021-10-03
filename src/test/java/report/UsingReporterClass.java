package report;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Etraininfo;
import pages.Facebook;

public class UsingReporterClass {

	public WebDriver driver;
	public WebDriverWait wait;
	public SoftAssert sa = new SoftAssert();
	Etraininfo train = new Etraininfo();
	
	@BeforeClass
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,20);
	}
	
	@Test (priority=1)
	public void openpage() {
		driver.get("https://etrain.info/in");
		Reporter.log("Navigated to the etrain info");
		wait.until(ExpectedConditions.presenceOfElementLocated(train.getFrom()));
		Reporter.log("Etrain info web page is displayed");
		sa.assertEquals(true, driver.findElement(train.getFrom()).isDisplayed(), "Etrain info Page is navigated successfully");
//		driver.findElement(train.getSearch()).click();
//		Reporter.log("Search is clicked without entering from and to");
	}
	
	@Test (priority=2)
	public void dosearch() throws InterruptedException {
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(train.getFrom())).sendKeys("MAS");
//		driver.findElement(train.getFrom())
		Reporter.log("Entered the MAS in from field", 1);
		driver.findElement(train.getFrom()).sendKeys(Keys.TAB);
		Reporter.log("Clicked on tab key in the keyhboard", 2);
		Thread.sleep(1000);
		Reporter.log("Value selected in from");
		Reporter.log("New Log", 3);
		
		String a = "mad";
		driver.findElement(By.xpath("")).sendKeys(a);
		List<WebElement> element=driver.findElements(By.xpath("//ul[@class='autoFill']//child::li"));
		
	}
		
}
