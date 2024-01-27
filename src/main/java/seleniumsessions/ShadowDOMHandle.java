package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		String script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//don't convert into toString() bcoz have to perform sendkeys so convert into webelement
		WebElement pizza_ele = (WebElement)js.executeScript(script);
		pizza_ele.sendKeys("Chicken Pizza");
		
		
		
	}

}
