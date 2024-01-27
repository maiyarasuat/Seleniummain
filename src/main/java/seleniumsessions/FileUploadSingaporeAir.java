package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadSingaporeAir {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/feedback-form/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("Feedback_block__section__pGmCt")).click();
		driver.findElement(By.xpath("//div[text()='My feedback is not related to a flight booking']")).click();

		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/maiyarasu/Documents/Terminal Saved Output.txt");
		
	}

}
