package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithoutSelectMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		Thread.sleep(2000);

		By country = By.id("Form_getForm_Country");
		WebElement locator = driver.findElement(country);

		Select select = new Select(locator);
		List<WebElement> optionsLists = select.getOptions();

		for (WebElement e : optionsLists) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("India")) {
				e.click();
				break;
			}

		}

	}

}
