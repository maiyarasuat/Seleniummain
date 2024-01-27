package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		JavaScriptUtil js = new JavaScriptUtil(driver);
		
		js.getTitleByJS();
		
		
		
		
		
	}
	

}
