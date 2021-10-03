package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {

	public WebDriver driver;
	
	@Test
	public void firstprogram() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tekvey.blogspot.com/");
	}
	
}