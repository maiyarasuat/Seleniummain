package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SignatureActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/#google_vignette");
		
		Thread.sleep(5000);
		
		WebElement canvas = driver.findElement(By.id("signature-pad"));
		
		Actions act = new Actions(driver);
		
		 Action signature = act.click(canvas)
		 .moveToElement(canvas, 30, 10)
		 .clickAndHold(canvas)
		 .moveToElement(canvas, -200, -50)
		 .moveByOffset(30, 50)
		 .moveByOffset(-45, 45)
		 .moveByOffset(5, 5)
		 .release(canvas)
		 .build();
		 
		 signature.perform();
		
	}

}
