package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {
	
	//implicit wait - Global wait
	//It is applicable for all the web elements
	//nullification of implicit wait

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //10
		
		driver.findElement(By.id("first name")); //10
		
		driver.findElement(By.name("q")); //10
		
		driver.findElement(By.className("svg")).sendKeys("scalar vector graphs"); //10
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //20
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); //0 nullification
		
	}

}
