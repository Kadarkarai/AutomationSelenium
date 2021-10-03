package util;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener implements ITestListener{

	Takescreenshot a = new Takescreenshot();

	public void onTestStart(ITestResult result) {
		Reporter.log("Test case : "+result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result) {
		WebDriver driver=((TestBase)result.getInstance()).driver;
		String path = a.takeScreenshot(driver, "Pass"+result.getMethod().getMethodName());
		Reporter.log("<a href='"+ path + "'> <img src='"+ path + "' height='50' width='110'/> </a>");
	}
	
	public void onTestFailure(ITestResult result) {
		WebDriver driver=((TestBase)result.getInstance()).driver;
		String path = a.takeScreenshot(driver, result.getMethod().getMethodName());
		Reporter.log("<a href='"+ path + "'> <img src='"+ path + "' height='50' width='110'/> </a>");
	}
	
	public void onTestSkipped(ITestResult result) {
		
	}
}

