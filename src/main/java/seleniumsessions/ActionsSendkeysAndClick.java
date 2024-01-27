package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendkeysAndClick {
	
	static WebDriver driver;
	static Actions act;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		Actions act = new Actions(driver);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailId = By.id("input-email");
		By passWord = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");

		act.sendKeys(driver.findElement(emailId), "naveen@gmail.com").perform();
		act.sendKeys(driver.findElement(passWord), "naveen123").perform();
		act.click(driver.findElement(loginBtn)).perform();

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doActionsClick(By locator) {
		act.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		act.sendKeys(getElement(locator), value).perform();
	}
	
	

}
