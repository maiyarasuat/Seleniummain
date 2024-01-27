package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTimeConcept {

	public static void main(String[] args) {

		//polling time/interval
		//dafault polling is 500ms(0.5secs)
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By first_Name = By.id("input-firstname");
		
		//3 parameter constructor(driver, duration(total wait), duration(interval/polling):
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(first_Name)).sendKeys("Naveen@mail");
		
		
		
		
		
	}

}
