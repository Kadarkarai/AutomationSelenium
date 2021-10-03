package testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.Etraininfo;
import util.TestBase;

public class Search extends TestBase{

	Etraininfo train = new Etraininfo();
	Boolean value;
	
	@Test (testName = "Verify HomePage")
	void T001() {
		driver.get(conf.trainurl);
		Reporter.log("Posted Etrain info url"+conf.trainurl);
		wait.until(ExpectedConditions.elementToBeClickable(train.getFrom()));
		Reporter.log("Etrain page loaded successfully");
		value = driver.findElement(train.getFrom()).isDisplayed();
		Assert.assertTrue(value,"From Parameter is displayed");
	}
	
	@Test (testName = "Verify from, to and date field are editable")
	void T002() {
		value = driver.findElement(train.getFrom()).isEnabled();
		Assert.assertTrue(value,"From Parameter is editable");
	}
}
