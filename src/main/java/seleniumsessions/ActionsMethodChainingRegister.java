package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {
	
	static WebDriver driver;
	static Actions act;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		act = new Actions(driver);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fn = By.id("input-firstname");
		WebElement fn1 = driver.findElement(fn);
		
		act.sendKeys(fn1, "naveen")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("Automation")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("naveen@gmail")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("9887876367")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("Naveen@123")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("Naveen@123")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.LEFT)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.SPACE)
		.sendKeys(Keys.TAB)
		.click()
		.build()
		.perform();
		
		}

}
