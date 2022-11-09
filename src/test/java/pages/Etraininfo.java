package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Etraininfo {

	private By from = By.xpath("//input[@name='station1']");
	private By to = By.xpath("//input[@name='station2']");
	private By date = By.xpath("//input[@name='date']");
	private By search = By.xpath("//button[@id='tbssbmtbtn']");
	private By todaydate = By.xpath("//input[@class='calBtn today']");
	
	private By dateoverlay = By.xpath("//div[@class='dpdd etcal closeTapOut']");
	private By autocomplete = By.xpath("//div[@id='et_autocomplete']");
	
	private By something = By.id("testing");

	public By autocompleteselection(String value) {
		return By.xpath("//div[@id='suggest_row1']//b[text()='"+value+"']");
	}
	
	public By getFrom() {
		return from;
	}
	public By getTo() {
		return to;
	}
	public By getDate() {
		return date;
	}
	public By getSearch() {
		return search;
	}
	
	public By getDateoverlay() {
		return dateoverlay;
	}
	public By getAutocomplete() {
		return autocomplete;
	}
	
	public void selecttodaydate(WebDriver driver,WebDriverWait wait) {
		driver.findElement(date).click();
		wait.until(ExpectedConditions.elementToBeClickable(todaydate)).click();
	}
	
}
