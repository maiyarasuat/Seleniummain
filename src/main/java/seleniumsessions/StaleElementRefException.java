package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement firstName = driver.findElement(By.id("input-email"));
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		firstName.sendKeys("naveen@mail.com");
	}

}
