package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		By links = By.xpath("//div[@id='SIvCob']/a");
		
		clickOnElement(links, "தமிழ்");

	}

	public static void clickOnElement(By locator, String linkText) {
		List<WebElement> langLists = driver.findElements(locator);

		System.out.println("Total link size are :" + langLists.size());

		for (WebElement e : langLists) {
			String list = e.getText();
			System.out.println(list);
			if (list.equals("தமிழ்")) {
				e.click();
				break;
			}
		}
	}

}
