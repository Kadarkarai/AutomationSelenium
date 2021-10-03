package report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Etraininfo;

public class UsingReporterlogstandardOut {
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
		Reporter.log("Etrain info web page is displayed",true);
//		Reporter.log(null, false);
		sa.assertEquals(true, driver.findElement(train.getFrom()).isDisplayed(), "Etrain info Page is navigated successfully");
	}
}
