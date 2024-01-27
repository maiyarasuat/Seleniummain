package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTest {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-in-south-africa-"
				+ "2023-24-1387592/south-africa-vs-india-1st-test-1387603/full-scorecard");
		
		String wicTakerName = driver.findElement
				(By.xpath("//span[text()='Virat Kohli']"
						+ "/ancestor::td/following-sibling::td/span/span")).getText();
		//System.out.println(wicTakerName);
		
		//get score details
		//xpath
		
		//span[text()='Virat Kohli']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]
		
		List<WebElement> scoreInfo = driver.findElements(By.xpath("//span[text()='Virat Kohli']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		for(WebElement e : scoreInfo) {
			String info = e.getText();
			System.out.println(info);
		}
	}

}
