package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By first_Name = By.id("input-firstname");

		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
							
							  .withTimeout(Duration.ofSeconds(10))
							  .pollingEvery(Duration.ofSeconds(2))
							  .ignoring(NoSuchElementException.class)
							  .ignoring(StaleElementReferenceException.class)
							  .withMessage("element not found");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(first_Name)).sendKeys("naveen");
							  
							  
		
		
		
		
	}

}
