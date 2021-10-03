package util;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChildofTestBase extends TestBase{

	Takescreenshot a = new Takescreenshot();
	
	@Test
	public void dosomething() {
		driver.get("https://www.google.com/");
		Reporter.log("Opened the Google Page");
//		a.takeScreenshot(driver, "google page");
	}
}
