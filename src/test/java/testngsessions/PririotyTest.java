package testngsessions;

import org.testng.annotations.Test;

public class PririotyTest {

	
	@Test(priority = 1 , invocationCount = 5)
	public void loginTest() {
		System.out.println("login - test");
	}
	
	
	
}
