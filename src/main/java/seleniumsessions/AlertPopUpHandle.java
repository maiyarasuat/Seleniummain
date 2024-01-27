package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert - *simple , *confirm , *prompt
		
		//simple alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
		
		//confirm alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert2 = driver.switchTo().alert();
//		Thread.sleep(2000);
//		String text2 = alert2.getText();
//		System.out.println(text2);
//		alert2.accept();
		
		//prompt alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		String text3= alert3.getText();
		System.out.println(text3);
		Thread.sleep(1000);
		alert3.sendKeys("Test Automation");
		alert3.accept();
		Thread.sleep(1000);
		String mesg = driver.findElement(By.id("result")).getText();
		System.out.println(mesg);
		
		String actText = mesg.split(":")[1].trim();
		System.out.println(actText);
		
		
	}

}
