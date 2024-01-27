package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type = file
		
		//mac
		driver.findElement(By.name("upfile")).sendKeys("/Users/maiyarasu/Documents/Terminal Saved Output.txt");
		
		//win
//		c:\\

	}

}
