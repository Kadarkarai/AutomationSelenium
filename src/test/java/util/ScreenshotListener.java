package util;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class ScreenshotListener extends TestListenerAdapter {

	Takescreenshot a = new Takescreenshot();
	
	public void onTestSuccess(ITestResult result) {
		WebDriver driver=((TestBase)result.getInstance()).driver;
		String path = a.takeScreenshot(driver, "FAIL"+result.getMethod().getMethodName());
		Reporter.log("<a href='"+ path + "'> <img src='"+ path + "' height='100' width='100'/> </a>");
	}
	
}
