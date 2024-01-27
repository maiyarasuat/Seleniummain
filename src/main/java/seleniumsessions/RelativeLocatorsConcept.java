package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class RelativeLocatorsConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement baseEle = driver.findElement(By.linkText("Kincardine, Canada"));
		
		driver.findElement(with(By.tagName(null)));
		
//		RelativeLocator.with(null);
		
		
		
		
		
		
	}

}
