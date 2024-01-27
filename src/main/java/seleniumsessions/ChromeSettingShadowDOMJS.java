package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettingShadowDOMJS {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		
		
		String script = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement searchKey_ele = (WebElement)js.executeScript(script);
		searchKey_ele.sendKeys("Cache setting");
		
		
	}

}
