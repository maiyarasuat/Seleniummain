package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		// formula1:

		// htmltag[@attr='value']
		// htmltag[@attr1='value' and @attr2='value']
		// input[@name='username' and @placeholder='Username']

		// input[@name='username']

		By e1 = By.xpath("//input[@class='form-control private-form__control login-email']");
//		By e2 = By.className("login-email");
//		By e3 = By.className("form-control private-form__control login-email");

		driver.findElement(e1).sendKeys("naveen@gmail.com");
		
		
		//contains formula
		
		//htmltag[contains(@attr,'value')] //attribute value should in single quote
		//htmltag[@attr='value' and contains(@attr2,'value')]
		
		
		//text
		
		//htmltag[text()=value"]
		//span[text()='Trusted by 60,000+ businesses of all sizes']
		
		
		
		
		
		
		

	}

}
