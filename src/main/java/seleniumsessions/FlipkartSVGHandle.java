package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSVGHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("Macbook pro");
		
		
		
		//svg element handle
		//1
		//sometimes normal click didnt work
		driver.findElement(By.xpath("//*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']")).click();
		
		//2
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']"))).click();
		
		
		
	}

}
