package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//1. Fetching window
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it =handles.iterator();
		
		String parentWindow = it.next();
		System.out.println("parent window id :" + parentWindow);
		
		String childWindow = it.next();
		System.out.println("child window id :" +childWindow);
		
		//switching
		
		driver.switchTo().window(childWindow);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl); 
		driver.close();
		
		driver.switchTo().window(parentWindow);
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		driver.quit();
		
		
		
		
		
		
		
	}

}
