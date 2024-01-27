package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandlingWithList {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		//convert Set into a List
		
		List<String> list = new ArrayList<String>(handles);
		String parentID = list.get(0);
		String childWindowId = list.get(1);
		
		System.out.println(parentID);
		System.out.println(childWindowId);
		
		//List -- List will maintain order, List will accept duplicates value
		//Set -- direct opposite of Set.

	}

}
