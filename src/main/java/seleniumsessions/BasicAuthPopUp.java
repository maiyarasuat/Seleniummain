package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {

	public static void main(String[] args) {

		String username = "admin";
		String password = "admin";
		
		WebDriver driver = new ChromeDriver();
		
		//1
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		//2
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//3
//		btoa("admin:admin");
//JS	btoa("admin:admin");
//		output- YWRtaW46YWRtaW4 (use encoder to decoder)
		
		
		
		
	}

}
