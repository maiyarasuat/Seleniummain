package seleniumsessions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselHandling {
	
	static WebDriver driver;

	public static void main(String[] args){

		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		
		String xpath = "//h2[text()='Recommended for you']/../../following-sibling::div//div[@data-qa='product-name']";
		String next_xpath = "//h2[text()='Recommended for you']/../../following-sibling::div//div[contains(@class,'swiper-button-next')]";
		List<WebElement> prodList = driver.findElements(By.xpath(xpath));
		//System.out.println(prodList.size());
		
		Set<String> prodSet = new HashSet<String>();
		
		while(driver.findElement(By.xpath(next_xpath)).getAttribute("class").contains("swiper-button-disabled")){
			
			for(WebElement e : prodList) {
				String title = e.getAttribute("data-qa");
				System.out.println(title);
			}
			
		driver.findElement(By.xpath(next_xpath)).click();	
			
			
			
		}
		
		
		
		
		
		
	}

}
