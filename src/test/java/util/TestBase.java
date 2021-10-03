package util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class TestBase {

	public WebDriver driver;
	public WebDriverWait fastwait,wait,slowwait;
	public static Config conf=new Config();
	
	@BeforeClass 
	public void getbrowser() 
	{
//		System.out.println(conf.driverurl);
		System.setProperty("webdriver.chrome.driver", conf.driverurl);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,10);
		slowwait = new WebDriverWait(driver,20);
		fastwait = new WebDriverWait(driver,5);
	}
}
